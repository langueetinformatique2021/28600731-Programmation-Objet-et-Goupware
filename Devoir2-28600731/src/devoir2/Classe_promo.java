package devoir2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alexandra DEMKOVIC
 * La Classe_promo contient les caractéristiques de la promotion 
 * qui sont son intitulé (initule), son niveau, et son année (annee)
 * et chaque étudiant est rattaché à une promotion étudiante.
 */

public class Classe_promo {
	
	private String intitule;
	private String niveau;
	private String annee;
	private List<Classe_Etudiant> liste_etu = new ArrayList(); 

	/**
	 * 
	 * @param inti : intitule (intitulé de la promotion)
	 * @param niv : niveau (niveau d'étude de la promotion)
	 * @param ann : annee (l'année de la promotion étudiante)
	 */
	public Classe_promo(String inti, String niv, String ann) {
		this.intitule = inti;
		this.annee = ann;
		this.niveau = niv;
		
	}
	/** 
	 * Méthode d'ajout d'un étudiant à une liste d'étudiant,
	 * d'abord on ajoute la promotion concernée à l'étudiant donné,
	 * puis on ajoute l'étudiant dans cette promo.
	 * @param etudiant
	 */
	public void addetu(Classe_Etudiant etudiant) {
		etudiant.setPromo(this);
		this.liste_etu.add(etudiant);
	}

	/**
	 * afficher() les caractéristiques de la promotion étudiante créée avec l'intitulé, 
	 * le niveau d'étude et l'année de la promotion.
	 */
	public void affiche( ) {
		System.out.println("Promotion :" + this.intitule + "Niveau d'étude : " 
	+ this.niveau + "Année d'étude :" + this.annee);
	}
	
	public String getNom() {
		return this.intitule + " " + this.niveau  + " " +  this.annee;
		
	}
}
