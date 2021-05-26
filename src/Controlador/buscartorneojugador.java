package Controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class buscartorneojugador {
     public DefaultTableModel participacionJugador(String idjugador) throws SQLException, IOException, ClassNotFoundException{
       Conexion CNX = new Conexion();
       PreparedStatement SQL;
       Connection con = null;
       con= CNX.getCnx();
       String query;
               
        query = "SELECT A.* FROM torneo A LEFT JOIN jugadorestorneo B ON A.id=B.idtorneo JOIN jugador C ON C.idjugador=B.idjugador WHERE C.idjugador = '"+idjugador+"'";
        SQL = con.prepareStatement(query);
        ResultSet result = SQL.executeQuery();
        Object[] tabla = {"ID","Nombre","Tipo","Fecha","Hora"};
       DefaultTableModel dtm =new DefaultTableModel(null, tabla);
        while (result.next()){
            dtm.addRow(new Object[] {
            result.getString("id"),
            result.getString("nombre"),
            result.getString("tipo"),
            result.getString("fecha"),
            result.getString("hora")
        });
        }
   result.close();
   
        return dtm;
   }
}
