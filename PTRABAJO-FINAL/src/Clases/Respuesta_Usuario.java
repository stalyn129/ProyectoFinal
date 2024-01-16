/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alexa
 */
public class Respuesta_Usuario {
    
    private String Cod_Respuesta_usuario;
    private String FK_Cod_text;
    private String FK_cod_pregunta;
    private String FK_cod_Opciones;
    private String FK_cod_tipo_usua;
    private String fecha_respuesta;

    public Respuesta_Usuario() {
    }

    public Respuesta_Usuario(String Cod_Respuesta_usuario, String FK_Cod_text, String FK_cod_pregunta, String FK_cod_Opciones, String FK_cod_tipo_usua, String fecha_respuesta) {
        this.Cod_Respuesta_usuario = Cod_Respuesta_usuario;
        this.FK_Cod_text = FK_Cod_text;
        this.FK_cod_pregunta = FK_cod_pregunta;
        this.FK_cod_Opciones = FK_cod_Opciones;
        this.FK_cod_tipo_usua = FK_cod_tipo_usua;
        this.fecha_respuesta = fecha_respuesta;
    }

    @Override
    public String toString() {
        return "Respuesta_Usuario{" + "Cod_Respuesta_usuario=" + Cod_Respuesta_usuario + ", FK_Cod_text=" + FK_Cod_text + ", FK_cod_pregunta=" + FK_cod_pregunta + ", FK_cod_Opciones=" + FK_cod_Opciones + ", FK_cod_tipo_usua=" + FK_cod_tipo_usua + ", fecha_respuesta=" + fecha_respuesta + '}';
    }

    
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
     * @return the FK_Cod_text
     */
    public String getFK_Cod_text() {
        return FK_Cod_text;
    }

    /**
     * @param FK_Cod_text the FK_Cod_text to set
     */
    public void setFK_Cod_text(String FK_Cod_text) {
        this.FK_Cod_text = FK_Cod_text;
    }

    /**
     * @return the FK_cod_pregunta
     */
    public String getFK_cod_pregunta() {
        return FK_cod_pregunta;
    }

    /**
     * @param FK_cod_pregunta the FK_cod_pregunta to set
     */
    public void setFK_cod_pregunta(String FK_cod_pregunta) {
        this.FK_cod_pregunta = FK_cod_pregunta;
    }

    /**
     * @return the FK_cod_Opciones
     */
    public String getFK_cod_Opciones() {
        return FK_cod_Opciones;
    }

    /**
     * @param FK_cod_Opciones the FK_cod_Opciones to set
     */
    public void setFK_cod_Opciones(String FK_cod_Opciones) {
        this.FK_cod_Opciones = FK_cod_Opciones;
    }

    /**
     * @return the FK_cod_tipo_usua
     */
    public String getFK_cod_tipo_usua() {
        return FK_cod_tipo_usua;
    }

    /**
     * @param FK_cod_tipo_usua the FK_cod_tipo_usua to set
     */
    public void setFK_cod_tipo_usua(String FK_cod_tipo_usua) {
        this.FK_cod_tipo_usua = FK_cod_tipo_usua;
    }

    /**
     * @return the fecha_respuesta
     */
    public String getFecha_respuesta() {
        return fecha_respuesta;
    }

    /**
     * @param fecha_respuesta the fecha_respuesta to set
     */
    public void setFecha_respuesta(String fecha_respuesta) {
        this.fecha_respuesta = fecha_respuesta;
    }
    
}
