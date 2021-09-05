package access;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.EscuelaModel;
import utils.ConnectionDB;

public class EscuelaDAO {
    private Connection conn;
    
    public EscuelaDAO() {
    	conn = ConnectionDB.getInstance().connect();
    }
    
    public EscuelaModel findById(int id) {
    	EscuelaModel result = null;
    	
    	if(Optional.ofNullable(conn).isEmpty())
    		conn = ConnectionDB.getInstance().connect();
    		
    	if(Optional.ofNullable(conn).isPresent()) {
    		try {
    			String sql = "SELECT "
        				+ "nombre, habilidad, anios_servicio, creador, fecha_inicio "
        				+ "FROM "
        				+ "tbl_escuela "
        				+ "WHERE "
        				+ "id=?";
    			PreparedStatement statement = conn.prepareStatement(sql);
    			statement.setInt(1, id);
    			
                ResultSet resultQuery = statement.executeQuery();
		        while (resultQuery.next()) {
		        	result = new EscuelaModel(id, resultQuery.getString(1), resultQuery.getString(2), 
		        		resultQuery.getInt(3), resultQuery.getString(4), resultQuery.getString(5));
		        	 break;
		        }
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    	
        return result;
    }
    
    
    public List<EscuelaModel> findAll() {
    	List<EscuelaModel> result = new ArrayList<EscuelaModel>();
    	
    	if(Optional.ofNullable(conn).isEmpty())
    		conn = ConnectionDB.getInstance().connect();
    		
    	if(Optional.ofNullable(conn).isPresent()) {
    		try {
    			String sql = "SELECT "
        				+ "id, nombre, habilidad, anios_servicio, creador, fecha_inicio "
        				+ "FROM "
        				+ "tbl_escuela";
    			
    			PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet resultQuery = statement.executeQuery();
                
                while (resultQuery.next()) {
                    EscuelaModel temp = new EscuelaModel(resultQuery.getInt(1), resultQuery.getString(2), 
                    		resultQuery.getString(3), resultQuery.getInt(4), resultQuery.getString(5), 
                    		resultQuery.getString(5));
                    
                    result.add(temp);
                }
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	return result;
    }
}
