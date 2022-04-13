package com.example.lynxlaststand.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.lynxlaststand.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {
	


}

