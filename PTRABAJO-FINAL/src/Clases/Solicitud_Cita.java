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
public class Solicitud_Cita {
    private String cod_solicitud;
    private String FKcod_representante;
    private String FKcod_niño;
    private boolean Estado_solicitud1;
    private Date Fecha_soli; 
    private String FKcod_psicologo; 

    public Solicitud_Cita(String cod_solicitud, String FKcod_representante, String FKcod_niño, boolean Estado_solicitud1, Date Fecha_soli, String FKcod_psicologo) {
        this.cod_solicitud = cod_solicitud;
        this.FKcod_representante = FKcod_representante;
        this.FKcod_niño = FKcod_niño;
        this.Estado_solicitud1 = Estado_solicitud1;
        this.Fecha_soli = Fecha_soli;
        this.FKcod_psicologo = FKcod_psicologo;
    }

    public Solicitud_Cita() {
    }

    public String getCod_solicitud() {
        return cod_solicitud;
    }

    public void setCod_solicitud(String cod_solicitud) {
        this.cod_solicitud = cod_solicitud;
    }

    public String getFKcod_representante() {
        return FKcod_representante;
    }

    public void setFKcod_representante(String FKcod_representante) {
        this.FKcod_representante = FKcod_representante;
    }

    public String getFKcod_niño() {
        return FKcod_niño;
    }

    public void setFKcod_niño(String FKcod_niño) {
        this.FKcod_niño = FKcod_niño;
    }

    public boolean isEstado_solicitud1() {
        return Estado_solicitud1;
    }

    public void setEstado_solicitud1(boolean Estado_solicitud1) {
        this.Estado_solicitud1 = Estado_solicitud1;
    }

    public Date getFecha_soli() {
        return Fecha_soli;
    }

    public void setFecha_soli(Date Fecha_soli) {
        this.Fecha_soli = Fecha_soli;
    }

    public String getFKcod_psicologo() {
        return FKcod_psicologo;
    }

    public void setFKcod_psicologo(String FKcod_psicologo) {
        this.FKcod_psicologo = FKcod_psicologo;
    }

    @Override
    public String toString() {
        return "Solicitud_Cita{" + "cod_solicitud=" + cod_solicitud + ", FKcod_representante=" + FKcod_representante + ", FKcod_ni\u00f1o=" + FKcod_niño + ", Estado_solicitud1=" + Estado_solicitud1 + ", Fecha_soli=" + Fecha_soli + ", FKcod_psicologo=" + FKcod_psicologo + '}';
    }

    
}
