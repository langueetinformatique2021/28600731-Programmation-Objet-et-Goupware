package Devoir6;

import java.io.*;
import java.util.*;

/**
 * Problème 3.Lecture robuste d'un texte
 * Construction d'une classe robuste de lecture de fichiers texte appelée LireTexte
 * @author Alexandra Dkc
 *
 */
public class LireTexte {   ///constructeur
	
	private String NomFichier;
	private BufferedReader entrée;
	private String ligne;
	private StringTokenizer tok = new StringTokenizer("");
	
	
	/**
	 * Création d'une nouvelle instance de LireTexte
	 * @param ft nom du fichier texte
	 * @throws FichierVide fichier vide 
	 * @throws IOException erreur de lecture
	 */
	public LireTexte(String ft) throws IOException, FichierVide {
		/// Etant donné que je vais tester avec un fichier texte personnel, je souhaite aussi tester si 
		/// le fichier est vide ou non mais aussi s'il a bien été trouvé
		try {
			this.NomFichier = ft;
			this.Ouvrir();
			
			
		} catch (FileNotFoundException  e) {   ///FileNotFound pour vérifier si le fichier n'est pas trouvé
            System.out.println("Fichier " + ft + " non trouvé");
            this.entrée = null;
		}
	}
		
	
	
	
/**
 * Ouverture d'un fichier texte,
 * Lecture de la première ligne,
 * Teste si le fichier est vide 
 * @throws IOException Erreur à l'ouverture
 * @throws FichierVide Fichier vide
 * @throws FileNotFoundException erreur fichier non trouvé dans son dossier
 */
	protected void Ouvrir() throws IOException, FichierVide, FileNotFoundException  {
		
	   this.entrée = new BufferedReader(new FileReader(NomFichier));
	   if (NomFichier.length() == 0) throw new FichierVide(NomFichier);
		
	}
	
	
	
	/**
	 * Fermeture du fichier
	 * @throws IOException  Erreur à la fermeture
	 */
	protected void Ferme() throws IOException {
		
		this.entrée.close();
		
		
	}
	
	
	
	/**
	 * Lecture mot à mot du fichier
	 * @return prochain mot
	 * @throws Exception erreur de lecture
	 */
	public String readWord() throws Exception {
		try{
	     if(tok.hasMoreTokens()) {
	    	 return tok.nextToken();   /// return le prochain mot
	     } else {
	    	 
	    	if ((ligne = this.entrée.readLine()) != null) {
	    		tok = new StringTokenizer(ligne);
	    		return tok.nextToken();
            }
	    	else {
	    		throw new Exception("Fin du fichier.");
	    	}
        }
		
		}catch (IOException e) {
            e.printStackTrace();
        }
		return null;   /// return null si exception
		
	
	}

}

