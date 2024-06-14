/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import java.sql.SQLException;
import java.util.List;

public class ClienteController {

    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    public void guardarCliente(int id, String nombre, String direccion, String telefono, String email) {
        Cliente cliente = new Cliente(id, nombre, direccion, telefono, email);
        try {
            clienteDAO.save(cliente);
            System.out.println("Cliente guardado correctamente con ID: " + cliente.getId());
        } catch (SQLException e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        }
    }

    public Cliente buscarCliente(int id) {
        try {
            return clienteDAO.find(id);
        } catch (SQLException e) {
            System.out.println("Error al buscar el cliente: " + e.getMessage());
            return null;
        }
    }

    public List<Cliente> obtenerTodosLosClientes() {
        try {
            return clienteDAO.findAll();
        } catch (SQLException e) {
            System.out.println("Error al obtener todos los clientes: " + e.getMessage());
            return null;
        }
    }

    public void actualizarCliente(int id, String nombre, String direccion, String telefono, String email) {
        try {
            Cliente cliente = clienteDAO.find(id);
            if (cliente != null) {
                cliente.setNombre(nombre);
                cliente.setDireccion(direccion);
                cliente.setTelefono(telefono);
                cliente.setEmail(email);
                clienteDAO.update(cliente);
                System.out.println("Cliente actualizado correctamente.");
            } else {
                System.out.println("Cliente no encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el cliente: " + e.getMessage());
        }
    }

    public void eliminarCliente(int id) {
        try {
            clienteDAO.delete(id);
            System.out.println("Cliente eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        }
    }
}
