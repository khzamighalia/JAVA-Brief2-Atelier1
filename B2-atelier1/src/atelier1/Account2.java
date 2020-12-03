package atelier1;

public class Account2 {

	public String nom;
	public String adresse;
	public Double solde;
	public Account2(String nom,String adresse,Double solde){
		 this.nom=nom;
		 this.adresse=adresse;
		 this.solde=solde;
	 }

	public void afficherInfosSolde() {
		System.out.println(this.nom+" habite à ("+this.adresse+") - infos solde "+this.solde+" DH");  
		
	}
	public void calculerInterer() {
		this.solde+=this.solde*0.07;
		
	}

}
