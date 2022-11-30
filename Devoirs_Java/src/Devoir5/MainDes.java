package Devoir5;

/**
 * Test du Lancer des 3 dés avec l'exception de l'utilisateur E421
 * @author Alexandra DKC
 *
 */
public class MainDes {

	/**
	 * Ajout de l'exception de l'utilisateur E421 avec throws
	 * @param args
	 * @throws E421
	 */
	public static void main(String[] args) throws E421 {
		LancerDes lancer_des = new LancerDes("E421");
		TroisDes tire = lancer_des.lancer();
		lancer_des.NLanceur();
		tire.affiche_valeur();
		
		
	}
	
}
