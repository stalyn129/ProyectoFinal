
package Clases;

import com.db4o.ObjectContainer;
import java.util.Date;

public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private Date Fecha_Nacimiento;
    private char Sexo;
    private String Cod_Nacionalidad;
    private String Cod_Especialidad;
    private String Email;
    private String Cod_Discapacidad;
    private String Contraseña;
    private String Telefono;

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Fecha_Nacimiento
     */
    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    /**
     * @param Fecha_Nacimiento the Fecha_Nacimiento to set
     */
    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    /**
     * @return the Sexo
     */
    public char getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Cod_Nacionalidad
     */
    public String getCod_Nacionalidad() {
        return Cod_Nacionalidad;
    }

    /**
     * @param Cod_Nacionalidad the Cod_Nacionalidad to set
     */
    public void setCod_Nacionalidad(String Cod_Nacionalidad) {
        this.Cod_Nacionalidad = Cod_Nacionalidad;
    }

    /**
     * @return the Cod_Especialidad
     */
    public String getCod_Especialidad() {
        return Cod_Especialidad;
    }

    /**
     * @param Cod_Especialidad the Cod_Especialidad to set
     */
    public void setCod_Especialidad(String Cod_Especialidad) {
        this.Cod_Especialidad = Cod_Especialidad;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Cod_Discapacidad
     */
    public String getCod_Discapacidad() {
        return Cod_Discapacidad;
    }

    /**
     * @param Cod_Discapacidad the Cod_Discapacidad to set
     */
    public void setCod_Discapacidad(String Cod_Discapacidad) {
        this.Cod_Discapacidad = Cod_Discapacidad;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Persona(String Cedula, String Nombre, String Apellido, String Direccion, Date Fecha_Nacimiento, char Sexo, String Cod_Nacionalidad, String Cod_Especialidad, String Email, String Cod_Discapacidad, String Contraseña, String Telefono) {
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
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Sexo=" + Sexo + ", Cod_Nacionalidad=" + Cod_Nacionalidad + ", Cod_Especialidad=" + Cod_Especialidad + ", Email=" + Email + ", Cod_Discapacidad=" + Cod_Discapacidad + ", Contrase\u00f1a=" + Contraseña + ", Telefono=" + Telefono + '}';
    }
}
