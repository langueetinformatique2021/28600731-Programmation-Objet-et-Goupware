	/**
	 * @author aleks
	 * @param args
	 */

public class Chat extends Felin implements Domesticable {
	
	
	public Chat() {
		super("Chats");
	}
	
	public Chat(String type) {
			super(type); // si on veut rajouter par ex des sous-espèces de chat 
									// dans la classe Chat
		}

	String nom = null;
	
	@Override
	public void domestiquer(String nom_) {
		domestique = true;
		nom = nom_;  // sinon écrire  this.nom = nom  (this est l'objet)
	}

	@Override
	public String nom() {
		return nom;   //return this.nom   si on avait utilisé this plus haut
	}
	
	public void crie() {
		System.out.println("Je miaule");
	}
}
