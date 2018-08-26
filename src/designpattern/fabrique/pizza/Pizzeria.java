package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

public abstract class Pizzeria {
    
    public Pizza commanderPizza(String type){
        Pizza pizza;
        pizza = creerPizza(type);
        System.out.println("---- Fabrication de la pizza EN COURS ----");
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();
        System.out.println("---- Fabrication de la pizza TERMINEE ----");
        
        return pizza;
        
        
        
    }

    protected abstract Pizza creerPizza(String type);
}
