
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class BuscarJugador {
    
    public DefaultTableModel buscarJugador(String ir) throws SQLException{
        Conexion CNX = new Conexion();
        PreparedStatement SQL;
        Connection con;
        con= CNX.getCnx();
        String query = "SELECT * "
                + "FROM jugador WHERE "
                + "idjugador LIKE '%"+ir+"%' "
                + "OR idtor LIKE '%"+ir+"%' "
                + "OR nombre LIKE '%"+ir+"%' "
                + "OR apellido LIKE '%"+ir+"%' "
                + "OR rut LIKE '%"+ir+"%' "
                + "OR dv LIKE '%"+ir+"%' "
                + "OR email LIKE '%"+ir+"%' ";

        SQL = con.prepareStatement(query);
        ResultSet result = SQL.executeQuery();
        Object[] titulos={"ID","ID TOR","Nombre","Apellido","Rut","DV","mail"};
        DefaultTableModel dtm = new DefaultTableModel(null,titulos);
        while (result.next()){
            dtm.addRow(new Object[] {
            result.getString("idjugador"),
            result.getString("idtor"),
            result.getString("nombre"),
            result.getString("apellido"),
            result.getString("rut"),
            result.getString("dv"),
            result.getString("email")
        });
        }
       
        result.close();
        
        return dtm;
        
    }
    
}
