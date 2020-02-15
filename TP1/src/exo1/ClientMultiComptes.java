package exo1;

public class ClientMultiComptes {
	//attributs
		public String nom;
		public String prenom;
		private Compte[] tabcomptes = new Compte[10];		
		private int nbcompte;		
		private Compte compteCourant;		
		private double solde;

		// constructeur client multi comptes

		public ClientMultiComptes (String n, String p, Compte compte) {
			//On initialise et déclare un tableau "tabcomptes" qui contiendra le premier compte bancaire
			tabcomptes [0] = compte;
			//Ceci va nous permettre d'ajouter les comptes suivants
			nbcompte ++;
			
			this.nom=n;
			this.prenom=p;			
			this.compteCourant = compte;				
		}
		//Methode ajoutercompte
		public void ajouterCompte(Compte c) {
			tabcomptes [nbcompte] = c;
		}

		//Methode double getsolde
		public  double getSolde() {
			return solde;
		}


}
