package exo1;

public class Compte {
	//Les attributs

		//On déclare un entier "numero" pour le numero du compte bancaire
		private int numero;
		//On déclare deux double "solde" et "decouvert" 
		private double solde, decouvert;

		//Constructeur qui initialise la sole et le découvert à 0
		public Compte(int numero) {
			//On initialise la solde à 0
			solde=0;
			//On initialise le découvert à 0
			decouvert=0;
		}

		//Accesseurs  obtenir le découvert
		public void setDecouvert(double montant) {
			//On initialise le découvert au montant 
			decouvert=montant;

		}
		//Accesseurs  pour obtenir le découvert
		public double getDecouvert() {
			//On retourne la valeur du decouvert du compte bancaire
			return decouvert;
		}

		//Accesseurs  pour obtenir le numéro
		public  int getNumero() {
			//On retourne la valeur du numéro bancaire
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

		//Methode pour afficher le solde du dépot
		public void depot(double montant) {
			//On change la valeur de la solde en ajoutant le montant
			solde=solde+montant;
		}

		//Methode pour faire et afficher les retraits
		public String retrait(double montant) {
			//Condition qui nous refuse le retrait si montant est supérieure à la valeur de la solde et du découvert
			if (solde+decouvert < montant) {
				return "Retrait refusé, votre solde est de " + getSolde() ;
			}
			//Condition qui accepte le retrait si le montant est inférieure à la solde
			else {
				solde=solde-montant;
				return "Retrait accepté, votre solde est de " + getSolde();
			}
		}
}
