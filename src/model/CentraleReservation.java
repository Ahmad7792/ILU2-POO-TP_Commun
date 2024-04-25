package model;

import EntiteReservable.EntiteReservable;
import formulaire.Formulaire;
import reservations.Reservation;

public class CentraleReservation <T extends EntiteReservable, F extends Formulaire, R extends Reservation> {
	private T[] entites;
	private int nbEntites;
	public CentraleReservation(T[] tab) {
		this.entites = tab;
		nbEntites = 0;
	}
	public void ajouterEntite(T entite) {
		this.entites[nbEntites] = entite;
		nbEntites++;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] possibilites = new int[nbEntites];
		for(int i=0;i<nbEntites;i++) {
			if (entites[i].estLibre(formulaire) && entites[i].compatible(formulaire)) {
				possibilites[i] = entites[i].getNumero();
			}
			else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public R reserver(int numEntite, F formulaire) {
		formulaire.setIdentificationEntite(this.entites[numEntite].getNumero());
		return (R) entites[numEntite].reserver(formulaire);
		
	}
}
