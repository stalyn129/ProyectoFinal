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
public class Cuento {
    private String Cod_Cuento;
    private String FK_CodPsicologo;
    private String Titulo_Cuento;
    private String Introduccion_Cuento;
    private String Nudo_Cuento;
    private String Desenlace_Cuento;
    private byte[] Imagen_Cuento;

    public Cuento() {
    }

    public Cuento(String Cod_Cuento, String FK_CodPsicologo, String Titulo_Cuento, String Introduccion_Cuento, String Nudo_Cuento, String Desenlace_Cuento, byte[] Imagen_Cuento) {
        this.Cod_Cuento = Cod_Cuento;
        this.FK_CodPsicologo = FK_CodPsicologo;
        this.Titulo_Cuento = Titulo_Cuento;
        this.Introduccion_Cuento = Introduccion_Cuento;
        this.Nudo_Cuento = Nudo_Cuento;
        this.Desenlace_Cuento = Desenlace_Cuento;
        this.Imagen_Cuento = Imagen_Cuento;
    }

    public String getCod_Cuento() {
        return Cod_Cuento;
    }

    public void setCod_Cuento(String Cod_Cuento) {
        this.Cod_Cuento = Cod_Cuento;
    }

    public String getFK_CodPsicologo() {
        return FK_CodPsicologo;
    }

    public void setFK_CodPsicologo(String FK_CodPsicologo) {
        this.FK_CodPsicologo = FK_CodPsicologo;
    }

    public String getTitulo_Cuento() {
        return Titulo_Cuento;
    }

    public void setTitulo_Cuento(String Titulo_Cuento) {
        this.Titulo_Cuento = Titulo_Cuento;
    }

    public String getIntroduccion_Cuento() {
        return Introduccion_Cuento;
    }

    public void setIntroduccion_Cuento(String Introduccion_Cuento) {
        this.Introduccion_Cuento = Introduccion_Cuento;
    }

    public String getNudo_Cuento() {
        return Nudo_Cuento;
    }

    public void setNudo_Cuento(String Nudo_Cuento) {
        this.Nudo_Cuento = Nudo_Cuento;
    }

    public String getDesenlace_Cuento() {
        return Desenlace_Cuento;
    }

    public void setDesenlace_Cuento(String Desenlace_Cuento) {
        this.Desenlace_Cuento = Desenlace_Cuento;
    }

    public byte[] getImagen_Cuento() {
        return Imagen_Cuento;
    }

    public void setImagen_Cuento(byte[] Imagen_Cuento) {
        this.Imagen_Cuento = Imagen_Cuento;
    }

    @Override
    public String toString() {
        return "Cuento{" + "Cod_Cuento=" + Cod_Cuento + ", FK_CodPsicologo=" + FK_CodPsicologo + ", Titulo_Cuento=" + Titulo_Cuento + ", Introduccion_Cuento=" + Introduccion_Cuento + ", Nudo_Cuento=" + Nudo_Cuento + ", Desenlace_Cuento=" + Desenlace_Cuento + ", Imagen_Cuento=" + Imagen_Cuento + '}';
    }
    
}
