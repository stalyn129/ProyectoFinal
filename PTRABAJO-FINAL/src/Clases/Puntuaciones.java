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
public class Puntuaciones {
    private String ID_Puntuacion;
    private String FK_Cod_Niño;
    private String FK_Cod_Minijuego;
    private int Puntuacion;
    private Date Fecha_Jugado;

    public Puntuaciones() {
    }

    public Puntuaciones(String ID_Puntuacion, String FK_Cod_Niño, String FK_Cod_Minijuego, int Puntuacion, Date Fecha_Jugado) {
        this.ID_Puntuacion = ID_Puntuacion;
        this.FK_Cod_Niño = FK_Cod_Niño;
        this.FK_Cod_Minijuego = FK_Cod_Minijuego;
        this.Puntuacion = Puntuacion;
        this.Fecha_Jugado = Fecha_Jugado;
    }

    public String getID_Puntuacion() {
        return ID_Puntuacion;
    }

    public void setID_Puntuacion(String ID_Puntuacion) {
        this.ID_Puntuacion = ID_Puntuacion;
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

    @Override
    public String toString() {
        return "Puntuaciones{" + "ID_Puntuacion=" + ID_Puntuacion + ", FK_Cod_Ni\u00f1o=" + FK_Cod_Niño + ", FK_Cod_Minijuego=" + FK_Cod_Minijuego + ", Puntuacion=" + Puntuacion + ", Fecha_Jugado=" + Fecha_Jugado + '}';
    }
    
    
    
}
