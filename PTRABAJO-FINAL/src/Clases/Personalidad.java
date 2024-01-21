/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Personalidad {
    private String Cod_Personalidad;
    private String Personalidad;
    private String Observacion;

    /**
     * @return the Cod_Personalidad
     */
    public String getCod_Personalidad() {
        return Cod_Personalidad;
    }

    /**
     * @param Cod_Personalidad the Cod_Personalidad to set
     */
    public void setCod_Personalidad(String Cod_Personalidad) {
        this.Cod_Personalidad = Cod_Personalidad;
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

    public Personalidad(String Cod_Personalidad, String Personalidad, String Observacion) {
        this.Cod_Personalidad = Cod_Personalidad;
        this.Personalidad = Personalidad;
        this.Observacion = Observacion;
    }

    public Personalidad() {
    }

    @Override
    public String toString() {
        return "Personallidad{" + "Cod_Personalidad=" + Cod_Personalidad + ", Personalidad=" + Personalidad + ", Observacion=" + Observacion + '}';
    }
}
