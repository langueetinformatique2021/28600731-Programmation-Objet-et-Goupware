
public class TD5_14J {

	//Calculer le nombre de jours restants avant le 14 juillet 2023

	public static void main(String[] args) {
		
		Date date_du_jour = new Date(20, 10, 2022);
		Date fete14J = new Date(14, 07, 2023);
		

		int n = 0;
		while (fete14J.CompareTo(date_du_jour)) {
			date_du_jour.Incrementer();  //pour augmenter la valeur de la variable, donc le nombre n de jours
			n++; 
		}
			
		System.out.println("Nombre de jours restants avant le 14 Juillet 2023 : " + n);
		
	}
}