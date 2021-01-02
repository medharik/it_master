package projet_db_m1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		try {
			// charger le driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Ouvrir une connexion avec la bd
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_jdbc1?"
                            + "user=root&password=");
			
		PreparedStatement rp = cn.prepareStatement("insert into produit(libelle,prix)"
				+ " values (?,?)");
	rp.setString(1,"dell d7" );
	
	rp.setFloat(2, 7000);
	//rp.execute();
	
	 rp = cn.prepareStatement("select * from produit");
	ResultSet resultat = rp.executeQuery();
	while (resultat.next()) {
		System.out.println(resultat.getInt(1)+"-le libelle est "+resultat.getString("libelle"));
		System.out.println("le prix est "+resultat.getDouble(3)+"$");
		System.out.println("######################");
	}
	rp.close();
	if (!cn.isClosed()) {
		cn.close();
	}
	
	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
