package formulaire;

public class FormulaireSpectacle extends Formulaire {
	private int numZone;
		public FormulaireSpectacle(int jour, int mois, int numZone) {
			this.jour = jour;
			this.mois = mois;
			this.setNumZone(numZone);
		}
		public int getNumZone() {
			return numZone;
		}
		public void setNumZone(int numZone) {
			this.numZone = numZone;
		}
}
