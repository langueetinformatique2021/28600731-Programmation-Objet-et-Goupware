package Alexandra_28600731_TD4;

public class TD4_2_BoucleConditionnelle_APriori {

	//Ex2_Boucle conditionnelle a priori:
	
	
	
	public static void main(String[] args) {
		//String s1 = "azerty", s2 = "ytreza";
		String s1 = "bonjour", s2 = "roujnob";
		
		int i1 = 0, i2 = s2.length() - 1;
		boolean flag;

		if (s1.length() == s2.length()) {
			while ((i2 >= 0) && (s1.charAt(i1) == s2.charAt(i2))) {
				i1++;
				i2--;
			}
			if (i2 == -1) {
				System.out.println("mots miroirs");
				flag = true;
			}
			else {
				flag = false;
			}
			
			System.out.println(flag);
		}
		
	}
}
