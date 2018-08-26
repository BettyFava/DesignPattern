package designpattern.fabrique.pizza;

import java.util.ArrayList;

public abstract class Pizza {
       String nom;
       String pate;
       String sauce;
       ArrayList garnitures = new ArrayList();
       
       
       void preparer(){
           System.out.println("Préparation de la pâte ...");
           System.out.println("Etalage de la pâte ....");
           System.out.println("Ajout de la sauce");
           System.out.println("Ajout des garnitures");
           for(int i = 0; i<garnitures.size(); i++){
               System.out.println(" " + garnitures.get(i));
           }
       }
       
       void cuire(){
           System.out.println("Cuisson de 25 min à 180°C");
           
       }
       
       void couper(){
           System.out.println("Découpage en 8");
       }
       
       void emballer(){
           System.out.println("Emballage dans une boite basique rectangulaire");
       }
    
       public String getNom(){
           return nom;
       }
}
