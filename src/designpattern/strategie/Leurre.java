package designpattern.strategie;

public class Leurre {

	ComportementCancan comportementCancan;
	
	public void afficher(){
		System.out.println("Je suis un leurre");
		
	}
	
	public void effectuerCancan(){
		comportementCancan.cancaner();
	}
	
	public Leurre(){
		comportementCancan= new Cancan();
	}
}