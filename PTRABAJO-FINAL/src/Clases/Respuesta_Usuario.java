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
public class Respuesta_Usuario {
    
    private String Cod_Respuesta_usuario;
    private String FK_Cod_text;
    private String FK_cod_pregunta;
    private String FK_cod_Opciones;
    private String tipo_usuario;
    private Date fecha_respuesta;
    private String Fk_Cod_Usuario;

    public Respuesta_Usuario() {
    }

    public Respuesta_Usuario(String Cod_Respuesta_usuario, String FK_Cod_text, String FK_cod_pregunta, String FK_cod_Opciones, String tipo_usuario, Date fecha_respuesta, String Fk_Cod_Usuario) {
        this.Cod_Respuesta_usuario = Cod_Respuesta_usuario;
        this.FK_Cod_text = FK_Cod_text;
        this.FK_cod_pregunta = FK_cod_pregunta;
        this.FK_cod_Opciones = FK_cod_Opciones;
        this.tipo_usuario = tipo_usuario;
        this.fecha_respuesta = fecha_respuesta;
        this.Fk_Cod_Usuario = Fk_Cod_Usuario;
    }

    public String getCod_Respuesta_usuario() {
        return Cod_Respuesta_usuario;
    }

    public void setCod_Respuesta_usuario(String Cod_Respuesta_usuario) {
        this.Cod_Respuesta_usuario = Cod_Respuesta_usuario;
    }

    public String getFK_Cod_text() {
        return FK_Cod_text;
    }

    public void setFK_Cod_text(String FK_Cod_text) {
        this.FK_Cod_text = FK_Cod_text;
    }

    public String getFK_cod_pregunta() {
        return FK_cod_pregunta;
    }

    public void setFK_cod_pregunta(String FK_cod_pregunta) {
        this.FK_cod_pregunta = FK_cod_pregunta;
    }

    public String getFK_cod_Opciones() {
        return FK_cod_Opciones;
    }

    public void setFK_cod_Opciones(String FK_cod_Opciones) {
        this.FK_cod_Opciones = FK_cod_Opciones;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Date getFecha_respuesta() {
        return fecha_respuesta;
    }

    public void setFecha_respuesta(Date fecha_respuesta) {
        this.fecha_respuesta = fecha_respuesta;
    }

    public String getFk_Cod_Usuario() {
        return Fk_Cod_Usuario;
    }

    public void setFk_Cod_Usuario(String Fk_Cod_Usuario) {
        this.Fk_Cod_Usuario = Fk_Cod_Usuario;
    }


    
}
