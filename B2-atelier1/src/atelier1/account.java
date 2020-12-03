package atelier1;

public class account {
 
	public String nom;
	public String adresse;
	public Double solde;
	public account(String nom,String adresse,Double solde){
		 this.nom=nom;
		 this.adresse=adresse;
		 this.solde=solde;
	 }
	public String toString() {
		return this.nom+" habite à ("+this.adresse+") - infos solde "+this.solde+" DH";  
		
	}
	
}
