package metier;

import java.time.LocalDateTime;

/**
 * Classe representant une demande de formation
 * @author Jerome
 *
 */
public class DemandeFormation {
	private String dateDemande;
	private String dateDebut;
	private String dateFin;
	private String etatValidation;
	
	public final static String REFUS = "refus";
	public final static String ACCORDE = "valide";
	public final static String ATTENTE = "en attente";
	
	/**
	 * Constructeur de la classe DemandeFormation
	 * @param dateDebut 		Date de debut de la formation
	 * @param dateFin			Date de fin de la formation
	 * @param etatValidation	Etat de la demande de formation
	 */
	public DemandeFormation(String dateDebut, String dateFin, String etatValidation) {
		this.dateDebut = dateDebut;
		this.dateFin = dateDebut;
		this.etatValidation = etatValidation;
		this.dateDemande = LocalDateTime.now().toString();
	}
	
	/**
	 * Constructeur de la classe DemandeFormation avec status "en attente"
	 * @param dateDebut 		Date de debut de la formation
	 * @param dateFin			Date de fin de la formation
	 */
	public DemandeFormation(String dateDebut, String dateFin) {
		this(dateDebut, dateFin, DemandeFormation.ATTENTE);
	}

	@Override
	public String toString() {
		return "DemandeFormation [dateDemande=" + dateDemande + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", etatValidation=" + etatValidation + "]";
	}
	
	// Getters et Setters
	public String getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getEtatValidation() {
		return etatValidation;
	}
	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}
}
