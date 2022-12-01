package EX1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MonPremierFichierTexte {

	/**
	 * création du fichier texte Nom.txt
	 * @param args
	 */
	public static void main(String[] args) {

		 try {
			 
			 PrintWriter pr = new PrintWriter(new File("C:\\Users\\aleks\\eclipse-workspace\\TD9_I_O\\src\\EX1\\Nom.txt)"));
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
}

