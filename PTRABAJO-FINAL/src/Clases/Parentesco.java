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
public class Parentesco {
    private String Cod_Parentesco;
    private String Parentesco;
    private String Observacion;

    /**
     * @return the Cod_Parentesco
     */
    public String getCod_Parentesco() {
        return Cod_Parentesco;
    }

    /**
     * @param Cod_Parentesco the Cod_Parentesco to set
     */
    public void setCod_Parentesco(String Cod_Parentesco) {
        this.Cod_Parentesco = Cod_Parentesco;
    }

    /**
     * @return the Parentesco
     */
    public String getParentesco() {
        return Parentesco;
    }

    /**
     * @param Parentesco the Parentesco to set
     */
    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
    }

    /**
     * @return the Observacion
     */
    public String getObservacion() {
        return Observacion;
    }

    /**
     * @param Observacion the Observacion to set
     */
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public Parentesco(String Cod_Parentesco, String Parentesco, String Observacion) {
        this.Cod_Parentesco = Cod_Parentesco;
        this.Parentesco = Parentesco;
        this.Observacion = Observacion;
    }

    public Parentesco() {
    }

    @Override
    public String toString() {
        return "Parentesco{" + "Cod_Parentesco=" + Cod_Parentesco + ", Parentesco=" + Parentesco + ", Observacion=" + Observacion + '}';
    }
       
}
