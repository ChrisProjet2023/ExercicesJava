package exos;

import java.util.Scanner;

//exo 6
//Écrivez un programme Java pour afficher l’aire et le périmètre d’un cercle.
public class AirPerimetreCercle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le rayon du cercle: ");
		
		//double rayon = sc.nextInt();
		
		double rayon = sc.nextDouble();
		
		System.out.println("L'aire ou surface du cercle est égal à  "+rayon*rayon*Math.PI);
		
		//diamètre est = rayon*2
		//perimètre = diamètre*pi
		System.out.println("Le périmètre du cercle est égal à  "+rayon*2*Math.PI);

	}

}
