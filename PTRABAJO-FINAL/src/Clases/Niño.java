/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Joel
 */
public class Niño {
    private String Cod_Niño;
    private String Nombre;
    private String Apellido;
    private char Sexo_Niño;
    private Date Fecha_Nacimiento;
    private String Personalidad;
    private String Discapacidad;
    private String Apodo;
    private String Usuario;
    private String Contraseña;
    private boolean Estado;

    public Niño() {
    }

    public Niño(String Cod_Niño, String Nombre, String Apellido, char Sexo_Niño, Date Fecha_Nacimiento, String Personalidad, String Discapacidad, String Apodo, String Usuario, String Contraseña, boolean Estado) {
        this.Cod_Niño = Cod_Niño;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo_Niño = Sexo_Niño;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Personalidad = Personalidad;
        this.Discapacidad = Discapacidad;
        this.Apodo = Apodo;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Estado = Estado;
    }

    public String getCod_Niño() {
        return Cod_Niño;
    }

    public void setCod_Niño(String Cod_Niño) {
        this.Cod_Niño = Cod_Niño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public char getSexo_Niño() {
        return Sexo_Niño;
    }

    public void setSexo_Niño(char Sexo_Niño) {
        this.Sexo_Niño = Sexo_Niño;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getPersonalidad() {
        return Personalidad;
    }

    public void setPersonalidad(String Personalidad) {
        this.Personalidad = Personalidad;
    }

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public void setDiscapacidad(String Discapacidad) {
        this.Discapacidad = Discapacidad;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    
}

    