/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Joel
 */
public class Comentario {

    private String ID_Comentario;
    private String FK_Cod_Foro;
    private String FK_Cod_Participante;
    private String Contenido_Comen;
    private String Nombre_Usario;
    private Date Fecha_Comen;

    public Comentario() {
    }

    public Comentario(String ID_Comentario, String FK_Cod_Foro, String FK_Cod_Participante, String Contenido_Comen, String Nombre_Usario, Date Fecha_Comen) {
        this.ID_Comentario = ID_Comentario;
        this.FK_Cod_Foro = FK_Cod_Foro;
        this.FK_Cod_Participante = FK_Cod_Participante;
        this.Contenido_Comen = Contenido_Comen;
        this.Nombre_Usario = Nombre_Usario;
        this.Fecha_Comen = Fecha_Comen;
    }

    public String getID_Comentario() {
        return ID_Comentario;
    }

    public void setID_Comentario(String ID_Comentario) {
        this.ID_Comentario = ID_Comentario;
    }

    public String getFK_Cod_Foro() {
        return FK_Cod_Foro;
    }

    public void setFK_Cod_Foro(String FK_Cod_Foro) {
        this.FK_Cod_Foro = FK_Cod_Foro;
    }

    public String getFK_Cod_Participante() {
        return FK_Cod_Participante;
    }

    public void setFK_Cod_Participante(String FK_Cod_Participante) {
        this.FK_Cod_Participante = FK_Cod_Participante;
    }

    public String getContenido_Comen() {
        return Contenido_Comen;
    }

    public void setContenido_Comen(String Contenido_Comen) {
        this.Contenido_Comen = Contenido_Comen;
    }

    public String getNombre_Usario() {
        return Nombre_Usario;
    }

    public void setNombre_Usario(String Nombre_Usario) {
        this.Nombre_Usario = Nombre_Usario;
    }

    public Date getFecha_Comen() {
        return Fecha_Comen;
    }

    public void setFecha_Comen(Date Fecha_Comen) {
        this.Fecha_Comen = Fecha_Comen;
    }

    @Override
    public String toString() {
        return "Comentario{" + "ID_Comentario=" + ID_Comentario + ", FK_Cod_Foro=" + FK_Cod_Foro + ", FK_Cod_Participante=" + FK_Cod_Participante + ", Contenido_Comen=" + Contenido_Comen + ", Nombre_Usario=" + Nombre_Usario + ", Fecha_Comen=" + Fecha_Comen + '}';
    }
    
   

}
