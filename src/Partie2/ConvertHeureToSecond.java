package Partie2;

public class ConvertHeureToSecond {
	
	public  int convertHToSec(int h, int m, int s) {
		int heure = h*60 ;
		int min = heure+m;
		int sec = min*60+s;
		return sec;
	}

}
