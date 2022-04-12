package com.example.lynxlaststand.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.example.lynxlaststand.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.lynxlaststand.model.Client;

@Service
public class KafkaConsumerService {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @Autowired
    private ClientRepository clientRepository;

    @KafkaListener(topics = "client-log", groupId = "group-id", containerFactory = "clientKafkaListenerContainerFactory")
    public void consume(Client client) {

        // Operation to calculate the total spent for each client
        double totalSpent = client.getMntFishProducts() + client.getMntFruits() + client.getMntGoldProducts()
                + client.getMntGoldProducts() + client.getMntMeatProducts() + client.getMntSweetProducts()
                + client.getMntWines();

        // defining at Risk variable
        double atRisk = 0;

        // if statement to calculate if client is at financial risk
        if (client.getIncome() == 0) {
            atRisk = 0;
        } else {
            atRisk = (totalSpent / client.getIncome() * 2) * 100;
        }

        // if financial risk is over 40, AtRisk field is set to true
        if (atRisk > 40) {
            client.setAtRisk(true);
        }

        // if statement to filter for single clients, and to refactor the date to a different format
        if (client.getMaritalStatus().equals("Single")) {
            logger.info(String.format("Client create -> %s", client));

            String dateStr = client.getDate();
            LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            client.setDate(localDate.format(DateTimeFormatter.ofPattern("MMMM-dd-YYYY", Locale.ENGLISH)));

            clientRepository.save(client);

        }

    }
}
