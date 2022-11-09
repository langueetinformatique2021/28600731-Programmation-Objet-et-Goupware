package devoir2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alexandra DEMKOVIC
 * @see Classe_promo
 * pour la classe étudiant, les attributs sont nom et prénom, le numéro étudiant, la date de naissance, la moyenne générale, 
 * ainsi que la mention. La moyenne générale est calculée à partir de notes entrées dans la Test_classe1, 
 * et la mention est donnée selon la moyenne générale atteinte.
 * Des méthodes set, get et add sont utilisées pour obtenir les différentes caractéristique d'un étudiant.
 * Aussi, une fonction est créée pour comparer les étudiants entre eux 
 * pour savoir qui a la meilleure moyenne entre les deux étudiants comparés.
 * 
 */

public class Classe_Etudiant {
	
	private int num_etu;
	private String nom;
	private String prenom;
	private String genre;
	private String date_naissance;
	private List<Double> notes = new ArrayList();
	private double moyenne_generale;
	private Classe_promo promo;
	
	/**
	 * Constructeur avec les caractéristiques d'un étudiant :
	 * @param num_etu
	 * @param nom
	 * @param prenom
	 * @param genre
	 * @param date_naissance
	 */
	public Classe_Etudiant(int num_etu, String nom,
			String prenom, String genre, String date_naissance) {
		this.num_etu = num_etu;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.date_naissance = date_naissance;
		
	}

	/**
	 * création d'une promotion
	 * @param promo 
	 */
	public void setPromo(Classe_promo promo) {
		this.promo = promo;		
	}

	/**
	 * Méthodes get pour obtenir les différentes caractéristiques de l'étudiant
	 * @return num_etu pour le numéro étudiant, nom pour le Nom de famille de l'étudiant, prenom pour le prénom de l'étudiant,
	 * genre pour le sexe M (masculin) ou F(féminin) de l'étudiant, date_naissance pour la date de naissance de l'étudiant,
	 * et une mention du type "Bien" ou encore "Non admis" pour obtenir la mention de l'étudiant à partir de sa moyenne générale,
	 *  
	 */
	public int getNum_etu() {
		return num_etu;
	}
	public String getNom(){
		return nom;
	}	
	public String getPrenom(){
		return prenom;
	}
	public String getGenre(){
		return genre;
	}
	public String getDateN() {
		return date_naissance;
	}
	private String getMention() {
		if (this.moyenne_generale > 10) {
			if (this.moyenne_generale > 12) {
				if (this.moyenne_generale > 14) {
					if (this.moyenne_generale > 16) {
						if (this.moyenne_generale > 18) {
							return "Excellente";
						}
						return "Très Bien";
					}
					return "Bien";
				}
				return "Assez Bien";
			}
			return "Passable";
		}
		return "Non admis";
	}
	
	/**
	 * 
	 * @return la promotion étudiante
	 */
	
	public Classe_promo getPromo() {
		return promo;
	}
	
	/**
	 * 
	 * @return les notes listées de l'étudiant
	 */
	public List<Double> getNotes(){
		return notes;
	}
	
	/**
	 * méthode getMoyenneG() pour avoir la moyenne générale de l'étudiant et l'afficher dans ses caractéristiques
	 * @return la moyenne générale de l'étudiant
	 */
	public double getMoyenneG() {
		return moyenne_generale;
	}
	
	/**
	 * affiche() les caractéristiques d'un étudiant
	 */
	public void affiche( ) {
		System.out.println("Numéro étudiant : " + this.num_etu + ", Nom : " 
	+ this.nom + ", Prénom : " + this.prenom + ", Genre : " + this.genre + ", Date de naissance :" 
	+ this.date_naissance + ", Moyenne générale :" + this.moyenne_generale + ", Mention :" + this.getMention() +
	", Promotion : " +this.getNomPromo());
	}	
	
	/**
	 * Méthodes add avec addNote et set avec setMoyenneG pour ajouter ou modifier des caractéristiques chez l'étudiant
	 * @param n notes
	 */
	public void addNote(double n){
		notes.add(n);
		this.setMoyenneG();	
	}
	
	/**
	 * Calcul de la moyenne générale avec la méthode setMoyenneG()
	 */
	private void setMoyenneG() {
		double sum = 0;
		int len = this.notes.size();
		for(int i = 0; i < len; i++)
		    sum += this.notes.get(i);			
		this.moyenne_generale = sum / len;
	}
	
	/**
	 * Méthode pour trouver l'étudiant ayant la meilleure moyenne en le comparant à un autre étudiant
	 * @param etudiant
	 * @return true si l'étudiant en position this a une meilleure moyenne que l'autre étudiant 
	 * avec lequel il est comparé, sinon return false
	 * 
	 */
	private boolean meilleurque(Classe_Etudiant etudiant) {
		if (this.moyenne_generale > etudiant.moyenne_generale) {
			return true;
		}
		return false;
	}
	
	/**
	 * affichemeilleur() pour comparer deux étudiants entre eux
	 * @param l'étudiant en position "this" comparé à etu2 qui est un autre étudiant auquel il est comparé
	 * on affiche quel étudiant est meilleur entre deux étudiants comparés
	 */
	public void affiche_meilleur(Classe_Etudiant etu2) {
		String nom1 = this.getNomComplet();
		String nom2 = etu2.getNomComplet();
		if (this.meilleurque(etu2)) {
			System.out.println(nom1 + " est meilleur que " + nom2);
		} else {
			System.out.println(nom2 + " est meilleur que " + nom1);
		}
		
	}
	/**
	 * @return le nom et le prénom comme nom complet d'un étudiant dans les résultats affichés dans la méthode affiche_meilleur()
	 */
	public String getNomComplet() {
		return this.nom + " " + this.prenom;
	}
	
	/**
	 * méthode getNomPromo()
	 * @return l'intitulé, l'année et le niveau de la promotion 
	 * dans les caractéristiques de l'étudiant
	 */
	public String getNomPromo() {
		return this.promo.getNom();
	}


		
}
