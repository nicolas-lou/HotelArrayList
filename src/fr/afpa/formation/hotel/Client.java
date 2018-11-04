package fr.afpa.formation.hotel;
import java.util.Scanner;

/**
 * <b>Client est la classe qui représente un client et ses fonctionnalités.</b>
 * <p>
 * Un client est caractérisé par les attributs suivants :
 * <ul>
 * <li>L'idnice de la chambre qu'il occupe.</li>
 * <li>Son prénom</li>
 * <li>Son prénom</li>
 * <li>Son age </li>
 * <li>Son adresse, un objet de type Adresse</li>
 * </ul> 
 * </p>
 * 
 * @see Adresse
 * 
 * @author Nicolas L
 * @version 2.0
 */
public class Client {

	private int indiceRoom;
	private String prenom ;
	private String nom ;
	private int age;
	private Adresse adresse ;





	public Client() {
		super();
		this.indiceRoom=0; 
		this.prenom ="";
		this.nom = "";
		this.age = 0;
		this.adresse = new Adresse();
	}

	public int getRoom() {
		return indiceRoom;
	}

	public void setRoom(int indiceRoom) {
		this.indiceRoom = indiceRoom;
	}


	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [indiceRoom=" + indiceRoom + ", prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", adresse=" + adresse
				+ "]";
	}

	// fin setters getters 

	/**
	 * Fonction qui enregistre les informations du client qui ocucpe la chambre
	 * @param nbChambre ld numéro de la chambre*/
	public void enregistrerClient(int nbChambre) {		
		System.out.println("Entrez le Prenom du client: ");		
		this.prenom = verifEntreeClavier();
		adresse.enregistrer();
		this.indiceRoom = nbChambre;		
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
