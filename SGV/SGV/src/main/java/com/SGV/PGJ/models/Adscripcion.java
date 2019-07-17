package com.SGV.PGJ.models;

public class Adscripcion {
    
        private String id_adscripcion;
        private String nombre_adscripcion;
        private String calle;
        private String numero;
        private String alcaldia;
        private String codigo_postal;
        private String entidad;
        
    
    
    
    public Adscripcion() {
    }

    public Adscripcion(String id_adscripcion, String nombre_adscripcion, String calle, String numero, String alcaldia, String codigo_postal, String entidad) {
        this.id_adscripcion = id_adscripcion;
        this.nombre_adscripcion = nombre_adscripcion;
        this.calle = calle;
        this.numero = numero;
        this.alcaldia = alcaldia;
        this.codigo_postal = codigo_postal;
        this.entidad = entidad;
    }

    public Adscripcion(String nombre_adscripcion) {
        this.nombre_adscripcion = nombre_adscripcion;
    }
    
    
    
    public String getId_adscripcion() {
        return id_adscripcion;
    }

    public void setId_adscripcion(String id_adscripcion) {
        this.id_adscripcion = id_adscripcion;
    }

    public String getNombre_adscripcion() {
        return nombre_adscripcion;
    }

    public void setNombre_adscripcion(String nombre_adscripcion) {
        this.nombre_adscripcion = nombre_adscripcion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    
    
}


