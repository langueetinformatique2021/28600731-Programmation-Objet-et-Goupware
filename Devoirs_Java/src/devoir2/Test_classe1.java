package devoir2;

/**
 * 
 * @author Alexandra DEMKOVIC
 * Classe de test pour les classes Etudiant et Promotion
 */

public class Test_classe1 {

	public static void main(String[] args) {
		/**
		 * Instanciation des étudiants dont on ajoute plusieurs caractéristiques entre partenthèses
		 */
		Classe_Etudiant etu1 = new Classe_Etudiant(21789, "Dubois", "Céline", "F", "21/03/2000");
		Classe_Etudiant etu2 = new Classe_Etudiant(23456, "Leclerc", "Marie", "F", "03/05/1999");
		Classe_Etudiant etu3 = new Classe_Etudiant(22057, "Smith", "Paul", "M", "17/10/1998");
		
		/**
		 * instanciation des promos
		 */
		Classe_promo promo1 = new Classe_promo("Histoire-Géographie", "2021-2022", "M1");
		
//		String x = etu1.getMention();
//		System.out.println(x);
		
		
		etu1.setPromo(promo1);
		etu2.setPromo(promo1);
		etu3.setPromo(promo1);
		
		/**
		 * ajout des notes des étudiants pour calculer leurs moyennes et les comparer par la suite
		 */
		etu1.addNote((float) 13.5);
		etu1.addNote((float) 15);
		etu1.addNote((float) 12);
		etu1.addNote((float) 11);
		etu1.addNote((float) 17.5);
		
		etu2.addNote((float) 12);
		etu2.addNote((float) 16.5);
		etu2.addNote((float) 13);
		etu2.addNote((float) 14);
		etu2.addNote((float) 12);
		
		etu3.addNote((float) 16);
		etu3.addNote((float) 14.5);
		etu3.addNote((float) 18);
		etu3.addNote((float) 11.5);
		etu3.addNote((float) 12);
		
		/**
		 * afficher chaque étudiant avec ses caractéristiques
		 */
		etu1.affiche();
		etu2.affiche();
		etu3.affiche();
		
		
		
		/** 
		 * affiche quel est le meilleur étudiant lorsqu'on compare deux étudiants
		 */
		etu1.affiche_meilleur(etu2);
		etu1.affiche_meilleur(etu3);
		etu2.affiche_meilleur(etu3);

	}

		
}
