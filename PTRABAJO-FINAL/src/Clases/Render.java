/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
//204,255,242   

/**
 *
 * @author alexa
 */
public class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof JButton) {
            JButton btn = (JButton) value;
            return btn;
        }
        if (value instanceof JTextArea) {
            JTextArea text = (JTextArea) value;      // Establece el texto del JTextArea con el valor proporcionado
            return text;                        // Devuelve el JTextArea como el componente de renderizado
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        if (value instanceof  JButton) {
//            
//            JButton btn=(JButton)value;
//            return btn;
//            
//        }
//        
//        
//        
//        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
//    }
}
