
package Controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;


public class Versus {
       
        int A=0;
        List<String> subrandidA = new ArrayList<>();
        List<String> subrandnombreA = new ArrayList<>();
        List<String> subrandidB = new ArrayList<>();
        List<String> subrandnombreB = new ArrayList<>();
        List<String> subrandapellidoA = new ArrayList<>();
        List<String> subrandapellidoB = new ArrayList<>();
        
        String  idRonda,id,nombre,apellido,id2,nombre2,apellido2;
   public DefaultTableModel buscarTorneo(String idTorneo, int tabRonda) throws SQLException, IOException, ClassNotFoundException{
       Conexion CNX = new Conexion();
       PreparedStatement SQL;
       Connection con = null;
       con= CNX.getCnx();
      Object[] tabla = {"ID","Jugador A","Resultado","ID","Jugador B"};
       DefaultTableModel dtm =new DefaultTableModel(null, tabla);
       
        String query = "SELECT A.idjugador, A.nombre, A.apellido FROM jugador A LEFT JOIN jugadorestorneo B ON A.idjugador=B.idjugador where B.idtorneo = '"+idTorneo+"' ORDER BY rand()";
        SQL = con.prepareStatement(query);
        ResultSet result = SQL.executeQuery();
        String query2 = "SELECT * FROM jugadorestorneo where idtorneo ='"+idTorneo+"' ORDER BY rand()";
        SQL = con.prepareStatement(query2);
         ResultSet result2 = SQL.executeQuery();
         while(result2.next()){A++;}
        List randid = new ArrayList<>();
        List randnombre= new ArrayList<>();
        List randapellido= new ArrayList<>();
        System.out.println(A);
        while (result.next()){
        
           randid.add(result.getString("idjugador"));
           randnombre.add(result.getString("nombre"));
           randapellido.add(result.getString("apellido"));
        }
       for (int i=0;i<=(A/2)-1;i++){
        subrandidA= randid.subList(i,i+1);
        subrandnombreA= randnombre.subList(i,i+1);
        subrandapellidoA=randapellido.subList(i, i+1);
        subrandidB=randid.subList((A/2)+i,((A/2)+i)+1);
        subrandnombreB=randnombre.subList((A/2)+i,((A/2)+i)+1);
        subrandapellidoB=randapellido.subList((A/2)+i,((A/2)+i)+1);
           
        System.out.println(subrandidA+" "+subrandnombreA+" "+subrandapellidoA+" VS "+subrandidB+" "+subrandnombreB+" "+subrandapellidoB);
        
         String query4 = "insert rondas(idtorneo,numeroronda) values ('"+idTorneo+"','"+tabRonda+"')";
        SQL = con.prepareStatement(query4);
        SQL.execute();
           System.out.println(idRonda);
        
        String query5 = "SELECT idrondas from rondas where idtorneo ='"+idTorneo+"' ORDER BY idtorneo desc LIMIT 1 ";
        System.out.println("query5 res: "+query5);
        SQL = con.prepareStatement(query5);
        ResultSet result5 = SQL.executeQuery();
        while(result5.next()){
            idRonda=result5.getString("idrondas");}
         System.out.println(idRonda);
 
        String query6 = "insert into modeloronda (`idtorneo`,`numronda`,`idp1`,`p1a`,`p1`,`idp2`,`p2`,`p2a`) values ('"+idTorneo+"','"+tabRonda+"','"+subrandidA+"','"+subrandnombreA+"','"+subrandapellidoA+"','"+subrandidB+"','"+subrandnombreB+"','"+subrandapellidoB+"')";
        System.out.println("query6 res: "+query6);
        SQL = con.prepareStatement(query6);
        SQL.execute();
       
       }
        
       
        String query3 = "SELECT idp1, p1, p1a, idp2, p2, p2a from modeloronda where idtorneo='"+idTorneo+"' && numronda='"+tabRonda+"'";
        System.out.println("query3 res: "+query3);
        SQL = con.prepareStatement(query3);
        ResultSet result3 = SQL.executeQuery();
        while(result3.next()){
           id=result3.getString("idp1");
           nombre=result3.getString("p1");
           apellido=result3.getString("p1a");
           id2=result3.getString("idp2");
           nombre2=result3.getString("p2");
           apellido2=result3.getString("p2a");
           
           System.out.println("Salida final: "+id+" "+nombre+" "+apellido+" VS "+id+" "+nombre+" "+apellido);
          dtm.addRow(new Object[] {id,apellido+" "+nombre,new JButton("Resultado"),id2,nombre2+" "+apellido2});}
       A=0;
       
           return dtm;
    }
}
        
   