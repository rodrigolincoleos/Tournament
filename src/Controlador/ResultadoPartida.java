/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ResultadoPartida {
    
   public void insertarResultado(int idtorneo,int numeroronda, String win, String lose,int j1ptos, int j2ptos, int desempenoA, int desempenoB) throws SQLException{
        Conexion CNX = new Conexion();
        PreparedStatement SQL;
        Connection con;
        con= CNX.getCnx();
       
        String query1 = "INSERT INTO rondas (idtorneo, numeroronda) "
                    + "VALUES ('"+idtorneo+"','"+numeroronda+"');";
        System.out.println("query1: "+query1);
        SQL = con.prepareStatement(query1);
        SQL.execute();
        String idronda=null;
        
        String query2 = "SELECT id from rondas ORDER BY id desc LIMIT 1 ";
        System.out.println("query2 res: "+query2);
        SQL = con.prepareStatement(query2);
        ResultSet result = SQL.executeQuery();
        while(result.next()){
            idronda=result.getString("id");}
        
        
        String query3 = "INSERT INTO `partidas`(idronda) VALUES ('"+idronda+"')";
        System.out.println("query3 res: "+query3);        
        SQL = con.prepareStatement(query3);
        SQL.execute();
        String idpartida = null;
        
        String query4 = "SELECT idpartidas from partidas ORDER BY idpartidas desc LIMIT 1 ";
        System.out.println("query4 res: "+query4);
        SQL = con.prepareStatement(query4);
        ResultSet result4 = SQL.executeQuery();
        while(result4.next()){
            idpartida=result4.getString("idpartidas");}
        
                
        String query5 = "INSERT INTO lose (idpartidas, idjugador, puntos, desempeno) "
                    + "VALUES ('"+idpartida+"','"+lose+"','"+j2ptos+"','"+desempenoB+"');";
        System.out.println("query5 res: "+query5);
     
        SQL = con.prepareStatement(query5);
        SQL.execute();
      
        
        String query6 = "INSERT INTO win (idpartidas, idjugador, puntos, desempeno) "
                    + "VALUES ('"+idpartida+"','"+win+"','"+j1ptos+"','"+desempenoA+"');";
        System.out.println("query6 res: "+query6);
       
        SQL = con.prepareStatement(query6);
        SQL.execute();
        
        
   }
   
   public void insertarEmpate(int idtorneo,int numeroronda, String win, String lose,int j1ptos, int j2ptos, int desempenoA, int desempenoB) throws SQLException{
             Conexion CNX = new Conexion();
        PreparedStatement SQL;
        Connection con;
        con= CNX.getCnx();
       
        String query1 = "INSERT INTO rondas (idtorneo, numeroronda) "
                    + "VALUES ('"+idtorneo+"','"+numeroronda+"');";
        System.out.println("query1: "+query1);
        SQL = con.prepareStatement(query1);
        SQL.execute();
        String idronda=null;
        
        String query2 = "SELECT id from rondas ORDER BY id desc LIMIT 1 ";
        System.out.println("query2 res: "+query2);
        SQL = con.prepareStatement(query2);
        ResultSet result = SQL.executeQuery();
        while(result.next()){
            idronda=result.getString("id");}
        
        
        String query3 = "INSERT INTO `partidas`(idronda) VALUES ('"+idronda+"')";
        System.out.println("query3 res: "+query3);        
        SQL = con.prepareStatement(query3);
        SQL.execute();
        String idpartida = null;
        
        String query4 = "SELECT idpartidas from partidas ORDER BY idpartidas desc LIMIT 1 ";
        System.out.println("query4 res: "+query4);
        SQL = con.prepareStatement(query4);
        ResultSet result4 = SQL.executeQuery();
        while(result4.next()){
            idpartida=result4.getString("idpartidas");}
        
                
        String query5 = "INSERT INTO empatea (idpartidas, idjugador, puntos, desempeno) "
                    + "VALUES ('"+idpartida+"','"+win+"','"+j1ptos+"','"+desempenoA+"');";
        System.out.println("query5: "+query5);
        SQL = con.prepareStatement(query5);
        SQL.execute();
        
        
        String query6 = "INSERT INTO empateb (idpartidas, idjugador, puntos, desempeno) "
                    + "VALUES ('"+idpartida+"','"+lose+"','"+j2ptos+"','"+desempenoB+"');";
        System.out.println("query6: "+query6);
        SQL = con.prepareStatement(query6);
        SQL.execute();
        
   }
    
}