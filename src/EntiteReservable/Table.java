package EntiteReservable;

import formulaire.FormulaireRestaurant;

public class Table extends EntiteReservable {
	private int nbPersonnesMax;

	public Boolean compatible(FormulaireRestaurant formulaire) {
		Boolean estCompatible = true;
		if(this.nbPersonnesMax <  formulaire.getNombrePersonnes()) {
			estCompatible = false;
		}
		if(formulaire.getNumService() != 1 && formulaire.getNumService() != 2) {
			estCompatible = false;
		}
		return estCompatible;
	}

	@Override
	public void reserver(Formulaire formulaire) {
		// TODO Auto-generated method stub
		
	}
	
}
