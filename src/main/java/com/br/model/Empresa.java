package com.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Empresa {

    @Id
    private String _id;
    private String Nome;
    private String Telefone;
    private String Endereço;
    private Servico Servico;

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

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public com.br.model.Servico getServico() {
        return Servico;
    }

    public void setServico(com.br.model.Servico servico) {
        Servico = servico;
    }
}
