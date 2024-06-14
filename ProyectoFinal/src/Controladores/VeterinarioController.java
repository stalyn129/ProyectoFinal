/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Veterinario;
import Modelo.VeterinarioDAO;

import java.sql.SQLException;
import java.util.List;

public class VeterinarioController {
    private VeterinarioDAO veterinarioDAO;

    public VeterinarioController() {
        this.veterinarioDAO = new VeterinarioDAO();
    }

    public void guardarVeterinario(String nombre, String direccion, String telefono, String email, String especialidad) {
        try {
            Veterinario veterinario = new Veterinario(0, nombre, direccion, telefono, email, especialidad); // El ID se asignará automáticamente
            veterinarioDAO.save(veterinario);
            System.out.println("Veterinario guardado correctamente: " + veterinario);
        } catch (SQLException e) {
            System.out.println("Error al intentar guardar el veterinario: " + e.getMessage());
        }
    }

    public void buscarVeterinarioPorId(int id) {
        try {
            Veterinario veterinario = veterinarioDAO.find(id);
            if (veterinario != null) {
                System.out.println("Veterinario encontrado: " + veterinario);
            } else {
                System.out.println("Veterinario no encontrado con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar buscar el veterinario: " + e.getMessage());
        }
    }

    public void listarVeterinarios() {
        try {
            List<Veterinario> veterinarios = veterinarioDAO.findAll();
            System.out.println("Lista de veterinarios:");
            for (Veterinario veterinario : veterinarios) {
                System.out.println(veterinario);
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar listar los veterinarios: " + e.getMessage());
        }
    }

    public void actualizarVeterinario(int id, String nombre, String direccion, String telefono, String email, String especialidad) {
        try {
            Veterinario veterinario = new Veterinario(id, nombre, direccion, telefono, email, especialidad);
            veterinarioDAO.update(veterinario);
            System.out.println("Veterinario actualizado correctamente: " + veterinario);
        } catch (SQLException e) {
            System.out.println("Error al intentar actualizar el veterinario: " + e.getMessage());
        }
    }

    public void eliminarVeterinario(int id) {
        try {
            veterinarioDAO.delete(id);
            System.out.println("Veterinario eliminado correctamente con ID: " + id);
        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar el veterinario: " + e.getMessage());
        }
    }
}
