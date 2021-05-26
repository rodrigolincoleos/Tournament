/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rodrigo
 */
public class CrearJugadoresTorneo {
    
    public void crearJT(String idjugador, String idtorneo) throws SQLException{
        Conexion CNX = new Conexion();
        PreparedStatement SQL;
        Connection con = null;
        con= CNX.getCnx();
        String query;
               
       query = "INSERT INTO jugadorestorneo (idtorneo, idjugador) "
                    + "VALUES ('"+idtorneo+"','"+idjugador+"');";
            
        SQL = con.prepareStatement(query);
        SQL.execute();
        
    }
}
