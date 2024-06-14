/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Veterinario;
import Modelo.VeterinarioDAO;

import javax.swing.*;
import java.sql.SQLException;

public class VeterinarioController {
    private VeterinarioDAO veterinarioDAO;

    public VeterinarioController() {
        this.veterinarioDAO = new VeterinarioDAO(); 
    }

    public void guardarVeterinario(JTextField txtNombre, JTextField txtDireccion, JTextField txtTelefono,
                                   JTextField txtEmail, JTextField txtEspecialidad) {
        try {
            String nombre = txtNombre.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String email = txtEmail.getText().trim();
            String especialidad = txtEspecialidad.getText().trim();

            if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty() || especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Veterinario veterinario = new Veterinario(0, nombre, direccion, telefono, email, especialidad); // El ID se asignará automáticamente

            veterinarioDAO.save(veterinario);

            JOptionPane.showMessageDialog(null, "Veterinario guardado correctamente: " + veterinario, "Veterinario Guardado", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos(txtNombre, txtDireccion, txtTelefono, txtEmail, txtEspecialidad);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar guardar el veterinario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos(JTextField txtNombre, JTextField txtDireccion, JTextField txtTelefono,
                               JTextField txtEmail, JTextField txtEspecialidad) {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtEspecialidad.setText("");
    }
}
