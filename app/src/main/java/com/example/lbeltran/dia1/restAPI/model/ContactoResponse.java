package com.example.lbeltran.dia1.restAPI.model;


import com.example.lbeltran.dia1.pojo.Contacto;

import java.util.ArrayList;


public class ContactoResponse {

    ArrayList<Contacto> contactos;

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
}
