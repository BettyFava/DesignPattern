package designpattern.decorateur;

public class Chantilly extends Boisson {

	
	Boisson boisson;
	public Chantilly(Boisson boisson) {
		this.boisson = boisson;
	}
	
	public String getDescription() {
		return boisson.getDescription() + ", Chantilly";
	}
	@Override
	public double cout() {
		return 0.30 + boisson.cout();
	}

}
