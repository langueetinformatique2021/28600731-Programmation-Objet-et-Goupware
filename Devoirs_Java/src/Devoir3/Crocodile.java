package Devoir3;

/**
 * @author Alexandra Demkovic
 * @param args
 */

public class Crocodile extends Reptile implements Repertorier {
	String nom;
	String id;
	String habitat;



	public Crocodile( int _age, String _sexe,
			double _poids, double _taille) {
		super("Crocodile", _age, _sexe, _poids, _taille);
	}
	
	public Crocodile(String type) {
			super(type, 45, "mâle", 800, 600); // si on veut rajouter par ex des sous-espèces de Crocodile 
									// dans la classe Crocodile
	}
	
	
	public void repertorier(String _nom, String _id, String _habitat) {
		nom = _nom;  // sinon écrire  this.nom = nom  (this est l'objet)
		id = _id;
		habitat = _habitat;
	}
	
	public void set_nom(String _nom) {
		nom = _nom;
	}
	
	public String get_nom() {
		return nom;   //return this.nom   si on avait utilisé this plus haut
	}
	
	public void crie() {
		System.out.println("Je vagie");
	}

	public void set_id(String _id) {
		id =_id;
		
	}

	public String get_id() {
		return id;
	}

	public void set_habitat(String _habitat) {
		habitat = _habitat;
		
	}

	public String get_habitat() {
		return habitat;
	}
	
	
}
	
