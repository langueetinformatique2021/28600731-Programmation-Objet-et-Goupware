	/**
	 * @author aleks
	 * @comments classe de test pour la classe Chat dérivée de la classe Felin, implémentant l'interface Domesticable
	 * 
	 */

public class ClassTest2 {

	public static void main(String[] args) {
		Chat C = new Chat("Siamois");  //mettre Chat() vide, sinon on remplit quand on veut mettre des races de Chat
		C.domestiquer("Je m'apelle Felix");
		System.out.println(C.nom());

	}

}
