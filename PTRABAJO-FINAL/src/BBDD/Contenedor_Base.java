/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDD;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ext.Db4oIOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Contenedor_Base {
    public static void main(String[] args) {
        ObjectContainer base = ConectarBase();
        CerrarBase(base);
    }

    public static ObjectContainer ConectarBase() {
        try {
            ObjectContainer base = Db4o.openFile("src/BBDD/BaseDat.yap");
            return base;
        } catch (Db4oIOException e) {
            JOptionPane.showMessageDialog(null, "Ruta no Encontrada", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    }

    public static void CerrarBase(ObjectContainer base) {
        if (base != null) {
            base.close();
        }
    }
}
