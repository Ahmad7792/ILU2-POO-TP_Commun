package EntiteReservable;


import formulaire.FormulaireRestaurant;
import reservations.ReservationRestaurant;
import reserver.CalendrierAnnuel;

public class Table extends EntiteReservable<FormulaireRestaurant, ReservationRestaurant> {

	private int nbChases;
	private CalendrierAnnuel calendrierDeuxiemeService;
	public Table(int nbch) {
		this.nbChases = nbch;
	}
	
	public Boolean estLibreService2(int j, int m) {
		return calendrierDeuxiemeService.estLibre( j,  m);
	}
	@Override
	public Boolean compatible(FormulaireRestaurant formulaire) {
		Boolean estCompatible = true;
		if(this.nbChases <  formulaire.getNombrePersonnes() || this.nbChases >  formulaire.getNombrePersonnes() - 1) {
			estCompatible = false;
		}
		if(formulaire.getNumService() != 1 && formulaire.getNumService() != 2) {
			estCompatible = false;
		}
		if(!estLibre(formulaire)) {
			estCompatible = false;
		}
		return estCompatible;
	}

	@Override
	public ReservationRestaurant reserver(FormulaireRestaurant formulaire) {
		ReservationRestaurant reservation = null;
		if((this.estLibre(formulaire) && compatible(formulaire) && formulaire.getNumService() == 1) || (this.estLibreService2(formulaire) && compatible(formulaire) && formulaire.getNumService() == 2)) {
			reservation = new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), this.getNumero());
		}
		return reservation;
	}
	
}
