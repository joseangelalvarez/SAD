package com.example.sad.data;

import java.util.UUID;

public class Empresa {
    private String id;
    private String nombre;
    private String domicilio;
    private String localidad;
    private String nif;
    private String telefono;

    public Empresa(String id, String nombre, String domicilio, String localidad, String nif, String telefono) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.nif = nif;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
