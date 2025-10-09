package nintendo.test;

import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
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
		
		List<Achat> achats = new ArrayList();
		
		Adresse adresseBoutique = new Adresse("rue de Paris", "Lille", 50);
		Boutique boutique = new Boutique("Micromania", adresseBoutique);
		
		Jeu jeu1 = new Jeu("Pokemon SoulSilver",n2ds,boutique);
		Jeu jeu2= new Jeu("The Legend of Zelda: BoW",switch1,boutique);
		Jeu jeu3 = new Jeu("Horizon Forbidden West",ps5,boutique);
		Jeu jeu4 = new Jeu("Clash Royale",mobile,boutique);
		Jeu jeu5 = new Jeu("MarioKart World",switch2,boutique);
		
		
		Client client1 = new Client("Plichon", "Mattéo",achats);
		Client client2 = new Client("Pontois", "Paul",achats);

	}

}
