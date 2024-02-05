/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class solicitud {

    private String cod_solicitud;
    private String FKcod_representante;
    private String FKcod_niño;
    private String Estado_solicitud1;
    private String comentario_soli;
    private Date Fecha_soli;

    public solicitud() {
    }

    public solicitud(String cod_solicitud, String FKcod_representante, String FKcod_niño, String Estado_solicitud1, String comentario_soli, Date Fecha_soli) {
        this.cod_solicitud = cod_solicitud;
        this.FKcod_representante = FKcod_representante;
        this.FKcod_niño = FKcod_niño;
        this.Estado_solicitud1 = Estado_solicitud1;
        this.comentario_soli = comentario_soli;
        this.Fecha_soli = Fecha_soli;
    }

    
    
    
    
    /**
     * @return the cod_solicitud
     */
    public String getCod_solicitud() {
        return cod_solicitud;
    }

    /**
     * @param cod_solicitud the cod_solicitud to set
     */
    public void setCod_solicitud(String cod_solicitud) {
        this.cod_solicitud = cod_solicitud;
    }

    /**
     * @return the FKcod_representante
     */
    public String getFKcod_representante() {
        return FKcod_representante;
    }

    /**
     * @param FKcod_representante the FKcod_representante to set
     */
    public void setFKcod_representante(String FKcod_representante) {
        this.FKcod_representante = FKcod_representante;
    }

    /**
     * @return the FKcod_niño
     */
    public String getFKcod_niño() {
        return FKcod_niño;
    }

    /**
     * @param FKcod_niño the FKcod_niño to set
     */
    public void setFKcod_niño(String FKcod_niño) {
        this.FKcod_niño = FKcod_niño;
    }

    /**
     * @return the Estado_solicitud1
     */
    public String getEstado_solicitud1() {
        return Estado_solicitud1;
    }

    /**
     * @param Estado_solicitud1 the Estado_solicitud1 to set
     */
    public void setEstado_solicitud1(String Estado_solicitud1) {
        this.Estado_solicitud1 = Estado_solicitud1;
    }

    /**
     * @return the comentario_soli
     */
    public String getComentario_soli() {
        return comentario_soli;
    }

    /**
     * @param comentario_soli the comentario_soli to set
     */
    public void setComentario_soli(String comentario_soli) {
        this.comentario_soli = comentario_soli;
    }

    /**
     * @return the Fecha_soli
     */
    public Date getFecha_soli() {
        return Fecha_soli;
    }

    /**
     * @param Fecha_soli the Fecha_soli to set
     */
    public void setFecha_soli(Date Fecha_soli) {
        this.Fecha_soli = Fecha_soli;
    }

    
}
