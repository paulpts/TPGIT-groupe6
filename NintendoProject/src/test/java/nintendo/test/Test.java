package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console switch1 = new Console("Switch");
		Console ps5 = new Console("PS5");
		Console mobile = new Console("Mobile");
		Console switch2 = new Console("Switch 2");
		Console n2ds = new Console("2DS");
		
		
		Jeu jeu1 = new Jeu("Pokemon SoulSilver",n2ds);
		Jeu jeu2= new Jeu("The Legend of Zelda: BoW",switch1);
		Jeu jeu3 = new Jeu("Horizon Forbidden West",ps5);
		Jeu jeu4 = new Jeu("Clash Royale",mobile);
		Jeu jeu5 = new Jeu("MarioKart World",switch2);
		

	}

}
