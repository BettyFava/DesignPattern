package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

public class PizzaNapolitaineStyleNice extends Pizza  {
     public PizzaNapolitaineStyleNice(){
        nom = "Pizza napolitaine niçoise";
        pate = "Pâte normal";
        sauce = "Sauce Tomate";
        garnitures.add("Gruyère rapée");
        garnitures.add("Champignon");
        garnitures.add("Jambon blanc");
     }

    void cuire() {
        System.out.println("Cuisson au feu de bois");
    }
     
     
}
