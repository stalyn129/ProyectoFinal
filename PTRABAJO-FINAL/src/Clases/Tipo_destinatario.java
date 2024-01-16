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
public class Tipo_destinatario {
    private String Cod_destinatario;
    private String tipo_destina;

    public Tipo_destinatario() {
    }

    public Tipo_destinatario(String Cod_destinatario, String tipo_destina) {
        this.Cod_destinatario = Cod_destinatario;
        this.tipo_destina = tipo_destina;
    }

    @Override
    public String toString() {
        return "Tipo_destinatario{" + "Cod_destinatario=" + Cod_destinatario + ", tipo_destina=" + tipo_destina + '}';
    }

    
    /**
     * @return the Cod_destinatario
     */
    public String getCod_destinatario() {
        return Cod_destinatario;
    }

    /**
     * @param Cod_destinatario the Cod_destinatario to set
     */
    public void setCod_destinatario(String Cod_destinatario) {
        this.Cod_destinatario = Cod_destinatario;
    }

    /**
     * @return the tipo_destina
     */
    public String getTipo_destina() {
        return tipo_destina;
    }

    /**
     * @param tipo_destina the tipo_destina to set
     */
    public void setTipo_destina(String tipo_destina) {
        this.tipo_destina = tipo_destina;
    }
}
