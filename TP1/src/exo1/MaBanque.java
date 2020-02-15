package exo1;

public class MaBanque {

	public static void main(String[] args) {

		//Cr�ation d'un compte
		Compte c;
		c = new Compte (1);

		//Affichage du d�couvert
		System.out.println("Votre d�couvert est de : " + c.getDecouvert());

		//Changement de valeur du d�couvert et affichage de le solde
		c.setDecouvert(100);
		c.afficherSolde();

		System.out.println("Votre d�couvert est de : " + c.getDecouvert());

		//On fait un retrait de 5, on ajoute de l'argent au d�pot et on affiche le solde
		System.out.println(c.retrait(5));
		c.depot(150);
		c.afficherSolde();

		//Compte num�ro 2
		Compte c2;
		c2 = new Compte (2);

		//Message pour espacer les diff�rents r�sultats
		System.out.println(" ");

		//On depose de l'argent au d�pot
		c2.depot(1000);
		//On affiche le solde
		c2.afficherSolde();
		//On fait un retrait de 600 et 700
		System.out.println(c2.retrait(600));
		System.out.println(c2.retrait(700));
		//On change la somme du d�couvert
		c2.setDecouvert(500);
		//On fait un retrait de 700
		System.out.println(c2.retrait(700));

		//Message pour espacer les diff�rents r�sultats
		System.out.println(" ");

		//Cr�ation nouveau client
		Client client1 = new Client("Laurent", "Robert", c2);
		//Infos client
		System.out.println("Voici le compte de Laurent Robert : ");
		//Solde du client
		client1.afficherSolde();

	}

}
