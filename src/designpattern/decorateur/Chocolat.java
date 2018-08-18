package designpattern.decorateur;

public class Chocolat extends Boisson {

	
	Boisson boisson;
	public Chocolat(Boisson boisson) {
		this.boisson = boisson;
	}
	
	public String getDescription() {
		return boisson.getDescription() + ", Chocolat";
	}
	@Override
	public double cout() {
		return 0.20 + boisson.cout();
	}

}
