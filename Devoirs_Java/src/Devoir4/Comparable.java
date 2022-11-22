package Devoir4;

/**
 * 
 * @author Alexandra DEMKOVIC
 * comparaison entre les cercles avec 3 méthodes : plusGrandQue(), plusPetitQue(), pareilQue()
 *
 */
public interface Comparable {
	public abstract boolean plusGrandQue(Cercle figure);
	public abstract boolean plusPetitQue(Cercle figure);
	public abstract boolean pareilQue(Cercle figure);
}
