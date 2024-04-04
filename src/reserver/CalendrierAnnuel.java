package reserver;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	public class Mois{
		private String nom;
		private Boolean[] jours;
		public Mois(String nom, int nbJours) throws IllegalStateException {
			this.setNom(nom);
			this.jours = new Boolean[nbJours];
			for (int i=0;i<nbJours;i++) {
				jours[i] = false;
			}
		}
		public Boolean estLibre(int jour) {
			return !(this.jours[jour]);
		}
		public void reserver(int jour) {
			if(!(estLibre(jour))) {
				throw new IllegalStateException();
			}
			this.jours[jour] = true;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
	}
	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		String[] Mois = {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Décembre"};
		int[] jours = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i=0;i<12;i++) {
			this.calendrier[i] = new Mois(Mois[i],jours[i]);
		}
	}
	public Boolean estLibre(int jour,int mois) {
		return this.calendrier[mois-1].estLibre(jour-1);
	}
	public Boolean reserver(int jour,int mois) {
		Boolean ReservationReussie;
		try{
			this.calendrier[mois-1].reserver(jour-1);
			ReservationReussie = true;
		}
		catch(IllegalStateException e) {
			ReservationReussie = false;
		}
		return ReservationReussie;
	}
}
