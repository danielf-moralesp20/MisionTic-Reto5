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
    	List<EscuelaModel> result = null;
    	
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
                	if(Optional.ofNullable(result).isEmpty())
                		result = new ArrayList<EscuelaModel>();
                	
                    EscuelaModel temp = new EscuelaModel(resultQuery.getInt(1), resultQuery.getString(2), 
                    		resultQuery.getString(3), resultQuery.getInt(4), resultQuery.getString(5), 
                    		resultQuery.getString(6));
                    
                    result.add(temp);
                }
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	return result;
    }
    
    public List<EscuelaModel> findAllLikeId(int id) {
    	List<EscuelaModel> result = null;
    	
    	if(Optional.ofNullable(conn).isEmpty())
    		conn = ConnectionDB.getInstance().connect();
    		
    	if(Optional.ofNullable(conn).isPresent()) {
    		try {
    			String sql = "SELECT "
        				+ "id, nombre, habilidad, anios_servicio, creador, fecha_inicio "
        				+ "FROM "
        				+ "tbl_escuela "
        				+ "WHERE id LIKE ?";
    			
    			PreparedStatement statement = conn.prepareStatement(sql);
    			statement.setString(1, "%"+ id +"%");
    			
                ResultSet resultQuery = statement.executeQuery();
                while (resultQuery.next()) {
                	if(Optional.ofNullable(result).isEmpty())
                		result = new ArrayList<EscuelaModel>();
                	
                    EscuelaModel temp = new EscuelaModel(resultQuery.getInt(1), resultQuery.getString(2), 
                    		resultQuery.getString(3), resultQuery.getInt(4), resultQuery.getString(5), 
                    		resultQuery.getString(6));
                    
                    result.add(temp);
                }
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	return result;
    }
    
    public boolean save(EscuelaModel newEscuela) {
    	boolean result = false;
    	
    	if(Optional.ofNullable(conn).isEmpty())
    		conn = ConnectionDB.getInstance().connect();
    		
    	if(Optional.ofNullable(conn).isPresent()) {
    		try {
    			 String sql = "INSERT INTO "
    			 		+ "tbl_escuela(id, nombre, habilidad, anios_servicio, creador, fecha_inicio) "
    			 		+ "VALUES (?, ?, ?, ?, ?, ?);";
    			 
    			PreparedStatement statement = conn.prepareStatement(sql);
     			statement.setInt(1, newEscuela.getCodigo_escuela());
     			statement.setString(2, newEscuela.getNombre_escuela());
     			statement.setString(3, newEscuela.getHabilidad());
     			statement.setInt(4, newEscuela.getAnios_servicio());
     			statement.setString(5, newEscuela.getCreador());
     			statement.setString(6, newEscuela.getFecha_inicio());
     			
     			result = statement.executeUpdate() > 0;
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
		}
    	
    	return result;
    }
    
    public boolean updateById(EscuelaModel newEscuela) {
    	boolean result = false;
    	
    	if(Optional.ofNullable(conn).isEmpty())
    		conn = ConnectionDB.getInstance().connect();
    		
    	if(Optional.ofNullable(conn).isPresent()) {
    		try {
    			 String sql = "UPDATE tbl_escuela "
    			 		+ "SET nombre=?, habilidad=?, anios_servicio=?, creador=?, fecha_inicio=? "
    			 		+ "WHERE id=?";
    			 
    			PreparedStatement statement = conn.prepareStatement(sql);
     			statement.setString(1, newEscuela.getNombre_escuela());
     			statement.setString(2, newEscuela.getHabilidad());
     			statement.setInt(3, newEscuela.getAnios_servicio());
     			statement.setString(4, newEscuela.getCreador());
     			statement.setString(5, newEscuela.getFecha_inicio());
     			statement.setInt(6, newEscuela.getCodigo_escuela());
     			
     			result = statement.executeUpdate() > 0;
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
		}
    	
    	return result;
    }
    
    public boolean deleteById(int id) {
    	boolean result = false;
    	
    	if(Optional.ofNullable(conn).isEmpty())
    		conn = ConnectionDB.getInstance().connect();
    		
    	if(Optional.ofNullable(conn).isPresent()) {
    		try {
    			 String sql = "DELETE FROM tbl_escuela "
    			 		+ "WHERE id=?";
    			 
    			PreparedStatement statement = conn.prepareStatement(sql);
     			statement.setInt(1, id);
     			
     			result = statement.executeUpdate() > 0;
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
		}
    	
    	return result;
    }
}
