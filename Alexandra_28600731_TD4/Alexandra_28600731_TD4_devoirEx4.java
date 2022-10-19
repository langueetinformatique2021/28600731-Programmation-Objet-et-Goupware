package Alexandra_28600731_TD4;

import java.util.Arrays;

public class Alexandra_28600731_TD4_devoirEx4 {

	public static void main(String[] args) {
		
		// obtention de la médiane des variables en p6:
		
		
		
		//les variables p sont les suivantes:
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		double p6;  // problème rencontré ici pour convertir un double vers un int, donc changer p6 en double
					// et ajout du 2.0 dans le else, plus bas
		
		//trier la liste des variables dans l'ordre croissant et compte le nombre de variables
		//ici avec Arrays.sort et on range avec "int []... "
		int [] variables = new int[] {p1,p2,p3,p4,p5};   //on traite 5 variables
		Arrays.sort(variables);
		
		
		if(variables.length %2 != 0) {  
			
			// si le length(longueur) de l'ensemble des variables est impair, alors il faut trouver le nombre du milieu:
			
			p6 = variables[variables.length/2];
		} 
		
		else {  
			
			// si le length(longueur) de l'ensemble des variables est pair, alors il faut prendre la moyenne des deux nombres du milieu:
			// "/2.0" permet de renvoyer la moyenne des deux variables du milieu en p6
			p6 = (variables[variables.length/2] + variables[variables.length/2-1])/2.0;
		}
		
		System.out.println("La médiane des variables est : " + p6);
	}
	
}
	
	
	
		
		
		
		
		
		
