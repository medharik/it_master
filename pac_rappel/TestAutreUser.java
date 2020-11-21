package pac_rappel;

public class TestAutreUser {
public static void main(String[] args) {
	
	Produit dell=new Produit("dell G6",9000 , 10);
	Produit  hp = new Produit(" hp pro 8", 10000);
	System.out.println(dell);
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
