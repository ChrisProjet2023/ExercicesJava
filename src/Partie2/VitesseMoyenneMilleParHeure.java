package Partie2;
//exo 7
//Supposons qu’un athlète parcourt 15 kilomètres en 50 minutes et 10 secondes.

//Écrivez un programme qui affiche la vitesse moyenne en miles par heure.
//Notez que 1 miles = 1,6 kilomètre.
//Vitesse moyenne = nombre de kilomètres / temps en heures
public class VitesseMoyenneMilleParHeure {

	public static void main(String[] args) {
		
		
	
		
		ConvertHeureToSecond convertHeureToSecond = new ConvertHeureToSecond();
		ConvertMilleEnKm convertMilleEnKm = new ConvertMilleEnKm();	
		
		int heureSec = 3600;
		int tempsSecond = convertHeureToSecond.convertHToSec(0, 50, 10);
		//int h = convertHeureToSecond.convertHToSec(1, 20, 30);
		
		//double v = convertKmEnMille.convertKmEnMille(18)/h*heureSec;
		
		
		//double tempsHeure = (double)tempsSecond/heureSec;
		
		
		double v = (double)convertMilleEnKm.convertMilleEnKm(15)/tempsSecond;
		
		System.out.println("La vitesse moyenne en miles par heure : "+v);
		
		System.out.println("La mille en km : "+convertMilleEnKm.convertMilleEnKm(15));
		System.out.println("Le temps en second : "+tempsSecond);
	//	System.out.println("Le temps en heure : "+tempsHeure);

	}

}
