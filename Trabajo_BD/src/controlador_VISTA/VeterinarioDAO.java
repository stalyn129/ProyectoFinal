/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_VISTA;

import Controladores.VeterinarioJpaController;
import Controladores.exceptions.NonexistentEntityException;
import Modelo.Veterinario;
import ModeloTabla.ModeloTablaVeterinario;
import Persistencia.Persistencia;
import Vista.*;

import java.awt.Font;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VeterinarioDAO {
    Ventana_Veterinario V_Veterinario;
    Veterinario veterinario;
    Persistencia persistencia;
    VeterinarioJpaController controladorJpaVeterinario;
    ModeloTablaVeterinario mtablaVeterinario;
    Veterinario veterinarioSelect;

    public VeterinarioDAO(Ventana_Veterinario V_Veterinario) {
        this.V_Veterinario = V_Veterinario;
        this.V_Veterinario.setVisible(true);
        this.V_Veterinario.getBtnCrear().addActionListener((e) -> {
            try {
                insertarVeterinario();
            } catch (Exception ex) {
                Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.veterinario = new Veterinario();
        this.persistencia = new Persistencia();
        this.controladorJpaVeterinario = new VeterinarioJpaController(persistencia.getEntityManagerFactory());
        this.mtablaVeterinario = new ModeloTablaVeterinario();
        this.mtablaVeterinario.setFilasVeterinarios(controladorJpaVeterinario.findVeterinarioEntities());
        this.V_Veterinario.getTabla_Veterinario().setModel(mtablaVeterinario);
        this.V_Veterinario.getTabla_Veterinario().getTableHeader().setFont(new Font("Segoe UI Light", Font.ITALIC, 15));

        this.V_Veterinario.getTabla_Veterinario().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int filaSeleccionada = V_Veterinario.getTabla_Veterinario().getSelectedRow();
                if (filaSeleccionada != -1) {
                    veterinarioSelect = mtablaVeterinario.obtenerVeterinarioDesdeIndice(filaSeleccionada);
                    if (veterinarioSelect != null) {
                        V_Veterinario.getTexto_Nombre().setText(veterinarioSelect.getNombre());
                        V_Veterinario.getTexto_Direccion().setText(veterinarioSelect.getDireccion());
                        V_Veterinario.getTexto_Telefono().setText(veterinarioSelect.getTelefono());
                        V_Veterinario.getTexto_Email().setText(veterinarioSelect.getEmail());
                        V_Veterinario.getTexto_Especialidad().setText(veterinarioSelect.getEspecialidad());
//                        V_Veterinario.getTexto_FechaNacimiento().setDate(veterinarioSelect.getFechaNacimiento());
                        V_Veterinario.getBtnEliminar().setEnabled(true);
                        V_Veterinario.getBtnModificar().setEnabled(true);
                        V_Veterinario.getBtnCrear().setEnabled(false);
                    }
                }
            }
        });

        this.V_Veterinario.getBtnEliminar().addActionListener((e) -> {
            try {
                eliminarVeterinario();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.V_Veterinario.getBtnModificar().addActionListener((e) -> modificarVeterinario());
        this.V_Veterinario.getBtnActualizar().addActionListener((e) -> actualizarTabla());
        this.V_Veterinario.getBtnEliminar().setEnabled(false);
        this.V_Veterinario.getBtnModificar().setEnabled(false);
    }

    public void actualizarTabla() {
        mtablaVeterinario = new ModeloTablaVeterinario();
        mtablaVeterinario.setFilasVeterinarios(controladorJpaVeterinario.findVeterinarioEntities());
        V_Veterinario.getTabla_Veterinario().setModel(mtablaVeterinario);
        V_Veterinario.getTexto_Nombre().setText("");
        V_Veterinario.getTexto_Direccion().setText("");
        V_Veterinario.getTexto_Telefono().setText("");
        V_Veterinario.getTexto_Email().setText("");
        V_Veterinario.getTexto_Especialidad().setText("");
//        V_Veterinario.getTexto_FechaNacimiento().setDate(null);
        this.veterinarioSelect = null;
        V_Veterinario.getBtnEliminar().setEnabled(false);
        V_Veterinario.getBtnModificar().setEnabled(false);
        V_Veterinario.getBtnCrear().setEnabled(true);
    }

    public void insertarVeterinario() throws Exception {
        try {
            if (!this.V_Veterinario.getTexto_Nombre().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Direccion().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Telefono().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Email().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Especialidad().getText().isEmpty()
                    
//                    &&
//                this.V_Veterinario.getTexto_FechaNacimiento().getDate() != null
                    
                    ) {

                this.veterinario.setNombre(this.V_Veterinario.getTexto_Nombre().getText());
                this.veterinario.setDireccion(this.V_Veterinario.getTexto_Direccion().getText());
                this.veterinario.setTelefono(this.V_Veterinario.getTexto_Telefono().getText());
                this.veterinario.setEmail(this.V_Veterinario.getTexto_Email().getText());
                this.veterinario.setEspecialidad(this.V_Veterinario.getTexto_Especialidad().getText());
//                this.veterinario.setFechaNacimiento(this.V_Veterinario.getTexto_FechaNacimiento().getDate());

                this.controladorJpaVeterinario.create(veterinario);

                V_Veterinario.getTexto_Nombre().setText("");
                V_Veterinario.getTexto_Direccion().setText("");
                V_Veterinario.getTexto_Telefono().setText("");
                V_Veterinario.getTexto_Email().setText("");
                V_Veterinario.getTexto_Especialidad().setText("");
//                V_Veterinario.getTexto_FechaNacimiento().setDate(null);
                actualizarTabla();
                System.out.println("Se guardó");
            } else {
                // Manejo de campos vacíos
            }
        } catch (HeadlessException e) {
            // Manejo de excepciones
        }
    }

    public void modificarVeterinario() {
        try {
            if (veterinarioSelect != null &&
                !this.V_Veterinario.getTexto_Nombre().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Direccion().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Telefono().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Email().getText().isEmpty() &&
                !this.V_Veterinario.getTexto_Especialidad().getText().isEmpty()
//                    &&
//                this.V_Veterinario.getTexto_FechaNacimiento().getDate() != null
                    ) {

                veterinarioSelect.setNombre(this.V_Veterinario.getTexto_Nombre().getText());
                veterinarioSelect.setDireccion(this.V_Veterinario.getTexto_Direccion().getText());
                veterinarioSelect.setTelefono(this.V_Veterinario.getTexto_Telefono().getText());
                veterinarioSelect.setEmail(this.V_Veterinario.getTexto_Email().getText());
                veterinarioSelect.setEspecialidad(this.V_Veterinario.getTexto_Especialidad().getText());
//                veterinarioSelect.setFechaNacimiento(this.V_Veterinario.getTexto_FechaNacimiento().getDate());

                this.controladorJpaVeterinario.edit(veterinarioSelect);

                actualizarTabla();
                this.veterinarioSelect = null;
                System.out.println("Se actualizó el veterinario correctamente");
            } else {
                // Manejo de campos vacíos o no selección
            }
        } catch (Exception e) {
            // Manejo de excepciones
        }
    }

    public void eliminarVeterinario() throws NonexistentEntityException {
        try {
            if (this.veterinarioSelect != null) {
                this.controladorJpaVeterinario.destroy(this.veterinarioSelect.getIdVeterinario());
                actualizarTabla();
                this.veterinarioSelect = null;
                System.out.println("Se eliminó correctamente el veterinario");
            } else {
                // Manejo de no selección
            }
        } catch (HeadlessException | NumberFormatException e) {
            // Manejo de excepciones
        }
    }
}
