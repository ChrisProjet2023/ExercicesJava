package Partie2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//exo 6 
// Écrivez un programme Java pour afficher l’heure et la date actuelle dans un format spécifique.
/**SimpleDateFormat est une classe concrète pour le formatage et l’analyse des dates d’une 
manière sensible aux paramètres régionaux.
La méthode getInstance() de la classe Calendar est utilisée pour obtenir un calendrier en 
utilisant le fuseau horaire et les paramètres régionaux actuels du système.**/



public class HeureActuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    SimpleDateFormat h = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    h.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
	    System.out.println("L'heure actuelle: "+h.format(System.currentTimeMillis()));
		
		
	}

}
