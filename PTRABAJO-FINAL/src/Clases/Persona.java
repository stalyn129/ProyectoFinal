
package Clases;

import java.util.Date;

public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private Date Fecha_Nacimiento;
    private char Sexo;
    private String Cod_Nacionalidad;
    private String Nacionalidad;
    private String Email;
    private String Cod_Discapacidad;
    private String Discapacidad;
    private String Contraseña;
    private String Telefono;

    public Persona() {
    }

    public Persona(String Cedula, String Nombre, String Apellido, String Direccion, Date Fecha_Nacimiento, char Sexo, String Cod_Nacionalidad, String Nacionalidad, String Email, String Cod_Discapacidad, String Discapacidad, String Contraseña, String Telefono) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Sexo = Sexo;
        this.Cod_Nacionalidad = Cod_Nacionalidad;
        this.Nacionalidad = Nacionalidad;
        this.Email = Email;
        this.Cod_Discapacidad = Cod_Discapacidad;
        this.Discapacidad = Discapacidad;
        this.Contraseña = Contraseña;
        this.Telefono = Telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getCod_Nacionalidad() {
        return Cod_Nacionalidad;
    }

    public void setCod_Nacionalidad(String Cod_Nacionalidad) {
        this.Cod_Nacionalidad = Cod_Nacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCod_Discapacidad() {
        return Cod_Discapacidad;
    }

    public void setCod_Discapacidad(String Cod_Discapacidad) {
        this.Cod_Discapacidad = Cod_Discapacidad;
    }

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public void setDiscapacidad(String Discapacidad) {
        this.Discapacidad = Discapacidad;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Sexo=" + Sexo + ", Cod_Nacionalidad=" + Cod_Nacionalidad + ", Nacionalidad=" + Nacionalidad + ", Email=" + Email + ", Cod_Discapacidad=" + Cod_Discapacidad + ", Discapacidad=" + Discapacidad + ", Contrase\u00f1a=" + Contraseña + ", Telefono=" + Telefono + '}';
    }

    

    
}
