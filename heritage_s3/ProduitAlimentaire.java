package heritage_s3;

public class ProduitAlimentaire  extends Produit {
private String dateExpiration;

public ProduitAlimentaire() {
	super();
}
public ProduitAlimentaire(String libelle,double prix,double qteStock,String dateExpiration){
	super(libelle, prix, qteStock);
	this.dateExpiration=dateExpiration;
	
}
public String getDateExpiration() {
	return dateExpiration;
}

public void setDateExpiration(String dateExpiration) {
	this.dateExpiration = dateExpiration;
}

@Override
	public void afficher() {
		super.afficher();
		System.out.println("la date d'expiration est "+dateExpiration);
		
	}
	
}
