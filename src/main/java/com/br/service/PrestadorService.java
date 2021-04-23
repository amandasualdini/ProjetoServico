package com.br.service;

import com.br.model.Prestador;
import com.br.repository.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestadorService {

    @Autowired
    private PrestadorRepository prestadorRepository;

    public void save(Prestador prestador){
        prestadorRepository.save(prestador);
    }

    public List<Prestador> findAll(){

        return prestadorRepository.findAll();
    }

    public Optional<Prestador> findById(String id){

        return prestadorRepository.findById(id);
    }

    public void delete(String id){

        prestadorRepository.deleteById(id);
    }

}