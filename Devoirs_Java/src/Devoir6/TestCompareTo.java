package Devoir6;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Problème 4. Spécialisation de flots
 * Class test de la méthode CompareTo
 * Comparer différents contenu de fichier (relation d'ordre lexicographique)
 * @author Alexandra Dkc
 *
 */

public class TestCompareTo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		/**
		 * Etant donné que le contenu est traité une première fois, je dois remettre les fichiers avant chaque println pour recharger son contenu pour
		 * pouvoir par la suite les comparer entre eux à nouveau, sinon ça me renvoit true à chaque fois
		 * mes fichiers sont fsource (fichier texte initial), fcopie (la copie du fichier texte initial), 
		 * et ftest (un autre fichier texte dont le contenu est différent des deux autres)
		 */
		
        try {
        	
        	@SuppressWarnings("resource")
			FileInputStreamTP9 fsource = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais).txt");
        	@SuppressWarnings("resource")
			FileInputStreamTP9 fcopie = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais)_copie.txt");
        	FileInputStreamTP9 ftest = new FileInputStreamTP9("C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt");
        	
        	
        	///1ere comparaison
            fsource = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais).txt");
            fcopie = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais)_copie.txt");
            
            System.out.println(fsource.CompareTo(fcopie));
            
            
            ///2e comparaison
            fsource = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais).txt");
            ftest = new FileInputStreamTP9("C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt");
        
            System.out.println(fsource.CompareTo(ftest));
            
            
            //3e comparaison
            fcopie = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais)_copie.txt");
            ftest = new FileInputStreamTP9("C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt");

            System.out.println(fcopie.CompareTo(ftest));
        	
        	
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

	}
}
