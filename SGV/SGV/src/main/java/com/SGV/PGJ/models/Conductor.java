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
public class Conductor {
    private String no_empleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String id_adscripcion;

    public Conductor() {
    }

    public Conductor(String no_empleado, String nombre, String apellido1, String apellido2, String id_adscripcion) {
        this.no_empleado = no_empleado;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.id_adscripcion = id_adscripcion;
    }

    public String getNo_empleado() {
        return no_empleado;
    }

    public void setNo_empleado(String no_empleado) {
        this.no_empleado = no_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getId_adscripcion() {
        return id_adscripcion;
    }

    public void setId_adscripcion(String id_adscripcion) {
        this.id_adscripcion = id_adscripcion;
    }
    
    
    
}
