package entreprise;

public class Tdev extends Employes {
	private int nbrH ;
	private double tarifH;
	public Tdev() {
		super();
	}
	public Tdev(String nom, int nbrH, double tarifH) {
		super(nom);
		this.nbrH = nbrH;
		this.tarifH = tarifH ;
	}
	
	public int getNbrH() {
		return nbrH;
	}
	public void setNbrH(int nbrH) {
		this.nbrH = nbrH;
	}
	public double getTarifH() {
		return tarifH;
	}
	public void setTarifH(double tarifH) {
		this.tarifH = tarifH;
	}
	@Override
	public double calculSalaire() {
		double s=0;
		if(nbrH <= 100){
			 s =nbrH * tarifH ;
			
		}else{
			s = 100*tarifH+(nbrH-100)*tarifH*0.25; 
		}
		return s ;
	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("nombre heure  est  "+nbrH);
		System.out.println("tarif / heure "+tarifH+"$");
	}
	

}
