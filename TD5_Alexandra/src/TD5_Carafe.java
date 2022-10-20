

public class TD5_Carafe {

	/** @author aleks
	 * 
	 * @params 2 attributs int : contenu_, capacite_;
	 * @params 2 autres attributs int : contenu, capacite;
	 * @params 3 fonctions : remplir, vider, transvaser;
	 * 
	 */
		/** 
		 * On utilise private pour éviter qu'elle soit modifiée dans son objet ou mal utilisée à l'extérieur
		 * 
		 */
		
		private int contenu_, capacite_;

		
		/**
		 * Contructeur non vide
		 * 
		 * @param contenu : le contenu en litres de la carafe
		 * @param capacite : la capacite en litres de la carafe
		 */
		
		public TD5_Carafe(int contenu, int capacite) {
			contenu_ = contenu;
			capacite_ = capacite;
		}
		
		/**
		 * X correspond à la quantité d'eau dans une carafe 1;
		 * Y correspond à la quantité d'eau dans une carafe 2;
		 * 
		 * vider la carafe 
		 * (X, Y)->(0, Y)
		 * 
		 * accesseur en écriture
		 */
		
		public void vider() {              		// pas de paramètre dans vider() car on se vide soi-même
			contenu_ = 0;
		}
		
		/**
		 * remplir la carafe 
		 * (0, 0)->(X, 0)
		 * accesseur en écriture
		 */
		
		public void remplir() {
			contenu_ = capacite_;
		}
		
		/**
		 * transvaser le contenu d'une carafe dans l'autre jusqu'à que l'une d'elles soit vide ou pleine
		 * (X, Y)->(Xd, Y+d)
		 * 
		 * accesseur en écriture
		 * 
		 */
		
		
		public void transvaser(TD5_Carafe c) {	                     	// la fonction transvaser ne contient qu'un seul paramètre
			int reste = c.capacite() - c.contenu();
			if (reste > this.contenu()) {                  		// moi-même c'est 'this'
				c.contenu(c.contenu() + this.contenu());
				this.vider();
			} else {
				this.contenu(this.contenu() - reste);
				c.remplir();
			}
		}
		
		
		/** 
		 * acesseur en lecture privé
		 * 
		 * @return le contenu de la carafe
		 */
		public int contenu() {
			return contenu_;
		}
		
		/**
		 * accesseur en lecture
		 * @return la capacite de la carafe
		 */
		
		public int capacite() {
			return capacite_;
		}
		
		/**
		 * accesseur en écriture privé
		 * 
		 * @param c nouveau contenu de la carafe
		 */
		private void contenu(int c) {
			contenu_ = c;

		}
}
