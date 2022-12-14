package Devoir6;

import java.io.*;
import java.util.Date;
import java.util.zip.DeflaterOutputStream;

/**
 * Problème 4. Spécialisation de flots
 * Construction de la classe non exécutable FileInputStreamTP9 
 * héritant de FileInputStream
 * @author Alexandra Dkc
 *
 */

/// (J'ai mis TP9 au lieu de TP7 parce que c'est l'atelier 9)
public class FileInputStreamTP9 extends FileInputStream {
    
    private final File file;

    /**
     * Constructeur de la classe FileInputStreamTP9
     * @param NomFichier nom du fichier (ou son chemin)
     * @throws FileNotFoundException erreur renvoyé si fichier non trouvé
     */
    public FileInputStreamTP9(String NomFichier) throws FileNotFoundException {
        super(NomFichier);
        this.file = new File(NomFichier);
    }

    /**
     * Copier le fichier source dans une nouveau fichier copie
     * @param fic_dest fichier de destination
     * @throws IOException erreur de lecture
     */
    public void Copie(File fic_dest) throws IOException {
        FileOutputStream fcible = new FileOutputStream(fic_dest);
        int buffer;   /// le buffer représente le conteneur avec une capacité fixe pour stocker des données
        while ((buffer = this.read()) != -1) {
        	fcible.write(buffer);
        }
        fcible.close();
    }

    /**
     * Le fichier donné est compressé en .zip
     * @param fichier_out fichier de destination
     * @throws IOException erreur de lecture
     */
    public void Compresse(File fichier_out) throws IOException {
        DeflaterOutputStream fcible = new DeflaterOutputStream(new FileOutputStream(fichier_out));
        int buffer;
        while ((buffer = this.read()) != -1) {
        	fcible.write(buffer);
        }
        fcible.close();
    }


    /**
     * Affichage d'un ensemble de propriétés d'un fichier donné
     * @return 
     */
    public boolean Propriétés() throws IOException {
    	String NomFichier = file.toString();
    	int index = NomFichier.lastIndexOf('.');
    	if (index > 0) {String extension = NomFichier.substring(index + 1);
    	System.out.println("File extension is " + extension);
    	System.out.println("Chemin absolu du fichier: " + this.file.getAbsolutePath());
    	System.out.println("Chemin du fichier: " + this.file.getPath());
    	System.out.println("Le parent du fichier: " + this.file.getParentFile());
    	System.out.println("Le parent est : " + this.file.getParent());
    	System.out.println("Le fichier absolu est : " + this.file.getAbsoluteFile());
    	System.out.println("La classe du fichier est : " + this.file.getClass());
    	System.out.println("Nom du fichier: " + this.file.getName());
    	System.out.println("Taille du fichier: " + this.file.length());
    	System.out.println("L'espace total du fichier: " + this.file.getTotalSpace());
    	System.out.println("L'espace utilisable du fichier: " + this.file.getUsableSpace());
    	System.out.println("Dernière modification en date effectuée sur le fichier: " + new Date(this.file.lastModified()));
    	
    	}
		return false;
    	
    }

    
    /**
     * Comparaison du contenu de deux fichiers pour savoir si leur contenu est identique ou non
     * @param NomFichierX le fichier comparé à un autre fichier
     * @return true si le contenu des fichiers comparés est identique, sinon false
     * @throws IOException erreur de lecture
     */
    public boolean CompareTo(FileInputStreamTP9 NomFichierX) throws IOException {
            int buffer1;
            
            while ((buffer1 = this.read()) != -1) {
                if (buffer1 != NomFichierX.read()) {
                    return false;
                }
                
                
            }
            return true;
        
    } 
    	
    		
}
