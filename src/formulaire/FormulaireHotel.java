package formulaire;

public class FormulaireHotel extends Formulaire {
	private int nbLitsSimple;
	private int nbLitsDouble;
		public FormulaireHotel(int jour, int mois, int litSimple, int nbLitsDouble) {
			this.jour = jour;
			this.mois = mois;
			this.setNbLitsSimple(litSimple);
			this.setNbLitsDouble(nbLitsDouble);
		}
		public int getNbLitsDouble() {
			return nbLitsDouble;
		}
		public void setNbLitsDouble(int nbLitsDouble) {
			this.nbLitsDouble = nbLitsDouble;
		}
		public int getNbLitsSimple() {
			return nbLitsSimple;
		}
		public void setNbLitsSimple(int nbLitsSimple) {
			this.nbLitsSimple = nbLitsSimple;
		}
}
