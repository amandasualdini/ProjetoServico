package com.br.service;

import com.br.model.Empresa;
import com.br.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public void save(Empresa empresa){
        empresaRepository.save(empresa);
    }

    public List<Empresa> findAll(){

        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(String id){

        return empresaRepository.findById(id);
    }

    public void delete(String id){

        empresaRepository.deleteById(id);
    }

}