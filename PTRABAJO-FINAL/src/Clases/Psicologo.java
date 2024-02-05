/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Joel
 */
public class Psicologo {
    private String Cod_Psicologo;
    private String FK_Cedula;
    private String FK_Cod_Especialidad;
    private int Años_Experiencia;
     private String Codigo_vinculacion;

    public Psicologo() {
    }

    public Psicologo(String Cod_Psicologo, String FK_Cedula, String FK_Cod_Especialidad, int Años_Experiencia, String Codigo_vinculacion) {
        this.Cod_Psicologo = Cod_Psicologo;
        this.FK_Cedula = FK_Cedula;
        this.FK_Cod_Especialidad = FK_Cod_Especialidad;
        this.Años_Experiencia = Años_Experiencia;
        this.Codigo_vinculacion = Codigo_vinculacion;
    }

    public String getCod_Psicologo() {
        return Cod_Psicologo;
    }

    public void setCod_Psicologo(String Cod_Psicologo) {
        this.Cod_Psicologo = Cod_Psicologo;
    }

    public String getFK_Cedula() {
        return FK_Cedula;
    }

    public void setFK_Cedula(String FK_Cedula) {
        this.FK_Cedula = FK_Cedula;
    }

    public String getFK_Cod_Especialidad() {
        return FK_Cod_Especialidad;
    }

    public void setFK_Cod_Especialidad(String FK_Cod_Especialidad) {
        this.FK_Cod_Especialidad = FK_Cod_Especialidad;
    }

    public int getAños_Experiencia() {
        return Años_Experiencia;
    }

    public void setAños_Experiencia(int Años_Experiencia) {
        this.Años_Experiencia = Años_Experiencia;
    }

    public String getCodigo_vinculacion() {
        return Codigo_vinculacion;
    }

    public void setCodigo_vinculacion(String Codigo_vinculacion) {
        this.Codigo_vinculacion = Codigo_vinculacion;
    }

    
}
