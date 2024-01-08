/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author Joel
 */
public class Contenedor_Base {
     public static void main(String[] args) {
        // TODO code application logic here
        
        ObjectContainer Base= Db4o.openFile("C:\\Users\\Joel\\OneDrive\\Escritorio\\BaseDatos.yap");
                Base.close();


     }
     //////////////////////////////
     public static void CerrarBase(ObjectContainer Base) {
        Base.close();
    }

}
