package Devoir6;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Problème 4. Spécialisation de flots
 * Class test de la méthode Propriétés
 * Affichage des propriétés du file
 * @author Alexandra Dkc
 *
 */

public class TestProprietes {

	public static void main(String[] args) throws IOException {
		
        try (FileInputStreamTP9 fsource = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais)_copie.zip")) {

            System.out.println(fsource.Propriétés());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

	}
}

