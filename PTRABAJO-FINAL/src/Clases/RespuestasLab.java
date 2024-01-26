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
public class RespuestasLab {
    private String ID_Respuesta;
    private String FK_Cod_Niño;
    private String FK_Cod_Minijuego;
    private int Puntuacion;
    private Date Fecha_Jugado;

    public RespuestasLab() {
    }

    public RespuestasLab(String ID_Respuesta, String FK_Cod_Niño, String FK_Cod_Minijuego, int Puntuacion, Date Fecha_Jugado) {
        this.ID_Respuesta = ID_Respuesta;
        this.FK_Cod_Niño = FK_Cod_Niño;
        this.FK_Cod_Minijuego = FK_Cod_Minijuego;
        this.Puntuacion = Puntuacion;
        this.Fecha_Jugado = Fecha_Jugado;
    }

    public String getID_Respuesta() {
        return ID_Respuesta;
    }

    public void setID_Respuesta(String ID_Respuesta) {
        this.ID_Respuesta = ID_Respuesta;
    }

    public String getFK_Cod_Niño() {
        return FK_Cod_Niño;
    }

    public void setFK_Cod_Niño(String FK_Cod_Niño) {
        this.FK_Cod_Niño = FK_Cod_Niño;
    }

    public String getFK_Cod_Minijuego() {
        return FK_Cod_Minijuego;
    }

    public void setFK_Cod_Minijuego(String FK_Cod_Minijuego) {
        this.FK_Cod_Minijuego = FK_Cod_Minijuego;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public Date getFecha_Jugado() {
        return Fecha_Jugado;
    }

    public void setFecha_Jugado(Date Fecha_Jugado) {
        this.Fecha_Jugado = Fecha_Jugado;
    }
    
    
    
}
