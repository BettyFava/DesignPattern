package designpattern.observateur;

public class MiniSimulateur {
	
	public static void main(String[] args){
		DonneesMeteo donneesMeteo = new DonneesMeteo();
		
		AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);
		AffichagePrevisions affichagePrevisions = new AffichagePrevisions(donneesMeteo);
		donneesMeteo.setMesures(12, 55, 88);
		donneesMeteo.setMesures(778, 44, 85);
	}

}
