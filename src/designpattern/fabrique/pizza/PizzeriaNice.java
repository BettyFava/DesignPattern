package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.PizzaFromageStyleNice;
import designpattern.fabrique.pizza.PizzaBolognaiseStyleNice;
import designpattern.fabrique.pizza.PizzaNapolitaineStyleNice;
import designpattern.fabrique.pizza.Pizzeria;
import designpattern.fabrique.pizza.Pizza;

public class PizzeriaNice extends Pizzeria {

    protected Pizza creerPizza(String type) {
       if (type.equals("Bolognaise")){
          return new PizzaBolognaiseStyleNice();
       }
       else if (type.equals("Fromage")){
          return new PizzaFromageStyleNice();
       }
       else if (type.equals("Napolitaine")){
          return new PizzaNapolitaineStyleNice();
       }
       else {
           return null;
       }
    }
    
    
}
