package designpattern;

public class MiniSimulateur {

	public static void main(String[] args) {
	Canard colver = new Colver();
	colver.afficher();
	colver.effectuerCancan();
	colver.effectuerVol();
	
	
	Canard prototypeCanard = new PrototypeCanard();
	prototypeCanard.afficher();
	prototypeCanard.effectuerCancan();
	prototypeCanard.effectuerVol();
	prototypeCanard.setComportementVol(new PropulsionAReaction());
	prototypeCanard.effectuerVol();
	
	
	Leurre leurre = new Leurre();

	}

	
	
}
