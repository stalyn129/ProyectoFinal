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
    private String FK_IDPsicologo;
    private String Titulo_Info;
    private String Texto_Info;

    public Informacion() {
    }

    public Informacion(String Cod_Info, String FK_IDPsicologo, String Titulo_Info, String Texto_Info) {
        this.Cod_Info = Cod_Info;
        this.FK_IDPsicologo = FK_IDPsicologo;
        this.Titulo_Info = Titulo_Info;
        this.Texto_Info = Texto_Info;
    }

    public String getCod_Info() {
        return Cod_Info;
    }

    public void setCod_Info(String Cod_Info) {
        this.Cod_Info = Cod_Info;
    }

    public String getFK_IDPsicologo() {
        return FK_IDPsicologo;
    }

    public void setFK_IDPsicologo(String FK_IDPsicologo) {
        this.FK_IDPsicologo = FK_IDPsicologo;
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

    @Override
    public String toString() {
        return "Informacion{" + "Cod_Info=" + Cod_Info + ", FK_IDPsicologo=" + FK_IDPsicologo + ", Titulo_Info=" + Titulo_Info + ", Texto_Info=" + Texto_Info + '}';
    }
    
    
    
}
