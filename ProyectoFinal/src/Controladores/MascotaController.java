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

    public void guardarMascota(String nombre, String tipo, int edad, String raza, int idCliente) {
        Mascota mascota = new Mascota(nombre, tipo, edad, raza, idCliente);
        try {
            mascotaDAO.save(mascota);
            System.out.println("Mascota guardada correctamente: " + mascota);
        } catch (SQLException e) {
            System.out.println("Error al guardar la mascota: " + e.getMessage());
        }
    }

    public Mascota buscarMascota(String nombreMascota, int idCliente) {
        try {
            return mascotaDAO.find(nombreMascota, idCliente);
        } catch (SQLException e) {
            System.out.println("Error al buscar la mascota: " + e.getMessage());
            return null;
        }
    }

    public List<Mascota> obtenerTodasLasMascotasPorCliente(int idCliente) {
        try {
            return mascotaDAO.findAllByCliente(idCliente);
        } catch (SQLException e) {
            System.out.println("Error al obtener las mascotas del cliente: " + e.getMessage());
            return null;
        }
    }

    public void actualizarMascota(String nombre, String tipo, int edad, String raza, int idCliente) {
        try {
            Mascota mascota = mascotaDAO.find(nombre, idCliente);
            if (mascota != null) {
                mascota.setTipo(tipo);
                mascota.setEdad(edad);
                mascota.setRaza(raza);
                mascotaDAO.update(mascota);
                System.out.println("Mascota actualizada correctamente.");
            } else {
                System.out.println("Mascota no encontrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar la mascota: " + e.getMessage());
        }
    }

    public void eliminarMascota(String nombreMascota, int idCliente) {
        try {
            mascotaDAO.delete(nombreMascota, idCliente);
            System.out.println("Mascota eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar la mascota: " + e.getMessage());
        }
    }
}
