package designpattern.fabrique.pizzabis;

public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza {

    public Pate creerPate() {
        System.out.println("Création de la pate strasbourgeoise");
        return new PateEpaisse();
    }

    public Sauce creerSauce() {
        System.out.println("Création de la sauce strasbourgeoise");
        return new SauceTomateOrigan();
    }

    public Fromage creerFromage() {
        System.out.println("Création du fromage strasbourgeoise");
        return new Chevre();
    }

    public Legumes[] creerLegumes() {
        System.out.println("Création des légumes strasbourgeois");
        Legumes[] legumes = {new Oignon(), new Champignon(), new Poireau()};
        return legumes;
    }

    public Poivrons creerPoivrons() {
         System.out.println("Création des poivrons strasbourgeois");
        return new PoivronsJaunes();
    }

}
