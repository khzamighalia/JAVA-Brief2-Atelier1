package atelier1;

public class Chien {
	
	public String nom;
	public Chien(String nom) {
		this.nom=nom;
	}
	
	public void Aboyer(String phrase) {
		System.out.println(this.nom+" : "+phrase);
	}
	public void Manger(String phrase) {
		System.out.println(this.nom+" : "+phrase);
	}
	

}
