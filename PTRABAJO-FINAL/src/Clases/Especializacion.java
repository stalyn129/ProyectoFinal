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
public class Especializacion {
    private String Cod_Especializacion;
    private String Especializacion;

    public Especializacion() {
    }

    public Especializacion(String Cod_Especializacion, String Especializacion) {
        this.Cod_Especializacion = Cod_Especializacion;
        this.Especializacion = Especializacion;
    }

    public String getCod_Especializacion() {
        return Cod_Especializacion;
    }

    public void setCod_Especializacion(String Cod_Especializacion) {
        this.Cod_Especializacion = Cod_Especializacion;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }
    
    
}
