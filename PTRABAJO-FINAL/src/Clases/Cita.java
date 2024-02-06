/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
import org.jfree.data.time.Hour;

/**
 *
 * @author Joel
 */
public class Cita {
    private String Cod_Cita;
    private String FK_Cod_Repre;
    private String FK_Cod_Psico;
    private String FK_Cod_Niño;
    private Date Fecha_Cita;
    private Hour Hora_Cita;
    private String Ubicacion;

    public Cita() {
    }

    public Cita(String Cod_Cita, String FK_Cod_Repre, String FK_Cod_Psico, String FK_Cod_Niño, Date Fecha_Cita, Hour Hora_Cita, String Ubicacion) {
        this.Cod_Cita = Cod_Cita;
        this.FK_Cod_Repre = FK_Cod_Repre;
        this.FK_Cod_Psico = FK_Cod_Psico;
        this.FK_Cod_Niño = FK_Cod_Niño;
        this.Fecha_Cita = Fecha_Cita;
        this.Hora_Cita = Hora_Cita;
        this.Ubicacion = Ubicacion;
    }

    public String getCod_Cita() {
        return Cod_Cita;
    }

    public void setCod_Cita(String Cod_Cita) {
        this.Cod_Cita = Cod_Cita;
    }

    public String getFK_Cod_Repre() {
        return FK_Cod_Repre;
    }

    public void setFK_Cod_Repre(String FK_Cod_Repre) {
        this.FK_Cod_Repre = FK_Cod_Repre;
    }

    public String getFK_Cod_Psico() {
        return FK_Cod_Psico;
    }

    public void setFK_Cod_Psico(String FK_Cod_Psico) {
        this.FK_Cod_Psico = FK_Cod_Psico;
    }

    public String getFK_Cod_Niño() {
        return FK_Cod_Niño;
    }

    public void setFK_Cod_Niño(String FK_Cod_Niño) {
        this.FK_Cod_Niño = FK_Cod_Niño;
    }

    public Date getFecha_Cita() {
        return Fecha_Cita;
    }

    public void setFecha_Cita(Date Fecha_Cita) {
        this.Fecha_Cita = Fecha_Cita;
    }

    public Hour getHora_Cita() {
        return Hora_Cita;
    }

    public void setHora_Cita(Hour Hora_Cita) {
        this.Hora_Cita = Hora_Cita;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    @Override
    public String toString() {
        return "Cita{" + "Cod_Cita=" + Cod_Cita + ", FK_Cod_Repre=" + FK_Cod_Repre + ", FK_Cod_Psico=" + FK_Cod_Psico + ", FK_Cod_Ni\u00f1o=" + FK_Cod_Niño + ", Fecha_Cita=" + Fecha_Cita + ", Hora_Cita=" + Hora_Cita + ", Ubicacion=" + Ubicacion + '}';
    }
    
    
}
