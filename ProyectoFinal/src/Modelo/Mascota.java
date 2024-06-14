/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Mascota {
    private String nombre;
    private String tipo;
    private int edad;
    private String raza;
    private int idCliente; 

    public Mascota(String nombre, String tipo, int edad, String raza, int idCliente) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.raza = raza;
        this.idCliente = idCliente;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
