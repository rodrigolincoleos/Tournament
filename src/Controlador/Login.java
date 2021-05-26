/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Login {
    
    
    
    List validation = new ArrayList();
    
    
      public List LogIn(String user) throws SQLException, IOException, ClassNotFoundException {
        Conexion CNX=new Conexion();
        PreparedStatement SQL;
        Connection con = null;
        String queryPassword = "SELECT users, pass FROM users WHERE users='"+user+"'";
        System.out.println(queryPassword);
        con= CNX.getCnx();
        SQL = con.prepareStatement(queryPassword);
        ResultSet result = SQL.executeQuery();
        String PassDB = null;
        String UserDB = null;
       if (result.next()){
              UserDB=result.getString("users");
              PassDB=result.getString("pass");
              
              validation.add(UserDB);
              validation.add(PassDB);
       
       }
      result.close();
      
        return validation;
          
        }
      
}
