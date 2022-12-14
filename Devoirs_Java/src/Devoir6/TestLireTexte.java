package Devoir6;

/**
 * Problème 3.Lecture robuste d'un texte
 * Class test imprimant mot par mot
 * @author Alexandra Dkc
 *
 */

public class TestLireTexte {

	public static void main(String[] args) {
		String path = "C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet";
		///String path = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1";
				
		/// Il n'y a pas de répertoire livre alors j'ai utilisé un fichier texte à moi pour tester
		LireTexte lire;
		try {
			lire = new LireTexte(path+"\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais).txt");
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			System.out.println(lire.readWord());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
