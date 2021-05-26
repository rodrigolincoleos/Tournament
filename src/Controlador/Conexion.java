/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Conexion {
    
    
    public static Connection cnx;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String database = "jdbc:mysql://localhost:3306";
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/myl";
 public Conexion(){
   
        
            try {
                Class.forName(driver);
                cnx=DriverManager.getConnection(url, user, password);
               
              
              }catch (ClassNotFoundException | SQLException ex) {
               JOptionPane.showMessageDialog(null,"Error de Acceso:\n No hay conexion a la base de datos\n:"+ ex,"Error", JOptionPane.ERROR_MESSAGE);
               
            }
}
     public Connection getCnx(){
               return cnx;
               }
    public static void closeCnx() throws SQLException{
    if(cnx!= null){
		cnx.close();
    JOptionPane.showMessageDialog(null,"Base de datos desconectada con exito","DataBase", JOptionPane.INFORMATION_MESSAGE);
               }
    }
}
    
