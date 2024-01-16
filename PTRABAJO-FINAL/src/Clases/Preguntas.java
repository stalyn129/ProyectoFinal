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
public class Preguntas {
    private String Cod_Pregunta;
    private String FK_Codigo_Test;
    private String Enunciado;

    public Preguntas() {
    }

    public Preguntas(String Cod_Pregunta, String FK_Codigo_Test, String Enunciado) {
        this.Cod_Pregunta = Cod_Pregunta;
        this.FK_Codigo_Test = FK_Codigo_Test;
        this.Enunciado = Enunciado;
    }

    @Override
    public String toString() {
        return "Preguntas{" + "Cod_Pregunta=" + Cod_Pregunta + ", FK_Codigo_Test=" + FK_Codigo_Test + ", Enunciado=" + Enunciado + '}';
    }

    
    public String getCod_Pregunta() {
        return Cod_Pregunta;
    }

    public void setCod_Pregunta(String Cod_Pregunta) {
        this.Cod_Pregunta = Cod_Pregunta;
    }

    public String getFK_Codigo_Test() {
        return FK_Codigo_Test;
    }

    public void setFK_Codigo_Test(String FK_Codigo_Test) {
        this.FK_Codigo_Test = FK_Codigo_Test;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String Enunciado) {
        this.Enunciado = Enunciado;
    }
    
    
}
