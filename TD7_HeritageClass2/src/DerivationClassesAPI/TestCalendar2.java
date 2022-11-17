package DerivationClassesAPI;

import util.Keyboard;

public class TestCalendar2 {

	public static void main(String[] args) {
		
		Calendar2 c = new Calendar2();
		c.creation();
		Keyboard.getInt("attente");
		c.creation();
		c.afficher();
		c.duree();
	}

}
