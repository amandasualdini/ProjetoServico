package com.br.repository;

import  com.br.model.Prestador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends MongoRepository<Prestador, String> {
}
