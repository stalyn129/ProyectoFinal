/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Joel
 */
public class Opcion_Respuesta {
    private String Cod_Opciones;
    private String FK_CodPregunta;
    private String Text_opcional;

    public Opcion_Respuesta() {
    }

    public Opcion_Respuesta(String Cod_Opciones, String FK_CodPregunta, String Text_opcional) {
        this.Cod_Opciones = Cod_Opciones;
        this.FK_CodPregunta = FK_CodPregunta;
        this.Text_opcional = Text_opcional;
    }

    @Override
    public String toString() {
        return "Opcion_Respuesta{" + "Cod_Opciones=" + Cod_Opciones + ", FK_CodPregunta=" + FK_CodPregunta + ", Text_opcional=" + Text_opcional + '}';
    }

    
    public String getCod_Opciones() {
        return Cod_Opciones;
    }

    public void setCod_Opciones(String Cod_Opciones) {
        this.Cod_Opciones = Cod_Opciones;
    }

    public String getFK_CodPregunta() {
        return FK_CodPregunta;
    }

    public void setFK_CodPregunta(String FK_CodPregunta) {
        this.FK_CodPregunta = FK_CodPregunta;
    }

    public String getText_opcional() {
        return Text_opcional;
    }

    public void setText_opcional(String Text_opcional) {
        this.Text_opcional = Text_opcional;
    }
    
    
}
