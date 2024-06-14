/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO {

    public void save(Mascota mascota) throws SQLException {
        String sql = "INSERT INTO Mascotas (nombre, tipo, edad, raza, idCliente) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mascota.getNombre());
            stmt.setString(2, mascota.getTipo());
            stmt.setInt(3, mascota.getEdad());
            stmt.setString(4, mascota.getRaza());
            stmt.setInt(5, mascota.getIdCliente());
            stmt.executeUpdate();
        }
    }

    public Mascota find(String nombreMascota, int idCliente) throws SQLException {
        String sql = "SELECT * FROM Mascotas WHERE nombre = ? AND idCliente = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreMascota);
            stmt.setInt(2, idCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Mascota(
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("edad"),
                        rs.getString("raza"),
                        idCliente // Usamos el idCliente como identificador único
                );
            }
        }
        return null;
    }

    public List<Mascota> findAllByCliente(int idCliente) throws SQLException {
        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT * FROM Mascotas WHERE idCliente = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Mascota mascota = new Mascota(
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("edad"),
                        rs.getString("raza"),
                        idCliente // Usamos el idCliente como identificador único
                );
                mascotas.add(mascota);
            }
        }
        return mascotas;
    }

    public void update(Mascota mascota) throws SQLException {
        String sql = "UPDATE Mascotas SET tipo = ?, edad = ?, raza = ? WHERE nombre = ? AND idCliente = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mascota.getTipo());
            stmt.setInt(2, mascota.getEdad());
            stmt.setString(3, mascota.getRaza());
            stmt.setString(4, mascota.getNombre());
            stmt.setInt(5, mascota.getIdCliente());
            stmt.executeUpdate();
        }
    }

    public void delete(String nombreMascota, int idCliente) throws SQLException {
        String sql = "DELETE FROM Mascotas WHERE nombre = ? AND idCliente = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreMascota);
            stmt.setInt(2, idCliente);
            stmt.executeUpdate();
        }
    }
}
