package entreprise;

public  class Employes {
	private String nom;
	protected  static String natioannalite;
	public    final  static  int  TVA=20;
	public Employes() {
		
	}

	public  static String getNatioannalite() {
		
		return natioannalite;
	}

	public static void setNatioannalite(String natioannalite) {
		Employes.natioannalite = natioannalite;
	}

	public Employes(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public  void afficher(){
		System.out.println("===================================");
		System.out.println("Nom est "+nom);
	}
public double calculSalaire(){
	return 0;
}
}
