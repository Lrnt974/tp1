package exo1;

public class Client {
	//Attributs clients

		public String nom;
		public String prenom;
		
		//Déclation privé du Compte Courant
		private Compte compteCourant;


		// Constructeur info Clients

		public Client(String n, String p, Compte compte) {
			//On attribut "nom "à la variable n
			this.nom=n;
			//On attribut le "prenom" à la variable p
			this.prenom=p;
			//On attribut "comptecourant" à la varible compte
			this.compteCourant = compte;
		}	


		//Accesseur pour obtenir le nom
		public String getnom(){
			//On retourne la valeur de l'attribut "nom"
			return this.nom;
		}

		//Accesseur pour obtenir le prenom
		public String getprenom(){
			//On retourne la valeur de l'attribut "prenom"
			return this.prenom;
		}

		//Accesseur pour obtenir la solde
		public double getSolde() {
			//On retourne la valeur du compte courant en fonction de la solde
			return compteCourant.getSolde();
		}

		//Methode pour afficher la solde
		public void afficherSolde() {
			//On affiche un message pour notre solde en fonction du solde et du compte courant
			System.out.println("Voici votre solde : " + compteCourant.getSolde());
		}
	}

