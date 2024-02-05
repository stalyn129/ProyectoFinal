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
public class peticion_psico {
    private String Cod_Peticion;
    private String FKcod_solicitud;
    private String FkCod_Psicologo;
    private String descripcion;
    private String Estado_peticion;
    private Date Fecha_pet;

    public peticion_psico(String Cod_Peticion, String FKcod_solicitud, String FkCod_Psicologo, String descripcion, String Estado_peticion, Date Fecha_pet) {
        this.Cod_Peticion = Cod_Peticion;
        this.FKcod_solicitud = FKcod_solicitud;
        this.FkCod_Psicologo = FkCod_Psicologo;
        this.descripcion = descripcion;
        this.Estado_peticion = Estado_peticion;
        this.Fecha_pet = Fecha_pet;
    }


    public peticion_psico() {
    }

    public Date getFecha_pet() {
        return Fecha_pet;
    }

    public void setFecha_pet(Date Fecha_pet) {
        this.Fecha_pet = Fecha_pet;
    }

    

    
    
    /**
     * @return the Cod_Peticion
     */
    public String getCod_Peticion() {
        return Cod_Peticion;
    }

    /**
     * @param Cod_Peticion the Cod_Peticion to set
     */
    public void setCod_Peticion(String Cod_Peticion) {
        this.Cod_Peticion = Cod_Peticion;
    }

    /**
     * @return the FKcod_solicitud
     */
    public String getFKcod_solicitud() {
        return FKcod_solicitud;
    }

    /**
     * @param FKcod_solicitud the FKcod_solicitud to set
     */
    public void setFKcod_solicitud(String FKcod_solicitud) {
        this.FKcod_solicitud = FKcod_solicitud;
    }

    /**
     * @return the FkCod_Psicologo
     */
    public String getFkCod_Psicologo() {
        return FkCod_Psicologo;
    }

    /**
     * @param FkCod_Psicologo the FkCod_Psicologo to set
     */
    public void setFkCod_Psicologo(String FkCod_Psicologo) {
        this.FkCod_Psicologo = FkCod_Psicologo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the Estado_peticion
     */
    public String getEstado_peticion() {
        return Estado_peticion;
    }

    /**
     * @param Estado_peticion the Estado_peticion to set
     */
    public void setEstado_peticion(String Estado_peticion) {
        this.Estado_peticion = Estado_peticion;
    }
    
    
}
