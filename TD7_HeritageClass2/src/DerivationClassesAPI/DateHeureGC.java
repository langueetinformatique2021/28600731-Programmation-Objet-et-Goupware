package DerivationClassesAPI;

/**
 * @author Alexandra Demkovic
 * Afficher la date et l'heure de la création d'un objet de type GregorianCalendar
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateHeureGC {

	public static void main(String[] args) {
		   GregorianCalendar calendar = new GregorianCalendar(2022, Calendar.NOVEMBER , 17);
		   Date date = calendar.getTime();  //getTime() pour afficher la date et l'heure
		   calendar.set(Calendar.HOUR, 10);
		   calendar.set(Calendar.MINUTE, 13);
		   calendar.set(Calendar.SECOND, 23);
		   
		   System.out.println(date);
		   
		   System.out.println("Année : " + calendar.get(Calendar.YEAR));
		   System.out.println("Mois : " + calendar.get(Calendar.MONTH));
		   System.out.println("Jour : " + calendar.get(Calendar.DAY_OF_MONTH));

		   System.out.println("Heures : " + calendar.get(Calendar.HOUR));
		   System.out.println("Minutes : " + calendar.get(Calendar.MINUTE));

	}

}
