package designpattern;

public class Colver extends Canard {

	@Override
	public void afficher() {
		System.out.println("Je suis un colvert");

	}
	
	public Colver(){
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

}
