package heritage_s3;

public class ProduitEletcrique  extends Produit{
private String config;

public String getConfig() {
	return config;
}

public void setConfig(String config) {
	this.config = config;
}

public ProduitEletcrique(String config) {
	super();
	this.config = config;
}

public ProduitEletcrique(String lib, double prix, double qteStock, String config) {
	super(lib, prix, qteStock);
	this.config=config;
}

@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println("la config est "+config);
	}
}
