package com.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Prestador {
    @Id
    private String _id;
    private String Nome;
    private String Telefone;
    private Empresa Empresa;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public com.br.model.Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(com.br.model.Empresa empresa) {
        Empresa = empresa;
    }
}
