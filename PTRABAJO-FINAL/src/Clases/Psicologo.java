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
public class Psicologo {
    private String Cod_Psicologo;
    private String FK_Cedula;
    private String FK_Cod_Especialidad;
    private int Años_Experiencia;

    public Psicologo() {
    }

    public Psicologo(String Cod_Psicologo, String FK_Cedula, String FK_Cod_Especialidad, int Años_Experiencia) {
        this.Cod_Psicologo = Cod_Psicologo;
        this.FK_Cedula = FK_Cedula;
        this.FK_Cod_Especialidad = FK_Cod_Especialidad;
        this.Años_Experiencia = Años_Experiencia;
    }
    
    /**
     * @return the Cod_Psicologo
     */
    private String getCod_Psicologo() {
        return Cod_Psicologo;
    }

    /**
     * @param Cod_Psicologo the Cod_Psicologo to set
     */
    private void setCod_Psicologo(String Cod_Psicologo) {
        this.Cod_Psicologo = Cod_Psicologo;
    }

    /**
     * @return the FK_Cedula
     */
    private String getFK_Cedula() {
        return FK_Cedula;
    }

    /**
     * @param FK_Cedula the FK_Cedula to set
     */
    private void setFK_Cedula(String FK_Cedula) {
        this.FK_Cedula = FK_Cedula;
    }

    /**
     * @return the FK_Cod_Especialidad
     */
    private String getFK_Cod_Especialidad() {
        return FK_Cod_Especialidad;
    }

    /**
     * @param FK_Cod_Especialidad the FK_Cod_Especialidad to set
     */
    private void setFK_Cod_Especialidad(String FK_Cod_Especialidad) {
        this.FK_Cod_Especialidad = FK_Cod_Especialidad;
    }

    /**
     * @return the Años_Experiencia
     */
    private int getAños_Experiencia() {
        return Años_Experiencia;
    }

    /**
     * @param Años_Experiencia the Años_Experiencia to set
     */
    private void setAños_Experiencia(int Años_Experiencia) {
        this.Años_Experiencia = Años_Experiencia;
    }

    @Override
    public String toString() {
        return "Psicologo{" + "Cod_Psicologo=" + Cod_Psicologo + ", FK_Cedula=" + FK_Cedula + ", FK_Cod_Especialidad=" + FK_Cod_Especialidad + ", A\u00f1os_Experiencia=" + Años_Experiencia + '}';
    }
    
    
    
}
