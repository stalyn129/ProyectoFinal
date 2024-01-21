
package Clases;

import com.db4o.ObjectContainer;
import java.util.Date;

public class Persona {
    private String Cedula;//1
    private String Nombre;//2
    private String Apellido;//3
    private String Direccion;//4
    private Date Fecha_Nacimiento;//5
    private char Sexo;
    private String Cod_Nacionalidad;
    private String Cod_Especialidad;
    private String Email;//6
    private String Cod_Discapacidad;//7
    private String Contraseña;//9
    private String Telefono;//8
    private boolean Estado;

    public Persona() {
    }

    public Persona(String Cedula, String Nombre, String Apellido, String Direccion, Date Fecha_Nacimiento, char Sexo, String Cod_Nacionalidad, String Cod_Especialidad, String Email, String Cod_Discapacidad, String Contraseña, String Telefono, boolean Estado) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Sexo = Sexo;
        this.Cod_Nacionalidad = Cod_Nacionalidad;
        this.Cod_Especialidad = Cod_Especialidad;
        this.Email = Email;
        this.Cod_Discapacidad = Cod_Discapacidad;
        this.Contraseña = Contraseña;
        this.Telefono = Telefono;
        this.Estado = Estado;
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

    public String getCod_Especialidad() {
        return Cod_Especialidad;
    }

    public void setCod_Especialidad(String Cod_Especialidad) {
        this.Cod_Especialidad = Cod_Especialidad;
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

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    
}
