package metier;

/**
 * Classe representant un manager
 * @author Jerome
 *
 */
public class Manager extends Employe {
	
	/**
	 * Constructeur par defaut
	 * @param nom 		Nom du manager
	 * @param prenom	Prenom du manager
	 * @param id		Identifiant du manager
	 */
	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}
	
	/**
	 * Constructeur prenant uniquement le nom et le prenom
	 * assigne l'identifiant 0
	 * @param nom 		Nom du manager
	 * @param prenom	Prenom du manager
	 */
	public Manager(String nom, String prenom) {
		this(nom, prenom, 0);
	}
	
	/**
	 * Constructeur prenant uniquement le nom
	 * assigne un prenom par defaut et
	 * l'identifiant 0
	 * @param nom Nom du manager
	 */
	public Manager(String nom) {
		this(nom, "Prenom par defaut", 0);
	}
	
	/**
	 * Constructeur qui donne un nom et prenom par defaut
	 * ainsi que l'identifiant 0
	 */
	public Manager() {
		this("Nom par defaut", "Prenom par defaut", 0);
	}
	
	@Override
	public void demanderFormation(String dateDebut, String dateFin) {
		super.demanderFormation(dateDebut, dateFin);
		System.out.println("Etant manager, il valide ses propres formations");
	}
	
	/**
	 * Methode permettant de valider une formation
	 */
	public void validerFormation() {
		System.out.println("Le manager " + super.getPrenom() + " " + super.getNom() + " valide la formation");
	}
	
	@Override
	public String toString() {
		return "Manager: " + this.getId() + ", "+ this.getNom() +", " + this.getPrenom();
	}
}
