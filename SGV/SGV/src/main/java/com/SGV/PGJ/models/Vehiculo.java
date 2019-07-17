/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SGV.PGJ.models;


/**
 *
 * @author alejandro_barragán
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private String clase;
    private String tipo;
    private String no_serie;
    private String no_factura;
    private Double valor_factura;
    private String no_poliza;
    private Boolean estado;
    private String tipo_combustible;
    private Double kilometraje;
    private String id_adscripcion;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca,String modelo, String ano, String clase, String tipo, String no_serie, String no_factura, Double valor_factura, String no_poliza, Boolean estado, String tipo_combustible, Double kilometraje, String id_adscripcion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.clase = clase;
        this.tipo = tipo;
        this.no_serie = no_serie;
        this.no_factura = no_factura;
        this.valor_factura = valor_factura;
        this.no_poliza = no_poliza;
        this.estado = estado;
        this.tipo_combustible = tipo_combustible;
        this.kilometraje = kilometraje;
        this.id_adscripcion = id_adscripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNo_serie() {
        return no_serie;
    }

    public void setNo_serie(String no_serie) {
        this.no_serie = no_serie;
    }

    public String getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(String no_factura) {
        this.no_factura = no_factura;
    }

    public Double getValor_factura() {
        return valor_factura;
    }

    public void setValor_factura(Double valor_factura) {
        this.valor_factura = valor_factura;
    }

    public String getNo_poliza() {
        return no_poliza;
    }

    public void setNo_poliza(String no_poliza) {
        this.no_poliza = no_poliza;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getId_adscripcion() {
        return id_adscripcion;
    }

    public void setId_adscripcion(String id_adscripcion) {
        this.id_adscripcion = id_adscripcion;
    }
    
    
    
    
    
}
