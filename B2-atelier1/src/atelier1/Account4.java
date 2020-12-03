package atelier1;

public class Account4 {

	private String nom;
	private String adresse;
	private Double solde;
	public Account4(){
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
		if(!nom.equals(""))
	    this.nom = nom;
	  }
	  public void setAdresse(String adresse) {
		  if(!adresse.equals(""))
		    this.adresse = adresse;
		  }
	  public void setSolde(Double solde) {
		    if(solde>=100)
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
	public void retirer(Double r) {
		Double s=this.getSolde();
		if(r<=s)
		{s-=r;
		setSolde(s);
		}
		else 
			System.out.println(" Solde insuffisant ");
		
	}

}
