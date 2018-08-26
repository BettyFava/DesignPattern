package designpattern.fabrique.pizzabis;

public class PizzeriaNice extends Pizzeria {

    protected Pizza creerPizza(String type) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabrique = new FabriqueIngredientsPizzaNice();
       if (type.equals("Fromage")){
          pizza= new PizzaFromage(fabrique);
          pizza.setNom("Fromage niçoise");
       }
       else if (type.equals("Vegetarienne")){
          pizza= new PizzaVegetarienne(fabrique);
          pizza.setNom("Végatarienne niçoise");
       }
       
       return pizza;
    }
    
    
}
