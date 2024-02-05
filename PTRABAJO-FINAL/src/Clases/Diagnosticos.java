/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class Diagnosticos {
    private String Cod_Diagnostico;
    private String FkCod_Peticion;
    private String FkCod_Psicologo;
    private Date fecha_diag;
    private int Number_diag;
    private String Estado_diag;

    public Diagnosticos() {
    }

    public Diagnosticos(String Cod_Diagnostico, String FkCod_Peticion, String FkCod_Psicologo, Date fecha_diag, int Number_diag, String Estado_diag) {
        this.Cod_Diagnostico = Cod_Diagnostico;
        this.FkCod_Peticion = FkCod_Peticion;
        this.FkCod_Psicologo = FkCod_Psicologo;
        this.fecha_diag = fecha_diag;
        this.Number_diag = Number_diag;
        this.Estado_diag = Estado_diag;
    }

    public String getFkCod_Psicologo() {
        return FkCod_Psicologo;
    }

    public void setFkCod_Psicologo(String FkCod_Psicologo) {
        this.FkCod_Psicologo = FkCod_Psicologo;
    }

 

    
    
    
    /**
     * @return the Cod_Diagnostico
     */
    public String getCod_Diagnostico() {
        return Cod_Diagnostico;
    }

    /**
     * @param Cod_Diagnostico the Cod_Diagnostico to set
     */
    public void setCod_Diagnostico(String Cod_Diagnostico) {
        this.Cod_Diagnostico = Cod_Diagnostico;
    }

    /**
     * @return the FkCod_Peticion
     */
    public String getFkCod_Peticion() {
        return FkCod_Peticion;
    }

    /**
     * @param FkCod_Peticion the FkCod_Peticion to set
     */
    public void setFkCod_Peticion(String FkCod_Peticion) {
        this.FkCod_Peticion = FkCod_Peticion;
    }

    /**
     * @return the fecha_diag
     */
    public Date getFecha_diag() {
        return fecha_diag;
    }

    /**
     * @param fecha_diag the fecha_diag to set
     */
    public void setFecha_diag(Date fecha_diag) {
        this.fecha_diag = fecha_diag;
    }

    /**
     * @return the Number_diag
     */
    public int getNumber_diag() {
        return Number_diag;
    }

    /**
     * @param Number_diag the Number_diag to set
     */
    public void setNumber_diag(int Number_diag) {
        this.Number_diag = Number_diag;
    }

    /**
     * @return the Estado_diag
     */
    public String getEstado_diag() {
        return Estado_diag;
    }

    /**
     * @param Estado_diag the Estado_diag to set
     */
    public void setEstado_diag(String Estado_diag) {
        this.Estado_diag = Estado_diag;
    }
    
}
