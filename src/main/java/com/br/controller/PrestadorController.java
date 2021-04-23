package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Prestador;
import com.br.service.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class PrestadorController {

    @Autowired
    private PrestadorService prestadorService;

    @PostMapping(Constant.API_PRESTADOR)
    public void save(@RequestBody Prestador prestador){
        prestadorService.save(prestador);
    }

    @GetMapping(Constant.API_PRESTADOR)
    public List<Prestador> findAll(){
        return prestadorService.findAll();
    }

    @PutMapping(Constant.API_PRESTADOR)
    public void update (@RequestBody Prestador prestador){
        prestadorService.save(prestador);
    }

    @DeleteMapping(Constant.API_PRESTADOR + "/{id}")
    public void delete(@PathVariable("id") String id){
        prestadorService.delete(id);
    }

    @GetMapping(Constant.API_PRESTADOR + "/{id}")
    public Optional<Prestador> findById(@PathVariable("id") String id){
        return prestadorService.findById(id);
    }
}
