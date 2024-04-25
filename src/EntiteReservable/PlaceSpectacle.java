package EntiteReservable;

import formulaire.FormulaireSpectacle;
import reservations.ReservationSpectacle;

public class PlaceSpectacle  extends EntiteReservable <FormulaireSpectacle, ReservationSpectacle> {
	private int numZone;
	public PlaceSpectacle(int zone) {
		this.numZone = zone;
	}
	@Override
	public Boolean compatible(FormulaireSpectacle formulaire) {
		return formulaire.getNumZone() == numZone;
	}

	@Override
	public ReservationSpectacle reserver(FormulaireSpectacle formulaire) {
		ReservationSpectacle reservation = null;
		if(this.estLibre(formulaire) && compatible(formulaire)) {
			reservation = new ReservationSpectacle(formulaire.getJour(), formulaire.getMois(), formulaire.getNumZone(),getNumero());
		}
		return reservation;
	}

}
