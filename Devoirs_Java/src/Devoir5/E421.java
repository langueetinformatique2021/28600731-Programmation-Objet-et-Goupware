package Devoir5;

/**
 * Création d'une exception utilisateur E421 
 * ayant comme message le nom du lanceur
 * @author Alexandra DKC
 * @param nom_lanceur 
 * @param tire (du dé)
 */
@SuppressWarnings("serial")
public class E421 extends Exception {
	
	public E421(String nom_lanceur, TroisDes tire) {
		super("Combinaison du 421 \nNom du Lanceur : " + nom_lanceur + tire);
	}

}
