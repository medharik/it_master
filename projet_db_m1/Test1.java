package projet_db_m1;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProduitDAO pdao=new ProduitDAO();
		ProduitDAO pdao2=new ProduitDAO();
		ProduitDAO.connecterBD();
		
//		pdao.ajouter(new Produit("sony vaio v1",10000));
		List<Produit> produits = pdao.all();
		System.out.println(produits);
	}

}
