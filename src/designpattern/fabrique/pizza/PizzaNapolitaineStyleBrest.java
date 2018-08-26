package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

public class PizzaNapolitaineStyleBrest extends Pizza  {
     public PizzaNapolitaineStyleBrest(){
         nom = "Pizza napolitaine bretonne";
         pate = "Pâte normal";
         sauce = "Sauce Tomate";
         garnitures.add("Gruyère rapée");
         garnitures.add("Champignon");
         garnitures.add("Jambon braisé");
     }

    void couper() {
        System.out.println("Couper en 4");
    }
}
