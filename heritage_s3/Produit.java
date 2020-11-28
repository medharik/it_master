package heritage_s3;

public class Produit {
	//attributs (variables d'instance)
	private String libelle;
	private double prix;
	private double qteStock;
	//constructeurs :
	//par defaut 
//	(donne des valeurs par defaut lors de la construction de l'objet , nombre : 0 , boolean :false ,
	//autre : null )
	public Produit() {

	}
	//constrcteur initialisant des attributs 
//	hp=new Produit("hp dv 7",10000,10);
	public Produit(String lib, double prix, double qteStock) {
		
		libelle = lib;
		this.prix = prix;
		this.qteStock = qteStock;
	}
	public Produit(String libelle, double prix) {
		super();
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
	public void setPrix(double prix) throws Exception {
		if(prix>=0)
		this.prix = prix;
		else throw new Exception("Erreur, le prix ne peut etre <0");
	}
	public double getQteStock() {
		return qteStock;
	}
	public void setQteStock(double qteStock) {
		this.qteStock = qteStock;
	}
	
	public void afficher(){
		System.out.println("######################################");

		System.out.println("libelle est "+libelle+"\nprix est "+prix+"$");
		System.out.println("la qte en stock est "+qteStock);
	}
	// on  surcharge afficher 
	public void afficher(String  langue ){
		if (langue.equals("english")) {
			System.out.println("label is "+libelle);
		} else {
			System.out.println("libellé est  "+libelle);

			}
	}
	
	

}
