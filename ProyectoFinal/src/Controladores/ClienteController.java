/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Cliente;
import Modelo.ClienteDAO;

import javax.swing.*;
import java.sql.SQLException;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO(); 
    }

    public void guardarCliente(JTextField txtNombre, JTextField txtDireccion, JTextField txtTelefono, JTextField txtEmail) {
        try {
            
            String nombre = txtNombre.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String email = txtEmail.getText().trim();

            if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Cliente cliente = new Cliente(0, nombre, direccion, telefono, email); 

            clienteDAO.save(cliente);

            JOptionPane.showMessageDialog(null, "Cliente guardado correctamente: " + cliente, "Cliente Guardado", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos(txtNombre, txtDireccion, txtTelefono, txtEmail);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar guardar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos(JTextField txtNombre, JTextField txtDireccion, JTextField txtTelefono, JTextField txtEmail) {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }
}
