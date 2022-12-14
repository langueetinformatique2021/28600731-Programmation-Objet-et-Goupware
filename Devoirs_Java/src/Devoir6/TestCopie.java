package Devoir6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Problème 4. Spécialisation de flots
 * Class test de la méthode Copie()
 * Création de la copie :
 * " Vingt milles lieues sous les mers_ Jules Vernes (en anglais)_copie.txt "
 * @author Alexandra Dkc
 *
 */
public class TestCopie {

	public static void main(String[] args) throws IOException {
		
        try (FileInputStreamTP9 fsource = new FileInputStreamTP9("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais).txt")) {

            fsource.Copie(new File("C:\\Users\\aleks\\Bureau\\GATE L2\\DEMKOVIC_Alexandra-Projet\\Vingt milles lieues sous les mers_ Jules Vernes (en anglais)_copie.txt"));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

	}
}
