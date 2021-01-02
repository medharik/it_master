package projet_db_m1;


public class Produit {
	
	private String libelle;
	private double prix;
	public Produit() {

	}
	//constrcteur initialisant des attributs 
//	hp=new Produit("hp dv 7",10000,10);
	
	public Produit(String libelle, double prix) {
		this.libelle = libelle;
		this.prix = prix;
	}
	public String getLibelle() {
		return libelle.toUpperCase();
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return libelle+" coute "+prix+"$";
	}

}
