package Controlador;

import Modelo.hashsetter;
import com.mysql.jdbc.StringUtils;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class TablaPosiciones {

    
     int A=0;
    public DefaultTableModel tablaPosicionesWin(String idtorneo) throws SQLException, IOException, ClassNotFoundException{
       Conexion CNX = new Conexion();
       PreparedStatement SQL;
       Connection con = null;
       con= CNX.getCnx();
       
       String Contar ="SELECT A.nombre,A.apellido, B.puntos, C.desempeno FROM jugador A"
                +" JOIN win B ON A.idjugador=B.idjugador "
                +"JOIN lose C ON B.idpartidas=C.idpartidas "
                +"JOIN partidas D ON D.idpartidas = B.idpartidas "
                +"JOIN rondas E ON D.idronda=E.id where e.idtorneo='"+idtorneo+"' "
                +" ORDER BY B.puntos desc, C.desempeno desc";
        SQL = con.prepareStatement(Contar);
        ResultSet resultContar = SQL.executeQuery();
        while(resultContar.next()){A++;}
         
        Set<hashsetter > tabla = new HashSet<hashsetter>();
        
   Object[] titulo = {"nombre","puntos", "desempeño rival"};
   DefaultTableModel dtm = new DefaultTableModel(null, titulo);
        String query = "SELECT A.nombre,A.apellido, B.puntos, C.desempeno FROM jugador A"
                +" JOIN win B ON A.idjugador=B.idjugador "
                +"JOIN lose C ON B.idpartidas=C.idpartidas "
                +"JOIN partidas D ON D.idpartidas = B.idpartidas "
                +"JOIN rondas E ON D.idronda=E.id where e.idtorneo='"+idtorneo+"' "
                +" ORDER BY B.puntos desc, C.desempeno desc";
        SQL = con.prepareStatement(query);
        ResultSet result = SQL.executeQuery();
        while (result.next()){
            tabla.add(new hashsetter(result.getString("nombre")+" "+result.getString("apellido"),
            Integer.parseInt(result.getString("puntos")),
            Integer.parseInt(result.getString("desempeno"))));
        }

       String query2 = "SELECT A.nombre,A.apellido, C.puntos, B.desempeno FROM jugador A"
                +" JOIN win B ON A.idjugador=B.idjugador "
                +"JOIN lose C ON B.idpartidas=C.idpartidas "
                +"JOIN partidas D ON D.idpartidas = B.idpartidas "
                +"JOIN rondas E ON D.idronda=E.id where e.idtorneo='"+idtorneo+"' " 
                +" ORDER BY C.puntos desc, B.desempeno desc";
        SQL = con.prepareStatement(query2);
        ResultSet result2 = SQL.executeQuery();
          while (result2.next()){
           tabla.add(new hashsetter(result2.getString("nombre")+" "+result2.getString("apellido"),
            Integer.parseInt(result2.getString("puntos")),
            Integer.parseInt(result2.getString("desempeno"))));
        }
   
      String query3 = "SELECT A.nombre,A.apellido, B.puntos, C.desempeno FROM jugador A"
                +" JOIN empatea B ON A.idjugador=B.idjugador "
                +"JOIN empateb C ON B.idpartidas=C.idpartidas "
                +"JOIN partidas D ON D.idpartidas = B.idpartidas "
                +"JOIN rondas E ON D.idronda=E.id where e.idtorneo='"+idtorneo+"' "
                +" ORDER BY B.puntos desc, C.desempeno desc";
        SQL = con.prepareStatement(query3);
        ResultSet result3 = SQL.executeQuery();
           while (result3.next()){
            tabla.add(new hashsetter(result3.getString("nombre")+" "+result3.getString("apellido"),
            Integer.parseInt(result3.getString("puntos")),
            Integer.parseInt(result3.getString("desempeno"))));
        }
 
        String query4 = "SELECT A.nombre,A.apellido, C.puntos, B.desempeno FROM jugador A"
                +" JOIN empatea B ON A.idjugador=B.idjugador "
                +"JOIN empateb C ON B.idpartidas=C.idpartidas "
                +"JOIN partidas D ON D.idpartidas = B.idpartidas "
                +"JOIN rondas E ON D.idronda=E.id where e.idtorneo='"+idtorneo+"' "
                +" ORDER BY C.puntos desc, B.desempeno desc";
        SQL = con.prepareStatement(query4);
        ResultSet result4 = SQL.executeQuery();
        
           while (result4.next()){
           tabla.add(new hashsetter(result4.getString("nombre")+" "+result4.getString("apellido"),
            Integer.parseInt(result4.getString("puntos")),
            Integer.parseInt(result4.getString("desempeno"))));
            
        }
           
           for (int i = 0; i < A; i++) {
               
               for (int j = 0; j < A ; j++) {
                
                   
                   }
               }
        
   result.close();
   result2.close();
   result3.close();
   result4.close();
   
        System.out.println(tabla.size());
        System.out.println(tabla);
   return dtm ;
}
   
}