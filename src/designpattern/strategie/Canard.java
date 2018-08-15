package designpattern.strategie;

public abstract class Canard {
	
	ComportementVol comportementVol;
	ComportementCancan comportementCancan;
	public Canard() {
		super();
	}
	
	public abstract void afficher();
	
	public void effectuerVol(){
		comportementVol.voler();
	}
	
	public void effectuerCancan(){
		comportementCancan.cancaner();
	}
	
	public void nager(){
		System.out.println("Tous les canards flottent donc hop, comportement de base géré dans la classe Canard");
	}

	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}

	public void setComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
	
	
	
	

}
