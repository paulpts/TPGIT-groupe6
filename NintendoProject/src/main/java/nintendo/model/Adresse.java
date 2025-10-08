package nintendo.model;

public class Adresse {

	private String rue;
	private String ville;
	private int numero;
	
	public Adresse(String rue, String ville, int numero) {
		this.rue = rue;
		this.ville = ville;
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", numero=" + numero + "]";
	}
	
	
	
}
