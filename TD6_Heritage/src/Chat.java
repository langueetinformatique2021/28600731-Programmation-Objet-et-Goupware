	/**
	 * @author aleks
	 * @param args
	 */

public class Chat extends Felin implements Domesticable {
	
	
	public Chat() {
		super("Chat");
	}
	
	public Chat(String type) {
			super(type); // si on veut rajouter par ex des sous-espèces de chat 
									// dans la classe Chat
		}

	String nom = null;
	
	@Override
	public void domestiquer(String nom_) {
		// TODO Auto-generated method stub
		domestique = true;
		nom = nom_; 
	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return nom;
	}
	
	public void crie() {
		System.out.println("Je miaule");
	}
}
