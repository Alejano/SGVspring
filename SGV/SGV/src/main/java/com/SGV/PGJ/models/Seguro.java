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
public class Seguro {
    private String poliza;
    private String aseguradora;
    private String cobertura;

    public Seguro() {
    }

    public Seguro(String poliza, String aseguradora, String cobertura) {
        this.poliza = poliza;
        this.aseguradora = aseguradora;
        this.cobertura = cobertura;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    
    
}
