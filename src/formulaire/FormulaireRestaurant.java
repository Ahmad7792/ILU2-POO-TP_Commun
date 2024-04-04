package formulaire;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersonnes;
	private int numService;
	public FormulaireRestaurant(int jour, int date, int nbPersonnes, int numService) {
		this.jour = jour;
		this.mois = date;
		this.setNbPersonnes(nbPersonnes);
		this.setNumService(numService);
	}
	public int getNumService() {
		return numService;
	}
	public void setNumService(int numService) {
		this.numService = numService;
	}
	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}
	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	
}
