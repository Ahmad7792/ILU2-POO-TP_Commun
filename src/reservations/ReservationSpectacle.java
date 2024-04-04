package reservations;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numChaise;
		public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
			this.jour = jour;
			this.mois = mois;
			this.numChaise = numChaise;
			this.numZone= numZone;
		}
		
		@Override
		public String toString() {
			return "Le " + this.jour + "/" + this.mois + " : Chaise " + numChaise+ " dans la zone " + numZone;
		}
	}
