package exo1;

public class TestClient {
	public static void main(String[] args) {

		//On crée un nouvel objet "compteclient"
		Compte compteclient = new Compte (1);


		// creation objet c qui correspond au compte client
		Client c;
		c = new Client ("Bob", "Jean", compteclient);

		//On affiche un message pour obtenir le nom, le prenom et le solde du client
		System.out.println(c.getprenom() + " " + c.getnom()+ " à un solde de " + c.getSolde());


		//objet multicompte
		ClientMultiComptes multicompte = new ClientMultiComptes("Patrick", "Bruel", compteclient);
		//On affiche le nom et le prenom du propriétaire du multi compte bancaire
		System.out.println("Le propriétaire du multi compte est : " + multicompte.nom +" "+ multicompte.prenom);

	}

}
