package EntiteReservable;

import formulaire.Formulaire;
import formulaire.FormulaireRestaurant;
import reserver.CalendrierAnnuel;

public abstract class EntiteReservable {
	private CalendrierAnnuel calendrier;
	private int numero;
	public CalendrierAnnuel getCalendrier() {
		return calendrier;
	}
	public void setCalendrier(CalendrierAnnuel calendrier) {
		this.calendrier = calendrier;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Boolean estLibre(Formulaire formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
		//
	}
	
	public abstract Boolean compatible(Formulaire formulaire);
	public abstract void reserver(Formulaire formulaire);
}
