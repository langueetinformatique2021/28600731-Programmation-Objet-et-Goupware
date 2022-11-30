package Devoir5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Générateur de nombres entiers naturels aléatoires
 * pour la simulation d'un lancer de dé
 * @author Alexandra DKC
 * @param nom_lanceur Nom du Lanceur
 *
 */
public class LancerDes extends Aleat {

	String nom_lanceur = "Nom";
	
	public LancerDes(String lanceur) {
		super(6);  /// dé à 6 faces
		this.nom_lanceur = lanceur;
	}
	
	
	public void NLanceur() {
		System.out.println("Nom du Lanceur : "+this.nom_lanceur);
	}
	
	
	public TroisDes lancer() throws E421 {
		TroisDes tire = new TroisDes(super.get(), super.get(), super.get()); /// obtenir 3 lancés de dés
		return tire;
		
	}

	/**
	 * Ajout de 
	 * @param tire
	 * @param nom_lanceur
	 * @throws E421
	 */
	@SuppressWarnings({ "unused" })
	private void MainE421(TroisDes tire, String nom_lanceur) throws E421 {
        ArrayList<Integer> liste = new ArrayList<>(); /// Listage des valeurs des dés
        liste.add(tire.d1());
        liste.add(tire.d2());
        liste.add(tire.d3());
		
        if (liste.contains(4)){
            if (liste.contains(2)) {
                 if (liste.contains(1)) {
                     throw new E421(nom_lanceur, tire);
                 } 
             }
         }
	
	}
}

