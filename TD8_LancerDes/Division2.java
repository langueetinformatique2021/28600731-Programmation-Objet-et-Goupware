package TD8_LancerDes;

/**
 * 
 * @author Alexandra DKC
 *TD8_ex3 Capturer l'exception levée dans la méthode main()
 */
public class Division2 {

	public static void main(String[] args) { 
		try {division(); }
		catch(Exception e) {
			System.out.println("Exception capturée dans la méthode main :");
			System.out.println(e.getMessage());
		}
	}

	public static void division() throws Exception {
		try {
		int i = 1000, j;
		do {i--; j = 1 / i;} while (true);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
