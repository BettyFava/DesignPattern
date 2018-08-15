package designpattern.observateur;

import java.util.Observable;
import java.util.Observer;

public class AffichageConditions implements Affichage, Observer {

	
	private float temperature;
	private float humidite;
	private float pression;
	Observable observable;
	
	public AffichageConditions(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg){
		if (obs instanceof DonneesMeteo){
			DonneesMeteo donneesMeteo = (DonneesMeteo)obs;
			this.temperature = donneesMeteo.getTemperature();
			this.humidite = donneesMeteo.getHumidite();
			afficher();
		}
	}

	@Override
	public void afficher() {
		System.out.println("Conditions actuelle = " + this.temperature + " degrés celsius et un taux d'humidité de "
				+this.humidite + " %");
		
	}


}
