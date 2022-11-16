package Devoir3;

/**
 * 
 * @author Alexandra Demkovic
 *
 */

public abstract class Animal {

	/** Création et gestion d'animaux */
	private String famille;
	private int age;
	private String sexe;
	private double poids;
	private double taille;
	
	/** création d'une nouvelle instance de la classe Reptile
	* @param type : nom de l'espèce
	* @param _age : l'âge du reptile
	*/
	public Animal(String type, int _age, String _sexe, double _poids, double _taille) { 
		famille = type; 
		 age = _age; 
		 sexe = _sexe;
		 poids = _poids;
		 taille = _taille;
	}
	
	public Animal() {  
	} 
	
	/** présentation des caractéristiques de l'animal */
	public void présente() { 
		 System.out.println("Je suis un représentant de la famille des " +famille+ 
		"s, j'ai "+age+ " an(s), je suis un(e) " +sexe+ 
		", je pèse " +poids+ " kg , et je mesure "+taille+ " cm."); 
	} 
	
	/** cri de l'animal */
	public abstract void crie(); //une classe abstraite (sans code)
	
}

