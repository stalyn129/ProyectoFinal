/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

//Hola amigos
public class Administrador {
    private String ID_Admin;
    private String FK_Cedula;
    private String Puesto;
    private int Años_Experiencia;
    private final String TokenIngreso = "A5D2M3I4N";

    public Administrador() {
    }

    public Administrador(String ID_Admin, String FK_Cedula, String Puesto, int Años_Experiencia) {
        this.ID_Admin = ID_Admin;
        this.FK_Cedula = FK_Cedula;
        this.Puesto = Puesto;
        this.Años_Experiencia = Años_Experiencia;
    }

    public String getID_Admin() {
        return ID_Admin;
    }

    public void setID_Admin(String ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    public String getFK_Cedula() {
        return FK_Cedula;
    }

    public void setFK_Cedula(String FK_Cedula) {
        this.FK_Cedula = FK_Cedula;
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
        return "Administrador{" + "ID_Admin=" + ID_Admin + ", FK_Cedula=" + FK_Cedula + ", Puesto=" + Puesto + ", A\u00f1os_Experiencia=" + Años_Experiencia + ", TokenIngreso=" + TokenIngreso + '}';
    }
    
  
}
