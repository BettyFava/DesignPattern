package designpattern.fabrique.pizzabis;

import designpattern.fabrique.pizzabis.*;
import designpattern.fabrique.pizzabis.Pizzeria;
import designpattern.fabrique.pizzabis.Pizza;

public class PizzeriaStrasbourg extends Pizzeria {

    protected Pizza creerPizza(String type) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabrique = new FabriqueIngredientsPizzaStrasbourg();
      if (type.equals("Fromage")){
          pizza = new PizzaFromage(fabrique);
          pizza.setNom("Fromage strasbourgeoise");
       }
       else if (type.equals("Vegetarienne")){
          pizza = new PizzaVegetarienne(fabrique);
          pizza.setNom("Végétarienne strasbourgeoise");
       }
        return pizza;
    }
    
    
}
