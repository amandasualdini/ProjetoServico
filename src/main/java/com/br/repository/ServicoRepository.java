package com.br.repository;

import  com.br.model.Servico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends MongoRepository<Servico, String> {
}
