package Partie2;

public class CalculVitesseMoyenne {
	
	//instancier
	
	static ConvertHeureToSecond convertHeureToSecond = new ConvertHeureToSecond();
	
	static ConvertKmEnMille convertKmEnMille = new ConvertKmEnMille();
	
	public static Double vitesseMoyenne() {
		
		int heureSec = 3600;
		
		int h = convertHeureToSecond.convertHToSec(1, 20, 30);
		double v = convertKmEnMille.convertKmEnMille(18)/h*heureSec;
		
		return v;
		
	}

}
