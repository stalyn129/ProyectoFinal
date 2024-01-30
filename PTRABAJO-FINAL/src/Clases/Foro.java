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
public class Foro {
    private String Cod_Foro;
    private String Titulo_Foro;
    private String Descripcion;
    private Date Fecha_Creacion;

    public Foro() {
    }

    public Foro(String Cod_Foro, String Titulo_Foro, String Descripcion, Date Fecha_Creacion) {
        this.Cod_Foro = Cod_Foro;
        this.Titulo_Foro = Titulo_Foro;
        this.Descripcion = Descripcion;
        this.Fecha_Creacion = Fecha_Creacion;
    }

    public String getCod_Foro() {
        return Cod_Foro;
    }

    public void setCod_Foro(String Cod_Foro) {
        this.Cod_Foro = Cod_Foro;
    }

    public String getTitulo_Foro() {
        return Titulo_Foro;
    }

    public void setTitulo_Foro(String Titulo_Foro) {
        this.Titulo_Foro = Titulo_Foro;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date Fecha_Creacion) {
        this.Fecha_Creacion = Fecha_Creacion;
    }

    @Override
    public String toString() {
        return "Foro{" + "Cod_Foro=" + Cod_Foro + ", Titulo_Foro=" + Titulo_Foro + ", Descripcion=" + Descripcion + ", Fecha_Creacion=" + Fecha_Creacion + '}';
    }
      
}
