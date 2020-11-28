package entreprise;

public class Employes {
	private String nom;
	
	public Employes() {
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
	public void afficher(){
		System.out.println("===================================");
		System.out.println("Nom est "+nom);
	}
public double calculSalaire(){
	return 0;
}
}
