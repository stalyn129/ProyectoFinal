
package Clases;

import java.util.Date;

public abstract class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private Date Fecha_Nacimiento;
    private char Sexo;
    private String Nacionalidad;
    private String Email;
    private String Discapacidad;
    private String Usuario;
    private String Contraseña;
    private String Telefono;
    
///////////////////////
    public Persona() {
    }

    public Persona(String Cedula, String Nombre, String Apellido, String Direccion, Date Fecha_Nacimiento, char Sexo, String Nacionalidad, String Email, String Discapacidad, String Usuario, String Contraseña, String Telefono) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Sexo = Sexo;
        this.Nacionalidad = Nacionalidad;
        this.Email = Email;
        this.Discapacidad = Discapacidad;
        this.Usuario = Usuario;
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

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public void setDiscapacidad(String Discapacidad) {
        this.Discapacidad = Discapacidad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
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
        return "Persona{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Sexo=" + Sexo + ", Nacionalidad=" + Nacionalidad + ", Email=" + Email + ", Discapacidad=" + Discapacidad + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Telefono=" + Telefono + '}';
    }

    
}
