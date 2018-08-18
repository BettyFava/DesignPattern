package designpattern.decorateur;

public class Caramel extends Boisson {

	
	Boisson boisson;
	public Caramel(Boisson boisson) {
		this.boisson = boisson;
	}
	
	public String getDescription() {
		return boisson.getDescription() + ", Caramel";
	}
	@Override
	public double cout() {
		return 2.30 + boisson.cout();
	}

}
