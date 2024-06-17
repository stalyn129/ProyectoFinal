/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_VISTA;


import Controladores.ClienteJpaController;
import Controladores.exceptions.NonexistentEntityException;
import Modelo.Cliente;
import ModeloTabla.ModeloTablaCliente;
import Persistencia.Persistencia;
import Vista.Ventana_Cliente;
import Main.*;
import com.sun.tools.javac.Main;

import java.awt.Font;
import java.awt.HeadlessException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ClienteDAO {
    Ventana_Cliente V_Cliente;
    Cliente cliente;
    Persistencia persistencia;
    ClienteJpaController controladorJpaCliente;
    ModeloTablaCliente mtablaCliente;
    Cliente clienteSelect;
    
    public ClienteDAO(Ventana_Cliente V_Cliente) {
        this.V_Cliente = V_Cliente;
        this.V_Cliente.setVisible(true);
        this.V_Cliente.getBtnCrear().addActionListener((e) -> {
            try {
                insertarCliente();
            } catch (Exception ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.cliente = new Cliente();
        this.persistencia = new Persistencia();
        this.controladorJpaCliente = new ClienteJpaController(persistencia.getEntityManagerFactory());
        this.mtablaCliente = new ModeloTablaCliente();
        this.mtablaCliente.setFilasClientes(controladorJpaCliente.findClienteEntities());
        this.V_Cliente.getTabla_Cliente().setModel(mtablaCliente);
        this.V_Cliente.getTabla_Cliente().getTableHeader().setFont(new Font("Segoe UI Light", Font.ITALIC, 15));
        
        this.V_Cliente.getTabla_Cliente().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int filaSeleccionada = V_Cliente.getTabla_Cliente().getSelectedRow();
                if (filaSeleccionada != -1) {
                    clienteSelect = mtablaCliente.obtenerClienteDesdeIndice(filaSeleccionada);
                    if (clienteSelect != null) {
                        V_Cliente.getTexto_Nombre().setText(clienteSelect.getNombre());
                        V_Cliente.getTexto_Direccion().setText(clienteSelect.getDireccion());
                        V_Cliente.getTexto_Telefono().setText(clienteSelect.getTelefono());
                        V_Cliente.getTexto_Email().setText(clienteSelect.getEmail());
//                        V_Cliente.getTexto_FechaNacimiento().setDate(clienteSelect.getFechaNacimiento());
                        V_Cliente.getBtnEliminar().setEnabled(true);
                        V_Cliente.getBtnModificar().setEnabled(true);
                        V_Cliente.getBtnCrear().setEnabled(false);
                    }
                }
            }
        });
        
        this.V_Cliente.getBtnEliminar().addActionListener((e) -> {
            try {
                eliminarCliente();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.V_Cliente.getBtnModificar().addActionListener((e) -> modificarCliente());
        this.V_Cliente.getBtnActualizar().addActionListener((e) -> actualizarTabla());
//        this.V_Cliente.getBtnBuscar().addActionListener((e) -> buscarTabla());
        this.V_Cliente.getBtnEliminar().setEnabled(false);
        this.V_Cliente.getBtnModificar().setEnabled(false);
//        this.V_Cliente.getBtnRegresar_cliente().addActionListener((e) -> this.V_Cliente.setVisible(false));
    }
    

    
    public void actualizarTabla() {
        mtablaCliente = new ModeloTablaCliente();
        mtablaCliente.setFilasClientes(controladorJpaCliente.findClienteEntities());
        V_Cliente.getTabla_Cliente().setModel(mtablaCliente);
        V_Cliente.getTexto_Nombre().setText("");
        V_Cliente.getTexto_Direccion().setText("");
        V_Cliente.getTexto_Telefono().setText("");
        V_Cliente.getTexto_Email().setText("");
//        V_Cliente.getTexto_FechaNacimiento().setDate(null);
        this.clienteSelect = null;
        V_Cliente.getBtnEliminar().setEnabled(false);
        V_Cliente.getBtnModificar().setEnabled(false);
        V_Cliente.getBtnCrear().setEnabled(true);
    }
    
    public void insertarCliente() throws Exception {
        try {
            if (!this.V_Cliente.getTexto_Nombre().getText().isEmpty() && 
                !this.V_Cliente.getTexto_Direccion().getText().isEmpty() &&
                !this.V_Cliente.getTexto_Telefono().getText().isEmpty() &&
                !this.V_Cliente.getTexto_Email().getText().isEmpty() ) {
                
                this.cliente.setNombre(this.V_Cliente.getTexto_Nombre().getText());
                this.cliente.setDireccion(this.V_Cliente.getTexto_Direccion().getText());
                this.cliente.setTelefono(this.V_Cliente.getTexto_Telefono().getText());
                this.cliente.setEmail(this.V_Cliente.getTexto_Email().getText());
//                this.cliente.setFechaNacimiento(this.V_Cliente.getTexto_FechaNacimiento().getDate());
                
                this.controladorJpaCliente.create(cliente);
                
                V_Cliente.getTexto_Nombre().setText("");
                V_Cliente.getTexto_Direccion().setText("");
                V_Cliente.getTexto_Telefono().setText("");
                V_Cliente.getTexto_Email().setText("");
//                V_Cliente.getTexto_FechaNacimiento().setDate(null);
                actualizarTabla();
                System.out.println("se guardo");
//                Main.Recursos.success("Ingreso de Clientes", "Se guardo correctamente el Cliente");
            } else {
//                Main.Recursos.warning("Ingreso de Clientes", "Llene todos los campos para guardar el cliente");
            }
        } catch (HeadlessException e) {
            // Manejo de excepciones
        }
    }
    
    public void modificarCliente() {
        try {
            if (clienteSelect != null &&
                !this.V_Cliente.getTexto_Nombre().getText().isEmpty() && 
                !this.V_Cliente.getTexto_Direccion().getText().isEmpty() &&
                !this.V_Cliente.getTexto_Telefono().getText().isEmpty() &&
                !this.V_Cliente.getTexto_Email().getText().isEmpty() 
//                    &&
//                this.V_Cliente.getTexto_FechaNacimiento().getDate() != null
                    ) {
                
                clienteSelect.setNombre(this.V_Cliente.getTexto_Nombre().getText());
                clienteSelect.setDireccion(this.V_Cliente.getTexto_Direccion().getText());
                clienteSelect.setTelefono(this.V_Cliente.getTexto_Telefono().getText());
                clienteSelect.setEmail(this.V_Cliente.getTexto_Email().getText());
//                clienteSelect.setFechaNacimiento(this.V_Cliente.getTexto_FechaNacimiento().getDate()
//                
//                );
                
                this.controladorJpaCliente.edit(clienteSelect);
                
                actualizarTabla();
                this.clienteSelect = null;
                
//                Main.Recursos.success("Modificación", "Se actualizó el Cliente correctamente");
            } else {
//                Main.Recursos.warning("Modificación", "Seleccione el Cliente a modificar y complete todos los campos");
            }
        } catch (Exception e) {
            // Manejo de excepciones
        }
    }
    
    public void eliminarCliente() throws NonexistentEntityException {
        try {
            if (this.clienteSelect != null) {
                this.controladorJpaCliente.destroy(this.clienteSelect.getIdCliente());
                actualizarTabla();
                this.clienteSelect = null;
//                Main.Recursos.success("Eliminar", "Se eliminó correctamente el Cliente");
            } else {
//                Main.Recursos.warning("Eliminar", "Seleccione el Cliente a eliminar");
            }
        } catch (HeadlessException | NumberFormatException e) {
            // Manejo de excepciones
        }
    }
}