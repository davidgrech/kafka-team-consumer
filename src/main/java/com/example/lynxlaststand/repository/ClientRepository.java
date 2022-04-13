package com.example.lynxlaststand.repository;

import com.example.lynxlaststand.model.Client;
import com.example.lynxlaststand.model.CuratedClient;
import org.springframework.data.mongodb.repository.MongoRepository;




public interface ClientRepository extends MongoRepository<CuratedClient, String> {
}
