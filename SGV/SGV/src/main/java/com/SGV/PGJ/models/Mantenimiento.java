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
public class Mantenimiento {
        private String id_mantenimiento;
        private String placa;
        private String kilometraje;
        private String costo_mantenimiento;
        private String siniestro;
        private String fecha_ingreso;
        private String fecha_entrega;
        private String observaciones;

    public Mantenimiento() {
    }

    public Mantenimiento(String id_mantenimiento, String placa, String kilometraje, String costo_mantenimiento, String siniestro, String fecha_ingreso, String fecha_entrega, String observaciones) {
        this.id_mantenimiento = id_mantenimiento;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.costo_mantenimiento = costo_mantenimiento;
        this.siniestro = siniestro;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_entrega = fecha_entrega;
        this.observaciones = observaciones;
    }

        
    public String getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(String id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getCosto_mantenimiento() {
        return costo_mantenimiento;
    }

    public void setCosto_mantenimiento(String costo_mantenimiento) {
        this.costo_mantenimiento = costo_mantenimiento;
    }

    public String getSiniestro() {
        return siniestro;
    }

    public void setSiniestro(String siniestro) {
        this.siniestro = siniestro;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
        
        
    
}
