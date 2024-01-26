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
public class ValoracionInfoRepre {
    private String Cod_Respuesta_usuario;
    private String FK_cod_Representante;
    private String Fk_Cod_Infor;
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
     * @return the FK_cod_Representante
     */
    public String getFK_cod_Representante() {
        return FK_cod_Representante;
    }

    /**
     * @param FK_cod_Representante the FK_cod_Representante to set
     */
    public void setFK_cod_Representante(String FK_cod_Representante) {
        this.FK_cod_Representante = FK_cod_Representante;
    }

    /**
     * @return the Fk_Cod_Infor
     */
    public String getFk_Cod_Infor() {
        return Fk_Cod_Infor;
    }

    /**
     * @param Fk_Cod_Infor the Fk_Cod_Infor to set
     */
    public void setFk_Cod_Infor(String Fk_Cod_Infor) {
        this.Fk_Cod_Infor = Fk_Cod_Infor;
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

    public ValoracionInfoRepre(String Cod_Respuesta_usuario, String FK_cod_Representante, String Fk_Cod_Infor, String respuesta, Date fecha_respuesta) {
        this.Cod_Respuesta_usuario = Cod_Respuesta_usuario;
        this.FK_cod_Representante = FK_cod_Representante;
        this.Fk_Cod_Infor = Fk_Cod_Infor;
        this.respuesta = respuesta;
        this.fecha_respuesta = fecha_respuesta;
    }

    public ValoracionInfoRepre() {
    }
    
}
