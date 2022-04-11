package com.example.lynxlaststand.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.lynxlaststand.model.Client;

@Service
public class KafkaConsumerService {

	private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

	@KafkaListener(topics = "client-log", groupId = "group-id", containerFactory = "clientKafkaListenerContainerFactory")
	public void consume(Client client) {

		double totalSpent = client.getMntFishProducts() + client.getMntFruits() + client.getMntGoldProducts()
				+ client.getMntGoldProducts() + client.getMntMeatProducts() + client.getMntSweetProducts()
				+ client.getMntWines();

		double atRisk = 0;

		if (client.getIncome() == 0) {
			atRisk = 0;
		} else {
			atRisk = (totalSpent / client.getIncome() * 2) * 100;
		}
		
		/*
		 * change date format
		 */
		
		String dateStr = client.getDate();

		LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

		System.out.println(localDate);

		System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMMM-dd-YYYY", Locale.ENGLISH)));

		/*
		 * at risk
		 */

		if (atRisk > 40) {

			logger.info(String.format("Client create -> %s", client.getDate()));

		}

		/*
		 * if single
		 */

		if (client.getMaritalStatus().equals("Single")) {
			logger.info(String.format("Client create -> %s", client));
		}

	}
}
