package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

public class PizzaBolognaiseStyleNice extends Pizza  {
     public PizzaBolognaiseStyleNice(){
         nom = "Pizza Bolognaise sauce à la niçoise";
         pate = "Pâte fine";
         sauce = "Sauce Bolognaise";
         garnitures.add("Parmesan rapée");
         garnitures.add("Tomates séchées");
         garnitures.add("Champignons");
    }
     
    void cuire() {
        System.out.println("Cuisson au feu de bois");
    }
}
