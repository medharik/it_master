package pac_rappel;

public class Produit {
//fields : attributs / variable d'instance (objet)
public  	String libelle ;
private  	double prix;
 private 	int qteEnStock;
 public int getQteEnStock() {
	return qteEnStock;
}

public void setQteEnStock(int qteEnStock) {
	this.qteEnStock = qteEnStock;
}
final	double TVA =.20;
//constructeur : initialiser les attributs 
public Produit() {
System.out.println("un produit est construit");
}

public Produit(String libelle, double prix) {
	this.libelle = libelle;
	this.prix = prix;
}

//constructeur qui initialise les attributs
public Produit(String libelle,double prix,int qteEnStock){
	this.libelle=libelle;
	this.prix=prix;
	this.qteEnStock=qteEnStock;
}
public  void afficher() {
System.out.println(libelle+" coute "+prix+"$, il en reste "+qteEnStock+"unités");
 }
 /**
  *@author HARIK
  *@since 2020
  *@parameters  une quantité du produit à vendre 
  *@return ttc si la vente est possible, sinon lance une exception 
 * @throws Exception 
  *
  */
 double vendre(int qteAVendre) throws Exception{
	
	 if (qteAVendre<=qteEnStock) {
		
		 double ttc =qteAVendre*prix*(1+TVA/100);
		 return ttc;
	}else{
		throw new Exception("Erreur, cette vente n'est pas possible car la quantité en stock est insuffisante");
	}

	
 }
 
	public static void main(String[] args) {
		// instancier les objets de la classe Produit 
		Produit hp=new Produit();
		hp.afficher();
		hp.libelle="hp dv8";
		hp.prix=9000;
		hp.qteEnStock=10;
		hp.afficher();
		try {
			double ttc=hp.vendre(10000);
			System.out.println("le ttc est "+ttc+"$");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
public void setPrix(double prix) throws Exception {
	if(prix>0){
			this.prix = prix;

	}else {
		throw  new Exception("le prix ne peut pas etre <0");
	}
}
public double getPrix() {
	return prix;
}
@Override
	public boolean equals(Object x) {
		// TODO Auto-generated method stub
	if(x instanceof Produit){
		Produit copie=(Produit)x;
		return this.prix==copie.prix && this.libelle.equals(copie.libelle);
	}else 
	return false;
}
@Override
	public String toString() {
		return "libelle est "+libelle+", prix est "+prix;
	}
}
