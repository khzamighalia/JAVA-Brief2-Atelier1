package atelier1;

public class TestDiplome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diplome d1 = new Diplome();
		System.out.println(" Les caract�ristiques du dipl�me : ");
		System.out.println(" Titre : "+d1.getTitre());
		System.out.println(" Mention : "+d1.getMention());
		System.out.println(" Ann�e obtenu : "+d1.getAnobtenu());
		d1.setTitre("DEUG");
		d1.setMention("BIEN");
		d1.setAnobtenu(2010);
		System.out.println(" Les caract�ristiques du dipl�me : ");
		System.out.println(" Titre : "+d1.getTitre());
		System.out.println(" Mention : "+d1.getMention());
		System.out.println(" Ann�e obtenu : "+d1.getAnobtenu());

	}

}
