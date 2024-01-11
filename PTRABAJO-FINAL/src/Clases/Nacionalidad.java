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
public class Nacionalidad {
     private String Cod_Nacionalidad;
    private String Nacionalidad;
    private String Pais_Origen;
    private String Observacion;

    public Nacionalidad() {
    }

    public Nacionalidad(String Cod_Nacionalidad, String Nacionalidad, String Pais_Origen, String Observacion) {
        this.Cod_Nacionalidad = Cod_Nacionalidad;
        this.Nacionalidad = Nacionalidad;
        this.Pais_Origen = Pais_Origen;
        this.Observacion = Observacion;
    }

    public String getCod_Nacionalidad() {
        return Cod_Nacionalidad;
    }

    public void setCod_Nacionalidad(String Cod_Nacionalidad) {
        this.Cod_Nacionalidad = Cod_Nacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    @Override
    public String toString() {
        return "Nacionalidad{" + "Cod_Nacionalidad=" + Cod_Nacionalidad + ", Nacionalidad=" + Nacionalidad + ", Pais_Origen=" + Pais_Origen + ", Observacion=" + Observacion + '}';
    }
}
