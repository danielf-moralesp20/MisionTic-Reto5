package utils;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import org.json.simple.*;
import org.json.simple.parser.*;

public class ConnectionDB {
	private static ConnectionDB singlenton;
	private Connection conn;
	
	private ConnectionDB() {
	}
	
	public static ConnectionDB getInstance() {
		if(Optional.ofNullable(singlenton).isEmpty())
			singlenton = new ConnectionDB();
		
		return singlenton;
	}
	
    public Connection connect() {
        JSONParser parser = new JSONParser();
        
        try {
            String credentials_path = System.getProperty("user.dir") + "/src/utils/db_credentials.json";
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credentials_path));
            
            String host     = (String)jsonObject.get("db_ip");
            String port     = (String)jsonObject.get("dp_port");
            String username = (String)jsonObject.get("db_user");
            String password = (String)jsonObject.get("db_pssword");
            String nameDB = (String)jsonObject.get("db_name");
            String dbURL = "jdbc:mysql://"+host+":"+port+"/"+nameDB ;
            
            conn = DriverManager.getConnection(dbURL, username, password);
        } 
        catch(SQLException | ParseException | IOException ex) {  
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    public Connection getConnection() {
		return conn;
	}
}