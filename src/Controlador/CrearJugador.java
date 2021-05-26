/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rodrigo
 */
public class CrearJugador {
     public void crearJugador(String idtor,String nombre, String apellido,String rut,String dv, String email) throws SQLException, IOException, ClassNotFoundException{
          Conexion CNX = new Conexion();
    PreparedStatement SQL;
       Connection con = null;
       con= CNX.getCnx();
       
      String query = "INSERT INTO jugador (idtor, nombre, apellido, rut, dv, email) "
                    + "VALUES ('"+idtor+"','"+nombre+"','"+apellido+"','"+rut+"','"+dv+"','"+email+"');";
            
        SQL = con.prepareStatement(query);
        SQL.execute();
            
   }
    
}
