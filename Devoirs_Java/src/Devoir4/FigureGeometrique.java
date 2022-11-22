package Devoir4;

/**
 * 
 * @author Alexandra DEMKOVIC
 *Création et gestion d'une figure géométrique
 */
public abstract class FigureGeometrique {
	
    protected String couleur = "noir";

    /** création d'une nouvelle instance de la classe FigureGeometrique
     * @param _couleur : couleur de la figure
     */    
    public FigureGeometrique (String _couleur) {
        couleur = _couleur; // couleur par défaut
    }
    
    public String getCouleur() {
    	return this.couleur;
    }

	/** calcul du périmètre d'une figure géométrique
		 * @return périmètre
		 */    
		public abstract float perimetre();

		/** calcul de la surface d'une figure géométrique
		 * @return surface
		 */    
		public abstract float surface();
}
