package Controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TablaPosiciones1 {
    
      
       ArrayList<String> nombres = new ArrayList<>();
       ArrayList<String> ids = new ArrayList<>();
       ArrayList<String> puntos = new ArrayList<>();
       int A =0;
    public DefaultTableModel tablaPosicionesWin(String idtorneo) throws SQLException, IOException, ClassNotFoundException{
       Conexion CNX = new Conexion();
       PreparedStatement SQL;
       Connection con = null;
       con= CNX.getCnx();
        Object[] titulo = {"ids","nombre","puntos"};
       DefaultTableModel dtm = new DefaultTableModel(null, titulo);
        String Contar ="SELECT idjugador FROM jugadorestorneo WHERE idtorneo='"+idtorneo+"'";
        SQL = con.prepareStatement(Contar);
        ResultSet resultContar = SQL.executeQuery();
        while(resultContar.next()){A++;}
    
        
       String query =  "SELECT A.idjugador,A.nombre,A.apellido FROM jugador A "
                        +"JOIN jugadorestorneo B ON B.idjugador=A.idjugador where B.idtorneo='"+idtorneo+"'";
        SQL = con.prepareStatement(query);
        ResultSet result = SQL.executeQuery();
        while(result.next()){
            ids.add(result.getString("idjugador"));
            nombres.add(result.getString("nombre")+" "+result.getString("Apellido"));
             
        }
        int puntaje=0;
        String puntajeeA,puntajeeB,puntajeW;
        for (int i = 0; i < A; i++) {
            String query2 =  "SELECT A.puntos as EA, B.puntos AS EB, C.puntos as W FROM jugador E "
                             +"left JOIN jugadorestorneo jt ON jt.idjugador = E.idjugador "
                             +"left JOIN empatea A on A.idjugador=E.idjugador "
                             +"left JOIN empateb B ON B.idjugador=E.idjugador "
                             +"left JOIN win C ON C.idjugador=E.idjugador " 
                             + "WHERE E.idjugador='"+ids.get(i)+"' AND jt.idtorneo='"+idtorneo+"'";
            System.out.println("id: "+ids.get(i));
            System.out.println(query2);
        SQL = con.prepareStatement(query2);
        ResultSet result2 = SQL.executeQuery();
        while(result2.next()){
            
            if(result2.getString("EA")==null){puntajeeA="0";}else{puntajeeA=result2.getString("EA");}
            if(result2.getString("EB")==null){puntajeeB="0";}else{puntajeeB=result2.getString("EB");}
            if(result2.getString("W")==null){puntajeW="0";}else{puntajeW=result2.getString("W");}
            System.out.println("EA = "+puntajeeA);
            System.out.println("EB = "+puntajeeB);
            System.out.println("W = "+puntajeW);
            puntaje=Integer.parseInt(puntajeW)+Integer.parseInt(puntajeeA)+Integer.parseInt(puntajeeB);
            puntos.add(String.valueOf(puntaje));
           
        }
         System.out.println("Puntaje: "+puntaje);
          dtm.addRow(new Object[] {ids.get(i),nombres.get(i),puntos.get(i)});
        }
       
        return dtm;
}
}
