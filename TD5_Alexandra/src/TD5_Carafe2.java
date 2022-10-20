
public class TD5_Carafe2 {
	
	/**
	 * @author aleks  
	 * @author Alexandra
	 * @params c1 est la carafe 1;
	 * @params c2 est la carafe 2;
	 * @params c1_max est la capacité maximum de la carafe 1;
	 * @params c2_max est la capacité maximum de la carafe 2;
	 * @params objectif est la quantité de litres qu'on souhaite avoir atteint dans une carafe;
	 * @comments On utilise 3 fonctions qui sont : </br>
	 * @comments - vider, pour avoir les carafes au niveau 0; </br>
	 * @comments - remplir, pour pouvoir remplir les carafes; </br>
	 * @comments - transvaser, pour transverser le contenu d'une carafe dans l'autre; </br>
	 * @comments - test_carafe, 4e fonction calculant la quantité des carafes avec les 3 fonctions précédentes, 
	 * @comments et atteindre l'objectif d'obtenir les 5 litres voulus dans une carafe. </br>
	 * @comments 'this' représente la variable elle-même, la carafe se vide elle-même. </br>
	 * @comments X correspond à la quantité d'eau dans une carafe 1; </br>
	 * @comments Y correspond à la quantité d'eau dans une carafe 2; </br>
	 * @comments vider la carafe = (X, Y)->(0, Y);  </br>
	 * @comments remplir la carafe = (0, 0)->(X, 0); </br>
	 * @comments transvaser le contenu d'une carafe dans l'autre jusqu'à que l'une d'elles soit vide ou pleine = (X, Y)->(Xd, Y+d); </br>
	 */
	
	int c1_max = 7;
	int c2_max = 4;
	int c1 = 0;
	int c2 = 0;
	int objectif = 5;
		
		
		public void vider_C1() {
			
			this.c1=0;													// 'this' représente la variable elle-même, la carafe se vide elle-même
			System.out.println("{" + this.c1 + "," + this.c2 + "}");
			
		}
		
		public void vider_C2() {
			this.c2=0;
			System.out.println("{" + this.c1 + "," + this.c2 + "}");
		}
		
		
		
		
		/** 
		 * on remplit les carafes c1 et c2 à leur maximum
		 */
		
		public void remplir_C1() {
			
			this.c1 = this.c1_max;
			System.out.println("{" + this.c1 + "," + this.c2 + "}");
			
		}
		
		public void remplir_C2() {
			this.c2 = this.c2_max;
			System.out.println("{" + this.c1 + "," + this.c2 + "}");
		}
		
		
		
		
		/** 
		 * transvaser C1 vers C2:
		 */
	
		 public void transvaser() {
			
			int q = 0;
			
			while(q != 1) {
				
				this.c2 += 1;
				this.c1 -= 1;
				
				if((this.c2 == this.c2_max) || (this.c1 == 0)) { q = 1;}
	
			}
			
			System.out.println("{" + this.c1 + "," + this.c2 + "}");
			
		}
	
	
	
		 public void test_carafe() {
			
			int q = 0;
			
			while(q != 1) {
				
				if((this.c1 == this.objectif) || (this.c2 == this.objectif)) { q = 1; }  // '||' ou logique en java
				
				if(this.c1==0) {
					remplir_C1();
					
				} else if ((this.c1 > 0) && (this.c2 != this.c2_max)) {    // && : 'et' logique en java
					transvaser();
					
				} else if ((this.c1 > 0) && (this.c2 == this.c2_max)) {
					vider_C2();
					
				}
			
			
			}
		 
	}

}
