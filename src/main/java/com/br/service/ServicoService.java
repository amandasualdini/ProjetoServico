package com.br.service;

import com.br.model.Servico;
import com.br.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public void save(Servico servico){
        servicoRepository.save(servico);
    }

    public List<Servico> findAll(){

        return servicoRepository.findAll();
    }

    public Optional<Servico> findById(String id){

        return servicoRepository.findById(id);
    }

    public void delete(String id){

        servicoRepository.deleteById(id);
    }

}