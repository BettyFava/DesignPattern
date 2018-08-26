package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

public class PizzaFromageStyleNice extends Pizza  {
     public PizzaFromageStyleNice(){
         nom = "Pizza fromagère niçoise";
         pate = "Pâte fine";
         sauce = "Sauce fromage italien";
         garnitures.add("Parmesan rapée");
         garnitures.add("Mozarella di Buffala");
         garnitures.add("Origan");
     }
     
     void cuire() {
        System.out.println("Cuisson au feu de bois");
    }
}
