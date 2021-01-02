package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connect = DriverManager
	                    .getConnection("jdbc:mysql://localhost/jdbc1?"
	                            + "user=root&password=");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur du chargemebt du driver jdbc mysql "+e.getMessage());
		}

		
	}
	
}
