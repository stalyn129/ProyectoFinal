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
    private String Nombre;
    private String Apellido;
    private char Sexo_Niño;
    private Date Fecha_Nacimiento;
    private String Personalidad;
    private String Discapacidad;
    private String Usuario;
    private String Contraseña;

    public Niño() {
    }
////////////////////////////////////////////
    public Niño(String Nombre, String Apellido, char Sexo_Niño, Date Fecha_Nacimiento, String Personalidad, String Discapacidad, String Usuario, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo_Niño = Sexo_Niño;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Personalidad = Personalidad;
        this.Discapacidad = Discapacidad;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
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

    @Override
    public String toString() {
        return "Ni\u00f1o{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Sexo_Ni\u00f1o=" + Sexo_Niño + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Personalidad=" + Personalidad + ", Discapacidad=" + Discapacidad + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
    
    
}
