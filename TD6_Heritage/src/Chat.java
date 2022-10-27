	/**
	 * @author aleks
	 * @param args
	 */

public class Chat extends Felin implements Domesticable {
	
	public Chat(String type, int pattes, boolean domestique_) {
			super(type, pattes, domestique_);
			// TODO Auto-generated constructor stub
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
