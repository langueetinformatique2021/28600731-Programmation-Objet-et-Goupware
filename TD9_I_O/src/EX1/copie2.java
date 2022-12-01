package EX1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;

public class copie2 {

	   public static void main(String src, String dest) throws IOException 
	   {
	      // Le fichier source
	      String src1 = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\Nom.txt"; 
	      // Le fichier destination
	      String dest1 = "C:\\Users\\aleks\\git\\28600731-Programmation-Objet-et-Goupware\\TD9_I_O\\src\\EX1\\NomCopie2.txt"; 
	      
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(src1);
	      // Créer l'objet BufferedReader  
	      BufferedReader br = new BufferedReader(fr);  
	      // Créer l'objet File Writer
	      FileWriter fw = new FileWriter(dest1);
	      //Créer l'objet BufferedWriter  
	      BufferedWriter bw = new BufferedWriter(fw);
	      
	      
			for (ByteBuffer buffer = ByteBuffer.allocate(1024*1024);
				     fr.read(buffer) != -1;
				     buffer.clear()) {
				   buffer.flip();
				   while (buffer.hasRemaining()) fw.write(buffer);
				}
		 
	      // Copie le contenu dans le nouveau fichier
	      while(( = br. != null)             
	      {
	    	  bw.write(str);
	    	  bw.write("\n");
	    	  bw.flush();
	      }
	      fw.close();
	   }
	}
