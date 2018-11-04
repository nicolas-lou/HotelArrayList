package fr.afpa.formation.hotel;
import java.util.Scanner;
/**
 * <b>Adresse est la classe qui représente une adresse (de client ou d'hotel) et ses fonctionnalités.</b>
 * 
 * @see Client
 * 
 * @author Nicolas L
 * @version 4.0
 */
public class Adresse {

	private int numRue;
	private String nomRue;
	private String ville;
	private String pays;
	private int zip;

	// constructeurs 
	public Adresse() {
		super();			
		this.numRue = 0;
		this.nomRue = "";		
		this.ville = "";		
		this.pays = "";
		this.zip = 00000;
	}



	// setters et getters 
	public int getNumRue() {
		return numRue;
	}	

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	// fin setters et getters



	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", nomRue=" + nomRue + ", ville=" + ville + ", pays=" + pays + ", zip="
				+ zip + "]";
	}

	/**
	 * Fonction qui permet de remplir les valeurs de certains attributs de l'adresse*/
	public void enregistrer() {		
		System.out.println("veuillez entrer la ville de residence ");
		this.ville = verifEntreeClavier();
	}

	public String verifEntreeClavier() {
		String temp="";
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		temp = in.nextLine();
		do {
			if(!temp.matches("[a-zA-Z]+")){
				System.out.println("Entrée invalide. Verifier la casse de votre entrée et recommencez: ");
				temp = in.nextLine();
			}
		}while(!temp.matches("[a-zA-Z]+"));		
		return temp;		
	}	
}
