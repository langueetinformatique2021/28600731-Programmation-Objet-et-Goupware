package EX1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Copie {

    public Copie() {
    }
    public static void main (String[] args)throws IOException
    {
     ///Fichier source
	 String in_File = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt";
	 ///Fichier de destination
     String out_File= "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\NomCopie.txt";
     ///copier le contenu de la source dans le fichier destination
     copier(in_File,out_File);
    }
    
    private static void copier(String fichier_in, String fichier_out)throws IOException
    {
     try (FileInputStream src = new FileInputStream(fichier_in);
			FileOutputStream dest = new FileOutputStream(fichier_out)) {
		FileChannel inChannel = src.getChannel();
		FileChannel outChannel = dest.getChannel();
 
		for (ByteBuffer buffer = ByteBuffer.allocate(1024*1024);
		     inChannel.read(buffer) != -1;
		     buffer.clear()) {
		   buffer.flip();
		   while (buffer.hasRemaining()) outChannel.write(buffer);
		}
 
		inChannel.close(); /// fermer après la lecture
		outChannel.close(); /// fermer après la lecture
	}
    }
}
