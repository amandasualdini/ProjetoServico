package com.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Agenda {

    @Id
    private String _id;
    private String Data;
    private String Hora;
    private Cliente Cliente;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public com.br.model.Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(com.br.model.Cliente cliente) {
        Cliente = cliente;
    }
}
