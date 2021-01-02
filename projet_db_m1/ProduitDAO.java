package projet_db_m1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProduitDAO {
	static Connection con;
	PreparedStatement rp;
	
	
	public  static Connection connecterBD(){
		try {
			// charger le driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Ouvrir une connexion avec la bd
		con = DriverManager.getConnection("jdbc:mysql://localhost/db_jdbc1?"
                            + "user=root&password=");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public void ajouter(Produit p) {
		
		try {
			rp = con.prepareStatement("insert into produit(libelle,prix)"
					+ " values (?,?)");
			rp.setString(1,p.getLibelle() );
			
			rp.setDouble(2, p.getPrix());
		rp.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public List<Produit> all(){
		List<Produit> produits=new ArrayList<>();
		
		try {
			rp = con.prepareStatement("select * from produit");
			ResultSet resultat = rp.executeQuery();
			while (resultat.next()) {
				Produit t=new Produit(resultat.getString("libelle"), resultat.getDouble("prix") );
				
			produits.add(t)	;
			}
			rp.close();
			if (!con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produits;
	}

}
