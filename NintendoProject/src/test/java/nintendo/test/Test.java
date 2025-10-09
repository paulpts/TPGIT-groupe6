package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		
		Console switch1 = new Hybride("Switch");
		Console ps5 = new Salon("PS5");
		Console mobile = new Portable("Mobile");
		Console switch2 = new Hybride("Switch 2");
		Console n2ds = new Portable("2DS");
		
		
		Jeu jeu1 = new Jeu("Pokemon SoulSilver",n2ds);
		Jeu jeu2= new Jeu("The Legend of Zelda: BoW",switch1);
		Jeu jeu3 = new Jeu("Horizon Forbidden West",ps5);
		Jeu jeu4 = new Jeu("Clash Royale",mobile);
		Jeu jeu5 = new Jeu("MarioKart World",switch2);
		
		Adresse adresseBoutique = new Adresse("rue de Paris", "Lille", 50);
		Boutique boutique = new Boutique("Micromania", adresseBoutique);
		
		Client client1 = new Client("Plichon", "Mattéo");
		Client client2 = new Client("Pontois", "Paul");

	}

}
