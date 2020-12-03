package atelier1;

public class Account3 {

	private String nom;
	private String adresse;
	private Double solde;
	public Account3(){
	 }
	 // Getters
	  public String getNom() {
	    return this.nom;
	  }
	  public String getAdresse() {
		    return this.adresse;
		  }
	  public Double getSolde() {
		    return this.solde;
		  }

	  // Setters
	  public void setNom(String nom) {
	    this.nom = nom;
	  }
	  public void setAdresse(String adresse) {
		    this.adresse = adresse;
		  }
	  public void setSolde(Double solde) {
		    this.solde = solde;
		  }

	public void afficherInfosSolde() {
		System.out.println(this.getNom()+" habite à ("+this.getAdresse()+") - infos solde "+this.getSolde()+" DH");  
		
	}
	public void calculerInterer() {
		Double s=this.getSolde();
		s+=s*0.07;
		setSolde(s);
		
	}
}
