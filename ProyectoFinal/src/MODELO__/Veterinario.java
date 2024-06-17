/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO__;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alexa
 */
@Entity
@Table(name = "VETERINARIO")
@NamedQueries({
    @NamedQuery(name = "Veterinario.findAll", query = "SELECT v FROM Veterinario v"),
    @NamedQuery(name = "Veterinario.findByIdVeterinario", query = "SELECT v FROM Veterinario v WHERE v.idVeterinario = :idVeterinario"),
    @NamedQuery(name = "Veterinario.findByNombre", query = "SELECT v FROM Veterinario v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "Veterinario.findByDireccion", query = "SELECT v FROM Veterinario v WHERE v.direccion = :direccion"),
    @NamedQuery(name = "Veterinario.findByTelefono", query = "SELECT v FROM Veterinario v WHERE v.telefono = :telefono"),
    @NamedQuery(name = "Veterinario.findByEmail", query = "SELECT v FROM Veterinario v WHERE v.email = :email"),
    @NamedQuery(name = "Veterinario.findByEspecialidad", query = "SELECT v FROM Veterinario v WHERE v.especialidad = :especialidad"),
    @NamedQuery(name = "Veterinario.findByFechaNacimiento", query = "SELECT v FROM Veterinario v WHERE v.fechaNacimiento = :fechaNacimiento")})
public class Veterinario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_VETERINARIO")
    private BigDecimal idVeterinario;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @OneToMany(mappedBy = "idVeterinario")
    private Collection<Mascota> mascotaCollection;

    public Veterinario() {
    }

    public Veterinario(BigDecimal idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Veterinario(BigDecimal idVeterinario, String nombre) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
    }

    public BigDecimal getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(BigDecimal idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Collection<Mascota> getMascotaCollection() {
        return mascotaCollection;
    }

    public void setMascotaCollection(Collection<Mascota> mascotaCollection) {
        this.mascotaCollection = mascotaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeterinario != null ? idVeterinario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veterinario)) {
            return false;
        }
        Veterinario other = (Veterinario) object;
        if ((this.idVeterinario == null && other.idVeterinario != null) || (this.idVeterinario != null && !this.idVeterinario.equals(other.idVeterinario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO__.Veterinario[ idVeterinario=" + idVeterinario + " ]";
    }
    
}
