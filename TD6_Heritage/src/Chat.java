	/**
	 * @author aleks
	 * @param args
	 */

public class Chat extends Felin implements Domesticable {

	protected boolean domestique = true; 

	/** présentation des caractéristiques du chat */
	public Chat(String type, int pattes, boolean domestique_) {
		super(type, pattes, domestique_);
	 } 
	
	/** présentation des caractéristiques du chat */
	public void présente() { 
	// appel de la méthode de la sur-classe
		super.présente();
		String etat = (domestique) ? "domestique" : "sauvage"; 
		System.out.println("je suis vraiment un animal " + etat) ; 
	 }

	@Override
	public void domestiquer(String nom) {
		
	}

	@Override
	public String nom() {
		return null;
	} 
	
}
