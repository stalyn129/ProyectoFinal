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
    private String cod_repre;
    private String cod_cedula;
    private String cod_parentesco;
    private String profesion;
    private String Ocupacion;

    public Representante() {
    }

    public Representante(String cod_repre, String cod_cedula, String cod_parentesco, String profesion, String Ocupacion) {
        this.cod_repre = cod_repre;
        this.cod_cedula = cod_cedula;
        this.cod_parentesco = cod_parentesco;
        this.profesion = profesion;
        this.Ocupacion = Ocupacion;
    }

    @Override
    public String toString() {
        return "Representante{" + "cod_repre=" + cod_repre + ", cod_cedula=" + cod_cedula + ", cod_parentesco=" + cod_parentesco + ", profesion=" + profesion + ", Ocupacion=" + Ocupacion + '}';
    }

    
    /**
     * @return the cod_repre
     */
    public String getCod_repre() {
        return cod_repre;
    }

    /**
     * @param cod_repre the cod_repre to set
     */
    public void setCod_repre(String cod_repre) {
        this.cod_repre = cod_repre;
    }

    /**
     * @return the cod_cedula
     */
    public String getCod_cedula() {
        return cod_cedula;
    }

    /**
     * @param cod_cedula the cod_cedula to set
     */
    public void setCod_cedula(String cod_cedula) {
        this.cod_cedula = cod_cedula;
    }

    /**
     * @return the cod_parentesco
     */
    public String getCod_parentesco() {
        return cod_parentesco;
    }

    /**
     * @param cod_parentesco the cod_parentesco to set
     */
    public void setCod_parentesco(String cod_parentesco) {
        this.cod_parentesco = cod_parentesco;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the Ocupacion
     */
    public String getOcupacion() {
        return Ocupacion;
    }

    /**
     * @param Ocupacion the Ocupacion to set
     */
    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }
}
