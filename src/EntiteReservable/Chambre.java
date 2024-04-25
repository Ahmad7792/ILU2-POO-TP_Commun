package EntiteReservable;

import formulaire.FormulaireHotel;
import reservations.ReservationHotel;

public class Chambre extends EntiteReservable <FormulaireHotel, ReservationHotel>{

	@Override
	public Boolean compatible(FormulaireHotel formulaire) {
		return formulaire.getIdentificationEntite() == this.getNumero();
	}

	@Override
	public ReservationHotel reserver(FormulaireHotel formulaire) {
		ReservationHotel reservation = null;
		if(this.estLibre(formulaire) && compatible(formulaire)) {
			reservation = new ReservationHotel(formulaire.getJour(), formulaire.getMois(), formulaire.getNbLitsSimple(), formulaire.getNbLitsDouble(), this.getNumero());
		}
		return reservation;
	}

}
