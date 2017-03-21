/**
 * 
 */
package presentation;

import metier.Employe;
import metier.Manager;

/**
 * Classe Lanceur
 * @author Jerome
 *
 */
public class Lanceur {

	/**
	 * Methode main permettant de lancer le programme
	 * @param args arugments
	 */
	public static void main(String[] args) {
		Employe employe1;
		employe1 =  new Employe("Doe", "John", 1);

		
		Manager manager1;
		manager1 = new Manager("", "", 0);
		manager1.setId(2);
		manager1.setNom("Gosling");
		manager1.setPrenom("James");
		
		System.out.println(manager1);
		
		manager1.demanderFormation("2017-03-19", "2017-04-05");
		
		employe1.demanderFormation("2017-04-25", "2017-05-26");
		
		manager1.validerFormation();

	}

}
