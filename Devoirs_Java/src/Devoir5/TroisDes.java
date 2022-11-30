package Devoir5;

/**
 * Simulation d'un lancé de 3 dés et les trois valeurs obtenues
 * @author Alexandra DKC
 * @param d1 dé 1
 * @param d2 dé 2
 * @param d3 dé 3
 */
public class TroisDes {

	private int d1,d2,d3;
	
	public TroisDes(int d1, int d2, int d3) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	/** 
	 * Déclaration des variables d1, d2, d3
	 */
	public int d1() {
		return d1;
	}
	
	public int d2() {
		return d2;
	}
	public int d3() {
		return d3;
	}
	
	/**
	 * Afficher les 3 valeurs obtenues 
	 */
	public void affiche_valeur() {
		System.out.println("Dé 1: "+d1()+ "\nDé 2: "+d2() + "\nDé 3: "+d3());
	}
	
}
