/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alexa
 */
public class Representante {
    private String Cod_Repre;
    private String FKCod_Cedula;
    private String FKCod_parentesco;
    private String FKProfesion;
    private String Ocupacion;

    public Representante() {
    }

    public Representante(String Cod_Repre, String FKCod_Cedula, String FKCod_parentesco, String FKProfesion, String Ocupacion) {
        this.Cod_Repre = Cod_Repre;
        this.FKCod_Cedula = FKCod_Cedula;
        this.FKCod_parentesco = FKCod_parentesco;
        this.FKProfesion = FKProfesion;
        this.Ocupacion = Ocupacion;
    }

    public String getCod_Repre() {
        return Cod_Repre;
    }

    public void setCod_Repre(String Cod_Repre) {
        this.Cod_Repre = Cod_Repre;
    }

    public String getFKCod_Cedula() {
        return FKCod_Cedula;
    }

    public void setFKCod_Cedula(String FKCod_Cedula) {
        this.FKCod_Cedula = FKCod_Cedula;
    }

    public String getFKCod_parentesco() {
        return FKCod_parentesco;
    }

    public void setFKCod_parentesco(String FKCod_parentesco) {
        this.FKCod_parentesco = FKCod_parentesco;
    }

    public String getFKProfesion() {
        return FKProfesion;
    }

    public void setFKProfesion(String FKProfesion) {
        this.FKProfesion = FKProfesion;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    @Override
    public String toString() {
        return "Representante{" + "Cod_Repre=" + Cod_Repre + ", FKCod_Cedula=" + FKCod_Cedula + ", FKCod_parentesco=" + FKCod_parentesco + ", FKProfesion=" + FKProfesion + ", Ocupacion=" + Ocupacion + '}';
    }

    
}
