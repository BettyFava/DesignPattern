package designpattern.observateur;

import java.util.Observable;
import java.util.Observer;

public class AffichagePrevisions implements Observer, Affichage {

	private float pressionActuelle = 1011;
	private float dernierePression;
	Observable observable;
	
	
	public AffichagePrevisions(Observable o) {
		this.observable = o;
		observable.addObserver(this);
	}
	@Override
	public void afficher() {
		System.out.println("La pression sera de " + this.pressionActuelle + " (derniere pression = " + this.dernierePression);

	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof DonneesMeteo){
			DonneesMeteo donneesMeteo = (DonneesMeteo)o;
			this.dernierePression = donneesMeteo.getPression();
			afficher();
		}
	}

}
