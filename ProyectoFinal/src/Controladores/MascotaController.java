/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Mascota;
import Modelo.MascotaDAO;

import java.sql.SQLException;
import java.util.List;

public class MascotaController {
    private MascotaDAO mascotaDAO;

    public MascotaController() {
        this.mascotaDAO = new MascotaDAO();
    }

    public void guardarMascota(String nombre, String tipo, int edad, String raza) {
        try {
            Mascota mascota = new Mascota(0, nombre, tipo, edad, raza); // El ID se asignará automáticamente
            mascotaDAO.save(mascota);
            System.out.println("Mascota guardada correctamente: " + mascota);
        } catch (SQLException e) {
            System.out.println("Error al intentar guardar la mascota: " + e.getMessage());
        }
    }

    public void buscarMascotaPorId(int id) {
        try {
            Mascota mascota = mascotaDAO.find(id);
            if (mascota != null) {
                System.out.println("Mascota encontrada: " + mascota);
            } else {
                System.out.println("Mascota no encontrada con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar buscar la mascota: " + e.getMessage());
        }
    }

    public void listarMascotas() {
        try {
            List<Mascota> mascotas = mascotaDAO.findAll();
            System.out.println("Lista de mascotas:");
            for (Mascota mascota : mascotas) {
                System.out.println(mascota);
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar listar las mascotas: " + e.getMessage());
        }
    }

    public void actualizarMascota(int id, String nombre, String tipo, int edad, String raza) {
        try {
            Mascota mascota = new Mascota(id, nombre, tipo, edad, raza);
            mascotaDAO.update(mascota);
            System.out.println("Mascota actualizada correctamente: " + mascota);
        } catch (SQLException e) {
            System.out.println("Error al intentar actualizar la mascota: " + e.getMessage());
        }
    }

    public void eliminarMascota(int id) {
        try {
            mascotaDAO.delete(id);
            System.out.println("Mascota eliminada correctamente con ID: " + id);
        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar la mascota: " + e.getMessage());
        }
    }
}
