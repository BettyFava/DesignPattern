package designpattern;

public class PrototypeCanard extends Canard {

	@Override
	public void afficher() {
		System.out.println("Je suis seulement un prototype");
		
	}
	public PrototypeCanard(){
		comportementVol= new NePasVoler();
		comportementCancan = new Cancan();
	}
	

}
