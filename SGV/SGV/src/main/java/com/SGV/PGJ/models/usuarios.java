package com.SGV.PGJ.models;

public class usuarios {

	private String no_empleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String id_adscripcion;
    private boolean tipo_usuario;
    private String contrasena;
    
    public usuarios() {
    }

    public usuarios(String no_empleado, String nombre, String apellido1, String apellido2, String id_adscripcion, boolean tipo_usuario, String contrasena) {
        this.no_empleado = no_empleado;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.id_adscripcion = id_adscripcion;
        this.tipo_usuario = tipo_usuario;
        this.contrasena = contrasena;
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

    public String getapellido1() {
        return apellido1;
    }

    public void setapellido1(String ap_paterno) {
        this.apellido1 = ap_paterno;
    }

    public String getapellido2() {
        return apellido2;
    }

    public void setapellido2(String ap_materno) {
        this.apellido2 = ap_materno;
    }

    public String getId_adscripcion() {
        return id_adscripcion;
    }

    public void setId_adscripcion(String id_adscripcion) {
        this.id_adscripcion = id_adscripcion;
    }

    public boolean isTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(boolean tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

}
