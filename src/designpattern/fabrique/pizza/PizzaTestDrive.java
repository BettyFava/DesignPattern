package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizzeria;
import designpattern.fabrique.pizza.Pizza;
import designpattern.fabrique.pizza.PizzeriaBrest;
import designpattern.fabrique.pizza.PizzeriaNice;

public class PizzaTestDrive {
    public static void main(String[] args){
        Pizzeria boutique1 = new PizzeriaBrest();
        Pizza pizza1 = boutique1.commanderPizza("Bolognaise");
        System.out.println("Une pizza " + pizza1.getNom() + " a été commandé par Tyrion");
        
        
        Pizzeria boutique2 = new PizzeriaNice();
        Pizza pizza2 = boutique2.commanderPizza("Napolitaine");
        System.out.println("Une pizza " + pizza2.getNom() + " a été commandé par Theon");
        
        
        Pizza pizza3 = boutique2.commanderPizza("Fromage");
        System.out.println("Une pizza " + pizza3.getNom() + " a été commandé par Cersei");
    } 
}
