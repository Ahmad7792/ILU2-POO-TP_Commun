package reservations;

public class ReservationRestaurant extends Reservation {
	private int numeroService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		this.jour = jour;
		this.mois = mois;
		this.numTable = numTable;
		this.numeroService = numService;
	}
	
	@Override
	public String toString() {
		String service;
		if (numeroService == 1) {
			service = "premier";
		}
		else {
			service = "deuxième";
		}
		return "Le " + this.jour + "/" + this.mois + " : Table " + numTable + " pour le " + service + " service.";
	}
}
