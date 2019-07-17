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
public class Combustible {
    
    private String id_asignacion;
    private String placa;
    private String mes;
    private String ano;
    private String presupuesto;

    public Combustible() {
    }

    public Combustible(String id_asignacion, String placa, String mes, String ano, String presupuesto) {
        this.id_asignacion = id_asignacion;
        this.placa = placa;
        this.mes = mes;
        this.ano = ano;
        this.presupuesto = presupuesto;
    }

    
    public String getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(String id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
    
    
}
