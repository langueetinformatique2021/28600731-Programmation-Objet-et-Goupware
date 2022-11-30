package Devoir5;

/**
 * Générateur de nombres entiers naturels aléatoires
 * @author Alexandra DEMKOVIC
 *
 */
public class LancerDes extends Aleat {
	
	public LancerDes() {
		super(6);
		
	}
	
	public TroisDes lancer() {
		TroisDes tire = new TroisDes(super.get(), super.get(), super.get());
		return tire;
		
	}

}

