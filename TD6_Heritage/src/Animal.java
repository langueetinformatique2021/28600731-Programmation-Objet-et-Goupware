	/**
	 * @author aleks
	 * 
	 */


public abstract class Animal {

		/** Création et gestion d'animaux */
		private String espèce;
		private int nb_pattes;
		
		/** création d'une nouvelle instance de la classe Animal
		* @param type nom de l'espèce
		* @param pattes nombre de pattes
		*/
		public Animal(String type, int pattes) { 
			 espèce=type; 
			 nb_pattes = pattes; 
		}
		public Animal() {  
		} 
		/** présentation des caractéristiques de l'animal */
		public void présente() { 
			 System.out.println("je suis un représentant de l'espèce des " +espèce+ 
			" et j'ai "+nb_pattes+ " pattes" ); 
		} 
		/** cri de l'animal */
		public abstract void crie(); //une classe abstraite (sans code)
		
}
