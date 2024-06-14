/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO {

    public void save(Mascota mascota) throws SQLException {
        String sql = "INSERT INTO Mascotas (nombre, tipo, edad, raza) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, mascota.getNombre());
            stmt.setString(2, mascota.getTipo());
            stmt.setInt(3, mascota.getEdad());
            stmt.setString(4, mascota.getRaza());
            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                mascota.setId(generatedKeys.getInt(1));
            } else {
                throw new SQLException("No se pudo obtener el ID generado para la mascota.");
            }
        }
    }

    public Mascota find(int id) throws SQLException {
        String sql = "SELECT * FROM Mascotas WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Mascota(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("edad"),
                        rs.getString("raza")
                );
            }
        }
        return null;
    }

    public List<Mascota> findAll() throws SQLException {
        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT * FROM Mascotas";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Mascota mascota = new Mascota(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("edad"),
                        rs.getString("raza")
                );
                mascotas.add(mascota);
            }
        }
        return mascotas;
    }

    public void update(Mascota mascota) throws SQLException {
        String sql = "UPDATE Mascotas SET nombre = ?, tipo = ?, edad = ?, raza = ? WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mascota.getNombre());
            stmt.setString(2, mascota.getTipo());
            stmt.setInt(3, mascota.getEdad());
            stmt.setString(4, mascota.getRaza());
            stmt.setInt(5, mascota.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Mascotas WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
