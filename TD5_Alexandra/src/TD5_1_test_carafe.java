
public class TD5_1_test_carafe {

	public static void main(String[] args) {
		TD5_Carafe c1 = new TD5_Carafe (0, 7);
		TD5_Carafe c2 = new TD5_Carafe (0, 5);
		
		c1.remplir();
		c2.vider();
		
		System.out.println(c1.contenu());
		System.out.println(c2.contenu());
		
		c1.transvaser(c2);
		
		System.out.println(c1.contenu());
		System.out.println(c2.contenu());
	
	}

}