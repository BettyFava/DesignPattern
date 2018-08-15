package designpattern.observateur;

import java.util.ArrayList;
import java.util.Observable;

public class DonneesMeteo extends Observable {

	
	private ArrayList<Observateur> observateurs;
	private float temperature;
	private float humidite;
	private float pression;
	
	public DonneesMeteo(){
	}

	public void actualiserMesures(){
		setChanged();
		notifyObservers();
	}
	
	public void setMesures(float temperature, float humidite, float pression){
		this.temperature=temperature;
		this.humidite=humidite;
		this.pression=pression;
		actualiserMesures();
		}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidite() {
		return humidite;
	}

	public float getPression() {
		return pression;
	}

	
}
