package formulaire;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	protected int numero;
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public void setIdentificationEntite(int numero) {
		this.numero = numero;
	}
	public Integer getIdentificationEntite() {
		return numero;
	}
}
