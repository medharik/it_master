package pac2;

import pac_rappel.Produit;

public class TestAutreUser {
public static void main(String[] args) {
	
	Produit dell=new Produit("dell G6",9500 , 10);
	Produit  hp = new Produit("dell G6",9000 , 10);
	
	
	if(dell.equals(hp)){
		System.out.println("le meme produit");
	}else{
		System.out.println("2 produits #");
	}
	try {
		dell.setPrix(-10000);
		dell.afficher();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("le prix de dell est "+dell.getPrix());
	dell.afficher();
	hp.afficher();
	
}
}
