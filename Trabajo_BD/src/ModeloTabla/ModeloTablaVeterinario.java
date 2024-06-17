/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTabla;
import Modelo.Veterinario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Veronica C
 */
public class ModeloTablaVeterinario extends AbstractTableModel {

    private Veterinario veterinarioSeleccionado = null;
    private List<Veterinario> filasVeterinarios = null;
    private String[] titulos = null;
    private int rowIndex;

    public ModeloTablaVeterinario() {
        this.titulos = new String[]{"Nombre", "Dirección", "Teléfono", "Email", "Especialidad"};
        this.filasVeterinarios = new ArrayList<>();
    }

    public Veterinario getVeterinarioSeleccionado() {
        return veterinarioSeleccionado;
    }

    public void setVeterinarioSeleccionado(Veterinario veterinarioSeleccionado) {
        this.veterinarioSeleccionado = veterinarioSeleccionado;
    }

    public List<Veterinario> getFilasVeterinarios() {
        return filasVeterinarios;
    }

    public void setFilasVeterinarios(List<Veterinario> filasVeterinarios) {
        this.filasVeterinarios = filasVeterinarios;
    }

    @Override
    public int getRowCount() {
        return filasVeterinarios.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        veterinarioSeleccionado = filasVeterinarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return veterinarioSeleccionado.getNombre();
            case 1:
                return veterinarioSeleccionado.getDireccion();
            case 2:
                return veterinarioSeleccionado.getTelefono();
            case 3:
                return veterinarioSeleccionado.getEmail();
            case 4:
                return veterinarioSeleccionado.getEspecialidad();

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        veterinarioSeleccionado = filasVeterinarios.get(row);
        switch (col) {
            case 0:
                veterinarioSeleccionado.setNombre((String) value);
                break;
            case 1:
                veterinarioSeleccionado.setDireccion((String) value);
                break;
            case 2:
                veterinarioSeleccionado.setTelefono((String) value);
                break;
            case 3:
                veterinarioSeleccionado.setEmail((String) value);
                break;
            case 4:
                veterinarioSeleccionado.setEspecialidad((String) value);
                break;
            case 5:
                break;
        }
        fireTableCellUpdated(row, col);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // No permitimos la edición directa en la tabla
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: // Nombre
            case 1: // Dirección
            case 2: // Teléfono
            case 3: // Email
            case 4: // Especialidad
                return String.class;
            case 5: // Fecha de Nacimiento
                return Date.class;
            default:
                return Object.class;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return titulos[columnIndex];
    }

    public void update(Veterinario object) {
        int index = filasVeterinarios.indexOf(object);
        if (index != -1) {
            filasVeterinarios.set(index, object);
            fireTableRowsUpdated(index, index);
        }
    }

    public void addRow(Veterinario object) {
        filasVeterinarios.add(object);
        fireTableRowsInserted(filasVeterinarios.size() - 1, filasVeterinarios.size() - 1);
    }

    public void deleteRow(Veterinario p) {
        int index = filasVeterinarios.indexOf(p);
        if (index != -1) {
            filasVeterinarios.remove(index);
            fireTableRowsDeleted(index, index);
        }
    }

    public void deleteAll() {
        int size = filasVeterinarios.size();
        if (size > 0) {
            filasVeterinarios.clear();
            fireTableRowsDeleted(0, size - 1);
        }
    }

    public Veterinario obtenerVeterinarioDesdeIndice(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < filasVeterinarios.size()) {
            return filasVeterinarios.get(rowIndex);
        } else {
            JOptionPane.showMessageDialog(null, "¡El ID no se encontró!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

