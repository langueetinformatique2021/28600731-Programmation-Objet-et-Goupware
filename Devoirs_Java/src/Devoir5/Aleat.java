package Devoir5;

/**
 * Générateur de nombres entiers naturels aléatoires
 * @author Alexandra DEMKOVIC
 *
 */
public class Aleat {

	private int maximum;
	
	/** instanciation 
	 * @param maximum nombre maximum généré */
	public Aleat(int maximum) {
		this.maximum = maximum;
	}

	/** @return nombre aleatoire */
	public int get() {
		return (int)(Math.random() * maximum) + 1;
	}
}

