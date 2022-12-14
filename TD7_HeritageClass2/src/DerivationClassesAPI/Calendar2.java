package DerivationClassesAPI;

import java.util.Date;
import java.util.GregorianCalendar;

/** dérivée de Calendar implémentant un nouvel attribut cours 
 * et trois nouvelles méthodes creation() afficher() et duree() */
public class Calendar2 extends GregorianCalendar {
			
	private boolean cours;
	private Date creation;
	
	public Calendar2() {
		Date date = new Date();
		this.setTime(date);
		cours = this.isCours();
		
	}
	
	private boolean isCours() {
		if (creation.getHours() <= 12) {
			if (creation.getHours() >= 9) {
				if (creation.getHours() > 9 || creation.getMinutes() >= 30) {
					return true;
				}
			}
		}
		return false;
	}
	
	/** affiche la date et l’heure de la création de l’objet */
	public void creation() {
		System.out.println("TIME: " + this.getTime());
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		System.out.println("TIME: " + calendar.getTime());
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet 
	 * @return */
	public int duree() {
		Date date = new Date();
		return (int) ((date.getTime() -  this.getTime().getTime())/1000);
	}
	
	

}
