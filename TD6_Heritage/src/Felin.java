		

	/**
	 * @author aleks
	 * 
	 */


		/** Création et gestion de félins */
public class Felin extends Animal { 
// ajout d'attributs propres à la sous-classe
		protected boolean domestique = false; 
		//int pattes = 4;   //les félins ont 4 pattes, à retirer car on l'a dans Animal déjà
		
		/** le constructeur de Félins fait appel au constructeur de la sur-classe Animal */
		public Felin(String type) {
			super(type, 4);
		 } 
		
		/** présentation des caractéristiques du félin */
		public void présente() { 
		// appel de la méthode de la sur-classe
			super.présente();
			String etat = (domestique) ? "domestique" : "sauvage"; 
			System.out.println("je suis vraiment un animal " + etat) ; 
		 } 
		
		/** cri du félin */
		public void crie() {
			System.out.println("miaou");  //les félins ne font pas "miaou"
		}
		
		
}
