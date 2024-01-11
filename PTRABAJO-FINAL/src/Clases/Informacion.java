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
public class Informacion {
    private String Cod_Info;
    private String Titulo_Info;
    private String Texto_Info;
    private byte[] imagen;

    public Informacion() {
    }

    public Informacion(String Cod_Info, String Titulo_Info, String Texto_Info, byte[] imagen) {
        this.Cod_Info = Cod_Info;
        this.Titulo_Info = Titulo_Info;
        this.Texto_Info = Texto_Info;
        this.imagen = imagen;
    }

    public String getCod_Info() {
        return Cod_Info;
    }

    public void setCod_Info(String Cod_Info) {
        this.Cod_Info = Cod_Info;
    }

    public String getTitulo_Info() {
        return Titulo_Info;
    }

    public void setTitulo_Info(String Titulo_Info) {
        this.Titulo_Info = Titulo_Info;
    }

    public String getTexto_Info() {
        return Texto_Info;
    }

    public void setTexto_Info(String Texto_Info) {
        this.Texto_Info = Texto_Info;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
