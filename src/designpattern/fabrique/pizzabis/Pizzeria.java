/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.fabrique.pizzabis;

/**
 *
 * @author betty
 */
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
