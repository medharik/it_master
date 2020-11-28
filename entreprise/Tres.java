package entreprise;

public class Tres extends Employes {
	private double SalaireM;

	public Tres() {
		super();
	}

	public Tres(String nom, double SalaireM) {
		super(nom);
		this.SalaireM = SalaireM;
	}

	public double getSalaireM() {
		return SalaireM;
	}

	public void setSalaireM(double salaireM) {
		SalaireM = salaireM;
	}
@Override
public double calculSalaire() {
	// TODO Auto-generated method stub
	return SalaireM;
}

	@Override
	public void afficher() {
		super.afficher();
		System.out.println("salaire est "+SalaireM);
	}
	

}
