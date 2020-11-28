package heritage_s3;

import javax.management.InstanceNotFoundException;

public class Test {
public static void main(String[] args) {
	
	ProduitAlimentaire lait=new ProduitAlimentaire("lait uht", 10, 100, "10/01/2020");
	Produit hp=new Produit("hp dv 7", 9000,10);
	Produit x=new ProduitAlimentaire("yaghourt",2,20,"10/10/2020");
	//type 1 du polymorphisme :  redefinition (d'heritage )
	hp.afficher("en");
	lait.afficher();
	// type 2 : ad-hoc (passe-partout)
	//type 3 : overload (surcharge)
	//polymorphisme : meme nom du code mais comportement diferent selon le context de l'appel de ce code 
	//upcating 
	Produit p=new ProduitAlimentaire();
	if (x instanceof  ProduitAlimentaire) {
		//downcasting
		ProduitAlimentaire pa =(ProduitAlimentaire)x;
		
	}
Produit tp[]={hp,lait, new ProduitEletcrique("core i3")};
for (Produit produit : tp) {
	produit.afficher();
}
}

}
