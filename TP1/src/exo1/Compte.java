package exo1;

public class Compte {
	//Les attributs

		//On d�clare un entier "numero" pour le numero du compte bancaire
		private int numero;
		//On d�clare deux double "solde" et "decouvert" 
		private double solde, decouvert;

		//Constructeur qui initialise la sole et le d�couvert � 0
		public Compte(int numero) {
			//On initialise la solde � 0
			solde=0;
			//On initialise le d�couvert � 0
			decouvert=0;
		}

		//Accesseurs  obtenir le d�couvert
		public void setDecouvert(double montant) {
			//On initialise le d�couvert au montant 
			decouvert=montant;

		}
		//Accesseurs  pour obtenir le d�couvert
		public double getDecouvert() {
			//On retourne la valeur du decouvert du compte bancaire
			return decouvert;
		}

		//Accesseurs  pour obtenir le num�ro
		public  int getNumero() {
			//On retourne la valeur du num�ro bancaire
			return numero;
		}

		//Accesseurs  pour obtenir le solde
		public double getSolde() {
			//On retourne la valeur de la solde du compte bancaire
			return solde;
		}

		//Methode pour afficher le solde
		public void afficherSolde() {
			//On affiche la solde du compte bancaire
			System.out.println("Votre solde est de : " + solde);
		}

		//Methode pour afficher le solde du d�pot
		public void depot(double montant) {
			//On change la valeur de la solde en ajoutant le montant
			solde=solde+montant;
		}

		//Methode pour faire et afficher les retraits
		public String retrait(double montant) {
			//Condition qui nous refuse le retrait si montant est sup�rieure � la valeur de la solde et du d�couvert
			if (solde+decouvert < montant) {
				return "Retrait refus�, votre solde est de " + getSolde() ;
			}
			//Condition qui accepte le retrait si le montant est inf�rieure � la solde
			else {
				solde=solde-montant;
				return "Retrait accept�, votre solde est de " + getSolde();
			}
		}
}
