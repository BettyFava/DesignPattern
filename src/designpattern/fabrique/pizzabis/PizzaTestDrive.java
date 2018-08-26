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
public class PizzaTestDrive {
    public static void main(String[] args){
        Pizzeria boutique1 = new PizzeriaStrasbourg();
        Pizza pizza1 = boutique1.commanderPizza("Vegetarienne");
        System.out.println("Une pizza " + pizza1.getNom() + " a été commandé par Tyrion");
        
        
        Pizzeria boutique2 = new PizzeriaNice();
        Pizza pizza2 = boutique2.commanderPizza("Fromage");
        System.out.println("Une pizza " + pizza2.getNom() + " a été commandé par Theon");
        
        
        Pizza pizza3 = boutique2.commanderPizza("Fromage");
        System.out.println("Une pizza " + pizza3.getNom() + " a été commandé par Cersei");
   
        Pizza pizza4 = boutique1.commanderPizza("Vegetarienne");
        System.out.println("Une pizza " + pizza4.getNom() + " a été commandé par un personnage non identifié");  
    } 
}
