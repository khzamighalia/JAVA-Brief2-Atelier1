package atelier1;

public class TestChien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chien c1 = new Chien("Rex");
		Chien c2 = new Chien("Max");
		
		c1.Aboyer(" Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !!\r\n"
				+ "WWWWOARF !!  ");
		c1.Manger(" Je mange de la viande ");
		c2.Aboyer(" Je ne suis pas du tout en colère. Iwiw !! awaw !! - ");
		c2.Manger("Je\r\n"
				+ "mange du poisson");


	}

}
