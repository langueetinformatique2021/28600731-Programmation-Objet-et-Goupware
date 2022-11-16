package Devoir3;

/**
* @author Alexandra Demkovic
* 
*/

/** Création et gestion des reptiles */
public class Reptile extends Animal {
//ajout d'attributs propres à la sous-classe
protected boolean domestique = false;
protected boolean volant = false;
private String espece;

/** le constructeur de Reptile fait appel au constructeur de la sur-classe Animal */
public Reptile(String _espece, int _age, String _sexe,
		double _poids, double _taille) {
	super("reptile", _age, _sexe, _poids, _taille);
	espece = _espece;
 } 

protected String deplacement() {
	return (volant) ? "volant" : "rampant";
}

/** présentation des caractéristiques du reptile */
public void présente() { 
// appel de la méthode de la sur-classe
	super.présente();
	String etat1 = (domestique) ? "domestique" : "sauvage"; 
	String etat2 = this.deplacement();
	System.out.println("Je suis vraiment un " + espece + " " + etat1 + " et " +etat2 +".") ;
 } 

/** cri du reptile */
public void crie() {
	System.out.println("Raaah"); 
}

}
