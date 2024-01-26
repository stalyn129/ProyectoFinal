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
public class UserDataSingleton {
    private static UserDataSingleton instance;
    private String cod_Psicologo;
    private String cod_Representante;
    private String cod_niño;
    private String cod_Admin;

    public String getCod_Admin() {
        return cod_Admin;
    }

    public void setCod_Admin(String cod_Admin) {
        this.cod_Admin = cod_Admin;
    }

   
    private String cod_test_repre;

    // Constructor privado para evitar instanciación directa
    private UserDataSingleton() {
    }

    // Método para obtener la instancia única de la clase
    public static synchronized UserDataSingleton getInstance() {
        if (instance == null) {
            instance = new UserDataSingleton();
        }
        return instance;
    }

    // Métodos para establecer y obtener la cédula

    /**
    * @return the cod_Psicologo
    */
    public String getCod_Psicologo() {
        return cod_Psicologo;
    }

    /**
     * @param cod_Psicologo the cod_Psicologo to set
     */
    public void setCod_Psicologo(String cod_Psicologo) {
        this.cod_Psicologo = cod_Psicologo;
    }

    /**
     * @return the cod_Representante
     */
    public String getCod_Representante() {
        return cod_Representante;
    }

    /**
     * @param cod_Representante the cod_Representante to set
     */
    public void setCod_Representante(String cod_Representante) {
        this.cod_Representante = cod_Representante;
    }

    /**
     * @return the cod_niño
     */
    public String getCod_niño() {
        return cod_niño;
    }

    /**
     * @param cod_niño the cod_niño to set
     */
    public void setCod_niño(String cod_niño) {
        this.cod_niño = cod_niño;
    }

    /**
     * @return the cod_test_repre
     */
    public String getCod_test_repre() {
        return cod_test_repre;
    }

    /**
     * @param cod_test_repre the cod_test_repre to set
     */
    public void setCod_test_repre(String cod_test_repre) {
        this.cod_test_repre = cod_test_repre;
    }
   
}
