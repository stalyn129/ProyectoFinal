/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ValoracionConseNiño {
    private String Cod_Respuesta_usuario;
    private String Fk_cod_niño;
    private String Fk_Cod_Consejo;
    private String respuesta;
    private Date fecha_respuesta;

    /**
     * @return the Cod_Respuesta_usuario
     */
    public String getCod_Respuesta_usuario() {
        return Cod_Respuesta_usuario;
    }

    /**
     * @param Cod_Respuesta_usuario the Cod_Respuesta_usuario to set
     */
    public void setCod_Respuesta_usuario(String Cod_Respuesta_usuario) {
        this.Cod_Respuesta_usuario = Cod_Respuesta_usuario;
    }

    /**
     * @return the Fk_cod_niño
     */
    public String getFk_cod_niño() {
        return Fk_cod_niño;
    }

    /**
     * @param Fk_cod_niño the Fk_cod_niño to set
     */
    public void setFk_cod_niño(String Fk_cod_niño) {
        this.Fk_cod_niño = Fk_cod_niño;
    }

    /**
     * @return the Fk_Cod_Consejo
     */
    public String getFk_Cod_Consejo() {
        return Fk_Cod_Consejo;
    }

    /**
     * @param Fk_Cod_Consejo the Fk_Cod_Consejo to set
     */
    public void setFk_Cod_Consejo(String Fk_Cod_Consejo) {
        this.Fk_Cod_Consejo = Fk_Cod_Consejo;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the fecha_respuesta
     */
    public Date getFecha_respuesta() {
        return fecha_respuesta;
    }

    /**
     * @param fecha_respuesta the fecha_respuesta to set
     */
    public void setFecha_respuesta(Date fecha_respuesta) {
        this.fecha_respuesta = fecha_respuesta;
    }

    public ValoracionConseNiño(String Cod_Respuesta_usuario, String Fk_cod_niño, String Fk_Cod_Consejo, String respuesta, Date fecha_respuesta) {
        this.Cod_Respuesta_usuario = Cod_Respuesta_usuario;
        this.Fk_cod_niño = Fk_cod_niño;
        this.Fk_Cod_Consejo = Fk_Cod_Consejo;
        this.respuesta = respuesta;
        this.fecha_respuesta = fecha_respuesta;
    }

    public ValoracionConseNiño() {
    }
    
}
