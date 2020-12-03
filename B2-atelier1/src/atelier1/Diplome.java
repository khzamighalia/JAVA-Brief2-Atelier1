package atelier1;

public class Diplome {

	private String titre;
	private String mention;
	private int anobtenu;
	public Diplome(String titre,String mention,int anobtenu){
		this.titre=titre;
		this.mention=mention;
		this.anobtenu=anobtenu;
	} 
	

	public Diplome(){
		this.titre=" Diplome universitaire de technologie";
		this.mention=" Assez bien";
		this.anobtenu=2017;
	} 
	 // Getters
	  public String getTitre() {
	    return this.titre;
	  }
	  public String getMention() {
		    return this.mention;
		  }
	  public int getAnobtenu() {
		    return this.anobtenu;
		  }

	  // Setters
	  public void setTitre(String titre) {
		if(!titre.equals(""))
	    this.titre = titre;
	  }
	  public void setMention(String mention) {
		  if(!mention.equals(""))
		    this.mention = mention;
		  }
	  public void setAnobtenu(int anobtenu) {
		  if(anobtenu >=1980)
		  		    this.anobtenu = anobtenu;
		  }

}
