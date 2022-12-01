package EX1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MonPremierFichierTexte {

	/**
	 * création du fichier texte Nom.txt
	 * @param args
	 */
	public static void main(String[] args) {
		String nomFichier = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt";

		 try {
			 
			 PrintWriter pr = new PrintWriter(new File(nomFichier));
				pr.println("Alexandra");
				pr.println("Marceau");
				pr.println("Yuyan");
				pr.println("Didier");
				pr.println("Romane");
				pr.close();
				
			 } 
		 	 
		 	 catch (IOException e) {
			 e.printStackTrace();
			 }
		 }
	
	public static boolean Verifier(String nomFichier) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File(nomFichier)));
			if (br.readLine().equals("Alexandra") == false)
				return false;
			if (br.readLine().equals("Marceau") == false)
				return false;
			if (br.readLine().equals("Yuyan") == false)
				return false;
			if (br.readLine().equals("Didier") == false)
				return false;
			if (br.readLine().equals("Romane") == false)
				return false;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
		
	}

}

