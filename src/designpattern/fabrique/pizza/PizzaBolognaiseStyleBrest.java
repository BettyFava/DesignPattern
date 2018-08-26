/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.fabrique.pizza;

import designpattern.fabrique.pizza.Pizza;

/**
 *
 * @author betty
 */
public class PizzaBolognaiseStyleBrest extends Pizza  {
     public PizzaBolognaiseStyleBrest(){
         nom = "Pizza sauce bolognaise bretonne";
         pate = "Pâte épaisse";
         sauce = "Sauce Bolognaise";
         garnitures.add("Mozarella");
         garnitures.add("Viande hachée origine charolaise");
         garnitures.add("Champignon de Paris");
     }
     
    void couper() {
        System.out.println("Couper en 4");
    }
}
