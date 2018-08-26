/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.fabrique.pizzabis;

import java.util.ArrayList;

/**
 *
 * @author betty
 */
public abstract class Pizza {
       String nom;
       Pate pate;
       Sauce sauce;
       Legumes[] legumes;
       Poivrons poivrons;
       Fromage fromage;
       
       
       abstract void preparer();
//       {
//           System.out.println("Préparation de la pâte ...");
//           System.out.println("Etalage de la pâte ....");
//           System.out.println("Ajout de la sauce");
//           System.out.println("Ajout des garnitures");
//           for(int i = 0; i<garnitures.size(); i++){
//               System.out.println(" " + garnitures.get(i));
//           }
//       }
       
       void cuire(){
           System.out.println("Cuisson de 25 min à 180°C");
           
       }
       
       void couper(){
           System.out.println("Découpage en 8");
       }
       
       void emballer(){
           System.out.println("Emballage dans une boite basique rectangulaire officielle");
       }
    
       public String getNom(){
           return nom;
       }

    public void setNom(String nom) {
        this.nom = nom;
    }
       
       

    @Override
    public String toString() {
        return "Pizza{" + "nom=" + nom + ", pate=" + pate + ", sauce=" + sauce + ", legumes=" + legumes + ", poivrons=" + poivrons + ", fromage=" + fromage + '}';
    }

   
       
}
