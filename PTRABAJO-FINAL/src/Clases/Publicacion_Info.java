/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Joel
 */
public class Publicacion_Info {
    private String Cod_Publicacion;
    private String FK_Cod_Psicologo;
    private String FK_Cod_Informacion;
    private Date Fecha_Publicacion;

    public Publicacion_Info() {
    }

    public Publicacion_Info(String Cod_Publicacion, String FK_Cod_Psicologo, String FK_Cod_Informacion, Date Fecha_Publicacion) {
        this.Cod_Publicacion = Cod_Publicacion;
        this.FK_Cod_Psicologo = FK_Cod_Psicologo;
        this.FK_Cod_Informacion = FK_Cod_Informacion;
        this.Fecha_Publicacion = Fecha_Publicacion;
    }

    @Override
    public String toString() {
        return "Publicacion_Info{" + "Cod_Publicacion=" + Cod_Publicacion + ", FK_Cod_Psicologo=" + FK_Cod_Psicologo + ", FK_Cod_Informacion=" + FK_Cod_Informacion + ", Fecha_Publicacion=" + Fecha_Publicacion + '}';
    }

    
    public String getCod_Publicacion() {
        return Cod_Publicacion;
    }

    public void setCod_Publicacion(String Cod_Publicacion) {
        this.Cod_Publicacion = Cod_Publicacion;
    }

    public String getFK_Cod_Psicologo() {
        return FK_Cod_Psicologo;
    }

    public void setFK_Cod_Psicologo(String FK_Cod_Psicologo) {
        this.FK_Cod_Psicologo = FK_Cod_Psicologo;
    }

    public String getFK_Cod_Informacion() {
        return FK_Cod_Informacion;
    }

    public void setFK_Cod_Informacion(String FK_Cod_Informacion) {
        this.FK_Cod_Informacion = FK_Cod_Informacion;
    }

    public Date getFecha_Publicacion() {
        return Fecha_Publicacion;
    }

    public void setFecha_Publicacion(Date Fecha_Publicacion) {
        this.Fecha_Publicacion = Fecha_Publicacion;
    }
 
}
