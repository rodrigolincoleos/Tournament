/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Rodrigo
 */
public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hadFocus, int row, int column) {
       if(value instanceof JButton){
       JButton btnres = (JButton)value;
       return btnres;
       }
        
        
        return super.getTableCellRendererComponent(jtable, value, isSelected, hadFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
  
}
