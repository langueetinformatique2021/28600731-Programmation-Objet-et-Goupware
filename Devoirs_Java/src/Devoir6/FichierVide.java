package Devoir6;

/**
 * Problème 3.Lecture robuste d'un texte
 * Classe d'exception pour le cas où le fichier NomFichier est vide
 * @author Alexandra Dkc
 *
 */

@SuppressWarnings("serial")
public class FichierVide extends Exception {
	
	public FichierVide(String NomFichier) {
		super("Fichier Vide : " + NomFichier);
	}

}
