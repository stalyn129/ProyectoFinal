/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void save(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Clientes (nombre, direccion, telefono, email) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getDireccion());
            stmt.setString(3, cliente.getTelefono());
            stmt.setString(4, cliente.getEmail());
            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                cliente.setId(generatedKeys.getInt(1));
            }
        }
    }

    public Cliente find(int id) throws SQLException {
        String sql = "SELECT * FROM Clientes WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("email")
                );
            }
        }
        return null;
    }

    public List<Cliente> findAll() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Clientes";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("email")
                );
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    public void update(Cliente cliente) throws SQLException {
        String sql = "UPDATE Clientes SET nombre = ?, direccion = ?, telefono = ?, email = ? WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getDireccion());
            stmt.setString(3, cliente.getTelefono());
            stmt.setString(4, cliente.getEmail());
            stmt.setInt(5, cliente.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Clientes WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
