package Devoir5;

/**
 * Simulation d'un jeu de pile ou face
 * Calcul de la moyenne des piles et des faces sur 1000 lancers 
 * @author Alexandra DKC
 *
 */
public class PileFace {

	public static void main(String[] args) {
		Aleat pileface = new Aleat(2);

		int pile = 0, face = 0;
		for (int i = 0; i < 1000; i++) {
			int tire = pileface.get();
			System.out.print(tire);
			if (tire == 1)
				pile++;
			else
				face++;
		}
		System.out.println();
		System.out.println(pile + " piles et " + face + " faces");

	}
}
