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
public class Administrador extends Persona {
    private String ID_Admin;
    private String Puesto;
    private int Años_Experiencia;
    private final String TokenIngreso = "A5D2M3I4N";

    public Administrador() {
        super();
    }

    public Administrador(String ID_Admin, String Puesto, int Años_Experiencia) {
        this.ID_Admin = ID_Admin;
        this.Puesto = Puesto;
        this.Años_Experiencia = Años_Experiencia;
    }

    public Administrador(String ID_Admin, String Puesto, int Años_Experiencia, String Cedula, String Nombre, String Apellido, String Direccion, Date Fecha_Nacimiento, char Sexo, String Nacionalidad, String Email, String Discapacidad, String Usuario, String Contraseña, String Telefono) {
        super(Cedula, Nombre, Apellido, Direccion, Fecha_Nacimiento, Sexo, Nacionalidad, Email, Discapacidad, Usuario, Contraseña, Telefono);
        this.ID_Admin = ID_Admin;
        this.Puesto = Puesto;
        this.Años_Experiencia = Años_Experiencia;
    }

    public String getID_Admin() {
        return ID_Admin;
    }

    public void setID_Admin(String ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getAños_Experiencia() {
        return Años_Experiencia;
    }

    public void setAños_Experiencia(int Años_Experiencia) {
        this.Años_Experiencia = Años_Experiencia;
    }

    @Override
    public String toString() {
        return "Administrador{" + "ID_Admin=" + ID_Admin + ", Puesto=" + Puesto + ", A\u00f1os_Experiencia=" + Años_Experiencia + ", TokenIngreso=" + TokenIngreso + '}';
    }
 
    
    
}
