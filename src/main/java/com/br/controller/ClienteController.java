package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Cliente;
import com.br.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(Constant.API_CLIENTE)
    public void save(@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }

    @GetMapping(Constant.API_CLIENTE)
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PutMapping(Constant.API_CLIENTE)
    public void update (@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }

    @DeleteMapping(Constant.API_CLIENTE + "/{id}")
    public void delete(@PathVariable("id") String id){
        clienteService.delete(id);
    }

    @GetMapping(Constant.API_CLIENTE + "/{id}")
    public Optional<Cliente> findById(@PathVariable("id") String id){
        return clienteService.findById(id);
    }
}
