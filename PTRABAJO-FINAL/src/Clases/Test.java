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
public class Test {
    private String ID_Test;
    private String FKCod_Psicologo;
    private String Titulo_Test;
    private String Descripcion_Test;

    public Test() {
    }

    public Test(String ID_Test, String FKCod_Psicologo, String Titulo_Test, String Descripcion_Test) {
        this.ID_Test = ID_Test;
        this.FKCod_Psicologo = FKCod_Psicologo;
        this.Titulo_Test = Titulo_Test;
        this.Descripcion_Test = Descripcion_Test;
    }

    public String getID_Test() {
        return ID_Test;
    }

    public void setID_Test(String ID_Test) {
        this.ID_Test = ID_Test;
    }

    public String getFKCod_Psicologo() {
        return FKCod_Psicologo;
    }

    public void setFKCod_Psicologo(String FKCod_Psicologo) {
        this.FKCod_Psicologo = FKCod_Psicologo;
    }

    public String getTitulo_Test() {
        return Titulo_Test;
    }

    public void setTitulo_Test(String Titulo_Test) {
        this.Titulo_Test = Titulo_Test;
    }

    public String getDescripcion_Test() {
        return Descripcion_Test;
    }

    public void setDescripcion_Test(String Descripcion_Test) {
        this.Descripcion_Test = Descripcion_Test;
    }

    @Override
    public String toString() {
        return "Test{" + "ID_Test=" + ID_Test + ", FKCod_Psicologo=" + FKCod_Psicologo + ", Titulo_Test=" + Titulo_Test + ", Descripcion_Test=" + Descripcion_Test + '}';
    }
    
    
}
