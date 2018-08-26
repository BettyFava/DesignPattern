package designpattern.fabrique.pizzabis;

public interface FabriqueIngredientsPizza {
    
    public Pate creerPate();
    public Sauce creerSauce();
    public Fromage creerFromage();
    public Legumes[] creerLegumes();
    public Poivrons creerPoivrons();
}
