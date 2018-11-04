package fr.afpa.formation.hotel;
/**
 * <b>Chambre est la classe qui représente une chambre et ses fonctionnalités.</b>
 * <p>
 * Une chambre est caractérisée par les attributs suivants :
 * <ul>
 * <li>Une surface.</li>
 * <li>Un prix</li>
 * <li>Un etat occupée ou non </li>
 * <li>Un occupant, une objet de la class Client</li> * 
 * </ul>
 * </p>
 * <p> 
 * @see surface
 * @see prix
 * @see occupation
 * @see occupant
 * 
 * 
 * @author Nicolas L
 * @version 3.0
 */
public class Chambre {

	private int surface;
	private double prix;
	private boolean occupation;
	private Client occupant;	

	public Chambre() {
		super();
		this.surface = 20;
		this.prix = 49.99;
		this.occupation = false;
		this.occupant = new Client();
	}

	public void libererChambre() {
		this.occupation = false;
		this.occupant = new Client();
	}
	// getter et setter
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public boolean getOccupation() {
		return occupation;
	}
	public void setOccupation(boolean occupation) {
		this.occupation = occupation;
	}
	public Client getOccupant() {
		return occupant;
	}
	public void setOccupant(Client occupant) {
		this.occupant = occupant;
	}
	// fin getter et setter
	@Override
	public String toString() {
		return "Chambre [surface=" + surface + ", prix=" + prix + ", occupation=" + occupation + ", occupant="
				+ occupant + "]";
	}











}
