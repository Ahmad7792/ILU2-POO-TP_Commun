package EntiteReservable;

import formulaire.Formulaire;
import formulaire.FormulaireRestaurant;
import reservations.Reservation;
import reserver.CalendrierAnnuel;

public abstract class EntiteReservable <T extends Formulaire, R extends Reservation>{
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
	
	public Boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
		//
	}
	
	public abstract Boolean compatible(T formulaire);
	public abstract R reserver(T formulaire);
}
