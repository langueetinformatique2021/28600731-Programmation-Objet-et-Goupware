package Devoir3;

/**
 * @author Alexandra Demkovic
 * @param args
 */


/** gestion du répertoire de l'identité d'un animal */
public interface Repertorier {

	/** Domestiquer un animal et lui donner un nom
	* @param nom = nom de l'animal */
	public void set_nom(String nom); 
	
	/** Rend le nom de l'animal
	* @return nom de l'animal */
	public String get_nom();
	
	
	/** 
	* @param id = numéro d'identifiant (id) de l'animal */
	public void set_id(String id); 
	
	/** 
	* @return numéro d'identifiant de l'animal */
	public String get_id();
	
	
	/** 
	* @param habitat = le lieu d'habitation de l'animal */
	public void set_habitat(String habitat); 
	
	/** 
	* @return lieu d'habitation de l'animal */
	public String get_habitat();


}

