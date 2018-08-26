package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.PizzaNapolitaineStyleBrest;
import designpattern.fabrique.pizza.PizzaBolognaiseStyleBrest;
import designpattern.fabrique.pizza.PizzaFromageStyleBrest;
import designpattern.fabrique.pizza.Pizzeria;
import designpattern.fabrique.pizza.Pizza;

public class PizzeriaBrest extends Pizzeria {

    protected Pizza creerPizza(String type) {
       if (type.equals("Bolognaise")){
          return new PizzaBolognaiseStyleBrest();
       }
       else if (type.equals("Fromage")){
          return new PizzaFromageStyleBrest();
       }
       else if (type.equals("Napolitaine")){
          return new PizzaNapolitaineStyleBrest();
       }
       else {
           return null;
       }
    }
    
    
}
