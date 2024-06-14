/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDAO {

    public void save(Veterinario veterinario) throws SQLException {
        String sql = "INSERT INTO Veterinarios (nombre, direccion, telefono, email, especialidad) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, veterinario.getNombre());
            stmt.setString(2, veterinario.getDireccion());
            stmt.setString(3, veterinario.getTelefono());
            stmt.setString(4, veterinario.getEmail());
            stmt.setString(5, veterinario.getEspecialidad());
            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                veterinario.setId(generatedKeys.getInt(1));
            }
        }
    }

    public Veterinario find(int id) throws SQLException {
        String sql = "SELECT * FROM Veterinarios WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Veterinario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("especialidad")
                );
            }
        }
        return null;
    }

    public List<Veterinario> findAll() throws SQLException {
        List<Veterinario> veterinarios = new ArrayList<>();
        String sql = "SELECT * FROM Veterinarios";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Veterinario veterinario = new Veterinario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("especialidad")
                );
                veterinarios.add(veterinario);
            }
        }
        return veterinarios;
    }

    public void update(Veterinario veterinario) throws SQLException {
        String sql = "UPDATE Veterinarios SET nombre = ?, direccion = ?, telefono = ?, email = ?, especialidad = ? WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, veterinario.getNombre());
            stmt.setString(2, veterinario.getDireccion());
            stmt.setString(3, veterinario.getTelefono());
            stmt.setString(4, veterinario.getEmail());
            stmt.setString(5, veterinario.getEspecialidad());
            stmt.setInt(6, veterinario.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Veterinarios WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
