package Devoir4;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle Cercle1; // création de référence
		Cercle1 = new Cercle("Violet"); // création d'objet
		
		Cercle Cercle2;
		Cercle2 = new Cercle("Orange");
		
		Cercle Cercle3;
		Cercle3 = new Cercle("Rouge");
		
		Cercle Cercle4;
		Cercle4 = new Cercle("Bleu");
		
		// affectation de valeurs aux champs de données (attributs)
		Cercle1.setX(10);
		Cercle1.setY(20);
		Cercle1.setR(5);
		
		Cercle2.setX(22);
		Cercle2.setY(15);
		Cercle2.setR(7.5);
		
		Cercle3.setX(6);
		Cercle3.setY(7);
		Cercle3.setR(4);
		
		Cercle4.setX(22);
		Cercle4.setY(15);
		Cercle4.setR(7.5);
		
		
		float surface1 = Cercle1.surface(); // invocation de méthode double circonference = Cercle1.circonference();
		float surface2 = Cercle2.surface();
		float surface3 = Cercle3.surface();
		float surface4 = Cercle4.surface();
		
		
		System.out.println("Cercle1 :" + "  couleur=" + Cercle1.getCouleur() + "  rayon="+Cercle1.getR()+"  surface="+surface1+"  circonférence="+Cercle1.circonference());
		System.out.println("Cercle2 :" + "  couleur=" + Cercle2.getCouleur() + "  rayon="+Cercle2.getR()+"  surface="+surface2+"  circonférence="+Cercle2.circonference());
		System.out.println("Cercle3 :" + "  couleur=" + Cercle3.getCouleur() + "  rayon="+Cercle3.getR()+"  surface="+surface3+"  circonférence="+Cercle3.circonference());
		System.out.println("Cercle4 :" + "  couleur=" + Cercle4.getCouleur() + "  rayon="+Cercle4.getR()+"  surface="+surface4+"  circonférence="+Cercle4.circonference());
		
		System.out.println();
		System.out.println("Cercle1 est plus grand que Cercle2:" + Cercle1.plusGrandQue(Cercle2));
		System.out.println("Cercle1 est plus petit que Cercle3:" +Cercle1.plusPetitQue(Cercle3));
		System.out.println("Cercle1 est pareil que Cercle4:" +Cercle1.pareilQue(Cercle4));
		
		System.out.println();
		System.out.println("Cercle2 est plus grand que Cercle1:" +Cercle2.plusGrandQue(Cercle1));
		System.out.println("Cercle2 est plus petit que Cercle3:" +Cercle2.plusPetitQue(Cercle3));
		System.out.println("Cercle2 est pareil que Cercle4:" +Cercle2.pareilQue(Cercle4));		
		
		System.out.println();
		System.out.println("Cercle3 est plus grand que Cercle1:" +Cercle3.plusGrandQue(Cercle1));
		System.out.println("Cercle3 est plus petit que Cercle2:" +Cercle3.plusPetitQue(Cercle2));
		System.out.println("Cercle3 est pareil que Cercle4:" +Cercle3.pareilQue(Cercle4));
		
		System.out.println();
		System.out.println("Cercle4 est plus grand que Cercle1:" +Cercle4.plusGrandQue(Cercle1));
		System.out.println("Cercle4 est plus petit que Cercle2:" +Cercle4.plusPetitQue(Cercle2));
		System.out.println("Cercle4 est pareil que Cercle3:" +Cercle4.pareilQue(Cercle3));
	}

}
