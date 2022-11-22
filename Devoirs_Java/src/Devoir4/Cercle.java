package Devoir4;


public class Cercle extends FigureGeometrique implements Comparable{
	

	public Cercle(String _couleur) {
		super(_couleur);
	}
	/**
	 * @params x et y : coordonnées du centre
	 * @params r : rayon du cercle
	 */
	private double x, y, r;
	
	public double getr() {
		return r;
	}
	/**
	 * Méthodes pour retourner la circonférence et la surface
	 * @return
	 */
	public double circonference() {
		return 2*Math.PI*this.r;
	}
	
	public float perimetre() {
		return (float) circonference();
	}
	
	public float surface() {
		return (float) (Math.PI*this.r*this.r);
	}
	
	/**
	 * //Méthodes pour retourner la circonference et la surface public double getX() { return x;}
	 * get : méthode d'accès
	 * set: méthode de modification
	 * @return
	 */
	//Méthodes pour retourner la circonference et la surface public double getX() { return x;}
	 public double getY() { return y;}
	 public double getR() { return r;}
	 public double setX(double x_in) { return x = x_in;} public double setY(double y_in) { return y = y_in;} public double setR(double r_in) { return r = r_in;}

	 /**
	  * méthodes de comparaison des figures (plus grand que, plus petit que, ou pareil que)
	  */
	public boolean plusGrandQue(Cercle figure) {		
		return (this.getr() > figure.getr());
	}
	
	public boolean plusPetitQue(Cercle figure) {		
		return (this.getr() < figure.getr());
	}	

	public boolean pareilQue(Cercle figure) {		
		return (this.getr() == figure.getr());
	}
	
}
