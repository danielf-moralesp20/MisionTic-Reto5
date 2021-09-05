/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.*;
import java.util.ArrayList;
import model.EscuelaModel;
import org.json.simple.parser.ParseException;
import utils.ConnectionDB;

/**
 *
 * @author dmcew
 */
public class EscuelaDAO {
    private Connection conn = null;
    
    public ArrayList<EscuelaModel> obtenerEscuelas() {
        ArrayList<EscuelaModel> escuelas = new ArrayList<EscuelaModel>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }
            String sql = "SELECT * FROM tbl_escuela WHERE id=?;";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                EscuelaModel escuela = new EscuelaModel(result.getInt(1),result.getString(2),
                    result.getString(3));
                escuelas.add(escuela);
            }
        } catch(SQLException ex) {
        
        }
        return escuelas;
            
    }  
    public Object obtenerEscuela(int id) {
        return null;
    }
    public void agregarEscuela(EscuelaModel escuela) throws ParseException {
        try{
            if(conn == null)
                conn = ConnectionDB.getConnection();
            String sql = "INSERT INTO Escuela(codigo_escuela,nombre_escuela,habilidad,anios_servicio,creador,fecha_inicio)"
                    +"VALUES(?,?,?,?,?,?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,escuela.getCodigo_escuela());
            statement.setString(2, escuela.getNombre_escuela());
            statement.setString(3,escuela.getHabilidad());
            statement.setInt(4,escuela.getAnios_servicio());
            statement.setString(5, escuela.getCreador());
            statement.setString(6,escuela.getFecha_inicio());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0)
                System.out.println("Se insertó");
            else
                System.out.println("No funcionó");
            conn.close();
            
            //Continuar
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
    public void eliminarLibro(int codigo_escuela) {
        
    }
    
}
