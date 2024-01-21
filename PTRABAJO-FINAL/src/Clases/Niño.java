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
    private String Apodo;

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Sexo_Niño
     */
    public char getSexo_Niño() {
        return Sexo_Niño;
    }

    /**
     * @param Sexo_Niño the Sexo_Niño to set
     */
    public void setSexo_Niño(char Sexo_Niño) {
        this.Sexo_Niño = Sexo_Niño;
    }

    /**
     * @return the Fecha_Nacimiento
     */
    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    /**
     * @param Fecha_Nacimiento the Fecha_Nacimiento to set
     */
    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    /**
     * @return the Personalidad
     */
    public String getPersonalidad() {
        return Personalidad;
    }

    /**
     * @param Personalidad the Personalidad to set
     */
    public void setPersonalidad(String Personalidad) {
        this.Personalidad = Personalidad;
    }

    /**
     * @return the Discapacidad
     */
    public String getDiscapacidad() {
        return Discapacidad;
    }

    /**
     * @param Discapacidad the Discapacidad to set
     */
    public void setDiscapacidad(String Discapacidad) {
        this.Discapacidad = Discapacidad;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Apodo
     */
    public String getApodo() {
        return Apodo;
    }

    /**
     * @param Apodo the Apodo to set
     */
    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public Niño(String Nombre, String Apellido, char Sexo_Niño, Date Fecha_Nacimiento, String Personalidad, String Discapacidad, String Usuario, String Contraseña, String Apodo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo_Niño = Sexo_Niño;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Personalidad = Personalidad;
        this.Discapacidad = Discapacidad;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Apodo = Apodo;
    }

    public Niño() {
    }

    @Override
    public String toString() {
        return "Ni\u00f1o{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Sexo_Ni\u00f1o=" + Sexo_Niño + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Personalidad=" + Personalidad + ", Discapacidad=" + Discapacidad + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Apodo=" + Apodo + '}';
    }

   
}
