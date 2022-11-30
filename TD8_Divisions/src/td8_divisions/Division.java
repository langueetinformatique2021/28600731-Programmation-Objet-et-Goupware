package td8_divisions;

/**
 * 
 * @author Alexandra DKC
 * TD8 _ exercies 1 et 2 : captuer l'exception levée avec try-catch
 */

public class Division {

	public static void main(String[] args) {
			int i = 1000, j;
			try {
				do {
					i--;
					j = 1 / i;
				} while (true);
			}	
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/**
 * Message renvoyé : l'exception est la division par zéro 
 * " / by zero "
 */
