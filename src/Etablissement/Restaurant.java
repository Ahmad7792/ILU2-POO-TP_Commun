package Etablissement;

import EntiteReservable.Table;
import formulaire.FormulaireRestaurant;
import model.CentraleReservation;
import reservations.ReservationRestaurant;

public class Restaurant {
	private CentraleReservation<Table, FormulaireRestaurant, ReservationRestaurant> centrale;
	public Restaurant(CentraleReservation<Table, FormulaireRestaurant, ReservationRestaurant> centrale) {
		this.centrale = centrale;
	}
	public void ajouterTable(int nbChaises) {
		centrale.ajouterEntite(new Table(nbChaises));
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public ReservationRestaurant reserver(int numEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numEntite, formulaire);
		
	}
}
