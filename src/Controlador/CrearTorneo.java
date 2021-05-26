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
public class CrearTorneo {
        
     

   
      public void crearTorneo(String nombre,String tipo, String fecha,String h) throws SQLException, IOException, ClassNotFoundException{
          Conexion CNX = new Conexion();
    PreparedStatement SQL;
       Connection con = null;
       con= CNX.getCnx();
       String query;
               
       query = "INSERT INTO torneo (nombre, tipo, fecha, hora) "
                    + "VALUES ('"+nombre+"','"+tipo+"','"+fecha+"','"+h+"');";
          System.out.println(query);
            
        SQL = con.prepareStatement(query);
        SQL.execute();
            
   }
}
