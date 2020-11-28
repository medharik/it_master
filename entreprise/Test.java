package entreprise;

public class Test {

	public static void main(String[] args) {
		Tdev dev = new Tdev("maf",100, 200);
		
		Tres res = new Tres("khalifa", 300);
		Employes E[] = {dev, res};
		double masse=0;
		for(Employes em : E){
			masse += em.calculSalaire();
		}
		System.out.println("la masse salariale est "+masse+"$");

	}

}
