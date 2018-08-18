package designpattern.decorateur;

public abstract class Boisson {
	
	String description = "Boisson inconnue";
	
	public String getDescription() {
		return description;
	}
	public abstract double cout();

}


