/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.table.DefaultTableModel;
import pojo.Proyecto;

/**
 *
 * @author Sistemas-12
 */
public class ControlDeFlujo {
    private DefaultTableModel tableModel;
    private Proyecto proyecto;

    public ControlDeFlujo(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    
    public void cargarTabla() {
        Object[] columnNames = cargarColumnNames();
        
    }
    
    private Object[] cargarColumnNames() {
        int plazo = proyecto.getPlazo();
        
        Object[] columnNames = new Object[plazo + 1];
        
        for (int i = 0; i < columnNames.length; i++) {
            if (i == 0) {
                columnNames[i] = "Datos";
                continue;
            }
            columnNames[i] = i;
        }
        
        return columnNames;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
}
