package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Servico;
import com.br.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping(Constant.API_SERVICO)
    public void save(@RequestBody Servico servico){
        servicoService.save(servico);
    }

    @GetMapping(Constant.API_SERVICO)
    public List<Servico> findAll(){
        return servicoService.findAll();
    }

    @PutMapping(Constant.API_SERVICO)
    public void update (@RequestBody Servico servico){
        servicoService.save(servico);
    }

    @DeleteMapping(Constant.API_SERVICO + "/{id}")
    public void delete(@PathVariable("id") String id){
        servicoService.delete(id);
    }

    @GetMapping(Constant.API_SERVICO + "/{id}")
    public Optional<Servico> findById(@PathVariable("id") String id){
        return servicoService.findById(id);
    }
}
