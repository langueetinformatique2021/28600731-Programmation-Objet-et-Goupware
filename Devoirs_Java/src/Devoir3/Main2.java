package Devoir3;

/**
 * @author Alexandra Demkovic
 * @comments classe de test pour la classe Crocodile dérivée de la classe Reptile, 
 * implémentant l'interface Repertorier
 * 
 */


public class Main2 {
	public static void main(String[] args) {
		Crocodile C = new Crocodile("crocodile marin");
		C.repertorier("Nom : Artus \n", 
				"ID : C000114536 \n", 
				"Habitat : Australie \n");
		System.out.println(C.get_nom() + C.get_id() + C.get_habitat() + " \nCaractéristiques: \n");
		C.présente();
		

	}

}
