/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTabla;

import Modelo.Cliente;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloTablaCliente extends AbstractTableModel {

    private Cliente clienteSeleccionado = null;
    private List<Cliente> filasClientes = null;
    private String[] titulos = null;
    private int rowIndex;

    public ModeloTablaCliente() {
        this.titulos = new String[]{"Nombre", "Dirección", "Teléfono", "Email"};
        this.filasClientes = new ArrayList<>();
    }

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }

    public List<Cliente> getFilasClientes() {
        return filasClientes;
    }

    public void setFilasClientes(List<Cliente> filasClientes) {
        this.filasClientes = filasClientes;
    }

    @Override
    public int getRowCount() {
        return filasClientes.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        clienteSeleccionado = filasClientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return clienteSeleccionado.getNombre();
            case 1:
                return clienteSeleccionado.getDireccion();
            case 2:
                return clienteSeleccionado.getTelefono();
            case 3:
                return clienteSeleccionado.getEmail();

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        clienteSeleccionado = filasClientes.get(row);
        switch (col) {
            case 0:
                clienteSeleccionado.setNombre((String) value);
                break;
            case 1:
                clienteSeleccionado.setDireccion((String) value);
                break;
            case 2:
                clienteSeleccionado.setTelefono((String) value);
                break;
            case 3:
                clienteSeleccionado.setEmail((String) value);


                break;
        }
        fireTableCellUpdated(row, col);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Ninguna celda es editable en este ejemplo
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
            case 1:
            case 2:
            case 3:
                return String.class;

            default:
                return Object.class;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return titulos[columnIndex];
    }

    public void update(Cliente object) {
        int index = filasClientes.indexOf(object);
        if (index != -1) {
            filasClientes.set(index, object);
            fireTableRowsUpdated(index, index);
        }
    }

    public void addRow(Cliente object) {
        filasClientes.add(object);
        fireTableRowsInserted(filasClientes.size() - 1, filasClientes.size() - 1);
    }

    public void deleteRow(Cliente p) {
        int index = filasClientes.indexOf(p);
        if (index != -1) {
            filasClientes.remove(index);
            fireTableRowsDeleted(index, index);
        }
    }

    public void deleteAll() {
        int size = filasClientes.size();
        if (size > 0) {
            filasClientes.clear();
            fireTableRowsDeleted(0, size - 1);
        }
    }

    public Cliente obtenerClienteDesdeIndice(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < filasClientes.size()) {
            return filasClientes.get(rowIndex);
        } else {
            JOptionPane.showMessageDialog(null, "¡El ID no se encontró!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}


