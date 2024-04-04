package reservations;

public class ReservationHotel extends Reservation{
	private int nbLitsSimple;
	private int nbLitsDouble;
	private int numChambre;
		public ReservationHotel(int jour, int mois, int litSimple, int nbLitsDouble, int numChambre) {
			this.jour = jour;
			this.mois = mois;
			this.nbLitsSimple = litSimple;
			this.nbLitsDouble = nbLitsDouble;
			this.numChambre = numChambre;
		}
		
		@Override
		public String toString() {
			return "Le " + this.jour + "/" + this.mois + " : réservation de la chambre " + numChambre + " qui contient " + this.nbLitsSimple + " lits simples et " + nbLitsDouble + " lits doubles.";
		}
	}
