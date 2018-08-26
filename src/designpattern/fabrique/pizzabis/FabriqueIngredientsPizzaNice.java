package designpattern.fabrique.pizzabis;

public class FabriqueIngredientsPizzaNice implements FabriqueIngredientsPizza {

    public Pate creerPate() {
        System.out.println("Création de la pâte niçoise");
        return new PateFine();
    }

    public Sauce creerSauce() {
        System.out.println("Création de la sauce niçoise");
        return new SauceTomateMorceau();
    }

    public Fromage creerFromage() {
        System.out.println("Création du fromage niçois");
        return new Mozarella();
    }

    public Legumes[] creerLegumes() {
        System.out.println("Création des légumes niçois");
        Legumes[] legumes = {new Oignon(), new Champignon()};
        return legumes;
    }

    public Poivrons creerPoivrons() {
        System.out.println("Création des poivrons niçois");
        return new PoivronsMarines();
    }

}
