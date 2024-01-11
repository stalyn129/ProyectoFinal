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
public class Discapacidad {

    private String Cod_Discapacidad;
    private String Tipo_Discapacidad;
    private String Observacion;

    public Discapacidad() {
    }
    
    public Discapacidad(String Cod_Discapacidad, String Tipo_Discapacidad, String Observacion) {
        this.Cod_Discapacidad = Cod_Discapacidad;
        this.Tipo_Discapacidad = Tipo_Discapacidad;
        this.Observacion = Observacion;
    }

    public String getCod_Discapacidad() {
        return Cod_Discapacidad;
    }

    public void setCod_Discapacidad(String Cod_Discapacidad) {
        this.Cod_Discapacidad = Cod_Discapacidad;
    }

    public String getTipo_Discapacidad() {
        return Tipo_Discapacidad;
    }

    public void setTipo_Discapacidad(String Tipo_Discapacidad) {
        this.Tipo_Discapacidad = Tipo_Discapacidad;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
}
