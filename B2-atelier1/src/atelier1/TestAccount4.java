package atelier1;

public class TestAccount4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account4 c1 = new Account4();
		c1.setNom("El Alami Hassan");
		c1.setAdresse("Safi");
		c1.setSolde(14765.8);
		c1.afficherInfosSolde();
		c1.calculerInterer();
		c1.afficherInfosSolde();
		c1.retirer(100.0);
		c1.afficherInfosSolde();

	}

}
