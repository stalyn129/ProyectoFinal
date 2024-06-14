/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Mascota;
import Modelo.MascotaDAO;

import javax.swing.*;
import java.sql.SQLException;

public class MascotaController {
    private MascotaDAO mascotaDAO;

    public MascotaController() {
        this.mascotaDAO = new MascotaDAO(); 
    }

    public void guardarMascota(JTextField txtNombreM, JTextField txtTipoM, JTextField txtEdadM,
                               JTextField txtRaza) {
        try {
            String nombre = txtNombreM.getText().trim();
            String tipo = txtTipoM.getText().trim();
            int edad = Integer.parseInt(txtEdadM.getText().trim()); 
            String raza = txtRaza.getText().trim();

            if (nombre.isEmpty() || tipo.isEmpty() || raza.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Mascota mascota = new Mascota(nombre, tipo, edad, raza);

            mascotaDAO.save(mascota);

            JOptionPane.showMessageDialog(null, "Mascota guardada correctamente: " + mascota, "Mascota Guardada", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos(txtNombreM, txtTipoM, txtEdadM, txtRaza);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de la edad", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar guardar la mascota: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos(JTextField txtNombreM, JTextField txtTipoM, JTextField txtEdadM,
                               JTextField txtRaza) {
        txtNombreM.setText("");
        txtTipoM.setText("");
        txtEdadM.setText("");
        txtRaza.setText("");
    }
}
