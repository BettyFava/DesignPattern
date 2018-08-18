package designpattern.decorateur;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Boisson boisson = new Expresso();
		System.out.println(boisson.getDescription() +
				"à " + boisson.cout() + " €");
		
		Boisson boisson2 = new Sumatra();
		boisson2 = new Chocolat(boisson2);
		boisson2 = new Chocolat(boisson2);
		boisson2 = new Chantilly(boisson2);
		
		System.out.println(boisson2.getDescription() +
				"à " + boisson2.cout() + " €");
		
		
		Boisson boisson3 = new Sumatra();
		boisson3 = new Chocolat(boisson2);
		boisson3 = new Caramel(boisson2);
		boisson3 = new Chantilly(boisson2);
		
		System.out.println(boisson3.getDescription() +
				"à " + boisson3.cout() + " €");
		
		
	}

}
