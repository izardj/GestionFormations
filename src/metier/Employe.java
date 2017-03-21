/**
 * 
 */
package metier;

/**
 * Classe representant un employe
 * @author Jerome
 *
 */
public class Employe {
	private String nom;
	private String prenom;
	private int id;
	
	/**
	 * Constructeur de la classe Employe
	 * @param nom 		Nom de l'employe
	 * @param prenom 	Prenom de l'employe
	 * @param id		Identifiant de l'employe
	 */
	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	/**
	 * Demande une formation en donnant ses dates de debut et de fin
	 * @param dateDebut Date de debut de la formation
	 * @param dateFin	date de fin de la formation
	 */
	public void demanderFormation(String dateDebut, String dateFin) {
		System.out.println(prenom + " " + nom + " pose une formation du " + dateDebut + " au " + dateFin );
	}
	
	@Override
	public String toString() {
		return "Employe: " + id + ", "+ prenom +", " + nom;
	}
	
	// Setters and Getters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
