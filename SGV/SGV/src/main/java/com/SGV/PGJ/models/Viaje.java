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
public class Viaje {
    
    private String id_viaje;
    private String no_chofer;
    private String fecha_salida;
    private String fecha_regreso;
    private String kilometraje_inicial;
    private String kilometraje_final;
    private String distancia_recorrida;
    private String placa;
    private String destino;

    public Viaje() {
    }

    public Viaje(String id_viaje, String no_chofer, String fecha_salida, String fecha_regreso, String kilometraje_inicial, String kilometraje_final, String distancia_recorrida, String placa, String destino) {
        this.id_viaje = id_viaje;
        this.no_chofer = no_chofer;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.kilometraje_inicial = kilometraje_inicial;
        this.kilometraje_final = kilometraje_final;
        this.distancia_recorrida = distancia_recorrida;
        this.placa = placa;
        this.destino = destino;
    }

    public String getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(String id_viaje) {
        this.id_viaje = id_viaje;
    }

    public String getNo_chofer() {
        return no_chofer;
    }

    public void setNo_chofer(String no_chofer) {
        this.no_chofer = no_chofer;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(String fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public String getKilometraje_inicial() {
        return kilometraje_inicial;
    }

    public void setKilometraje_inicial(String kilometraje_inicial) {
        this.kilometraje_inicial = kilometraje_inicial;
    }

    public String getKilometraje_final() {
        return kilometraje_final;
    }

    public void setKilometraje_final(String kilometraje_final) {
        this.kilometraje_final = kilometraje_final;
    }

    public String getDistancia_recorrida() {
        return distancia_recorrida;
    }

    public void setDistancia_recorrida(String distancia_recorrida) {
        this.distancia_recorrida = distancia_recorrida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
    
}
