package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

public class PizzaFromageStyleBrest extends Pizza  {
     public PizzaFromageStyleBrest(){
         nom = "Pizza fromagère bretonne";
         pate = "Pâte épaisse";
         sauce = "Sauce 5 fromages";
         garnitures.add("Parmesan rapée");
         garnitures.add("Mozarella rapée");
         garnitures.add("Reblochon");
     }

    void couper() {
        System.out.println("Couper en 4");
    }
     
     
     
}
