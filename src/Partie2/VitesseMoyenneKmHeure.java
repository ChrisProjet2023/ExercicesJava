package Partie2;
//exo 8
//Supposons qu’un athlète parcourt 18 miles en 1 heure, 20 minutes, et 30 secondes.

//Écrivez un programme qui affiche la vitesse moyenne en kilomètres par heure.

//Notez que 1 mille = 1,6 kilomètre.

public class VitesseMoyenneKmHeure {
	
	
	static CalculVitesseMoyenne calculVitesseMoyenne = new CalculVitesseMoyenne();	
	
	
	public  static void main(String[] args) {
		
		
		System.out.println("Vitesse moyenne en kilomètre par heur "+CalculVitesseMoyenne.vitesseMoyenne());
		
		/*double parcoursKm = 18*1.6;
		double tempsSecond = 60*60+20*60+30;
		double tempsHeure = tempsSecond/3600;
		double v= parcoursKm/tempsHeure;
		
		System.out.println("Parcours km "+parcoursKm);
		System.out.println("Temps en heure parcouru "+tempsHeure);
		System.out.println("Vitesse moyenne en kilomètre par heur "+v);
		*/
		
	}

}
