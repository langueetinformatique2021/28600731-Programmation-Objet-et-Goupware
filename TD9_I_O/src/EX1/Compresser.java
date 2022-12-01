package EX1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Compresser un fichier en fichier zip
 * @author Alexandra
 *
 */
public class Compresser {

	public static void main(String args[]) throws IOException {

        // Fichier source, ici en txt
        String nomFichier = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt";
        // Fichier source compressé dans une fichier zip
        String nomFichierZip = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom_compresse.zip";
        // lecture-écriture du fichier
        byte lire_ecrire[] = new byte[1024];

        FileInputStream fic_s = new FileInputStream(
                new File(nomFichier));
        // création du flux de compression
        ZipOutputStream _compresse = new ZipOutputStream(
                new FileOutputStream(nomFichierZip));

        // un fichier compressés peut avoir plusieurs entrées (fichiers) : cf. ZipEntry
        ZipEntry entree = new ZipEntry(nomFichier);
        _compresse.putNextEntry(entree);

        boolean fini = false;
        int taille;
        while (!fini) {
            taille = fic_s.read(lire_ecrire);
            // read() retourne -1 quand il n'y a plus rien à lire
            if (taille != -1) {
            	_compresse.write(lire_ecrire, 0, taille);
            } else {
                fini = true;
            }
        }

        _compresse.close();  ///fermer la lecture pour éviter les erreurs 
        fic_s.close(); ///pareil
    }
}
