package partie3;

import java.util.Scanner;

//partie 3
//exo 2
//Écrivez un programme qui lit le rayon et la hauteur d’un cylindre et calcule l’aire et le volume à l’aide des formules suivantes:

//aire = rayon * rayon * pi
//volume = aire * hauteur

public class VolumeCylindre {
	
	

	public static void main(String[] args) {
		
		Aire aire = new Aire();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le rayon : ");
		double rayon = sc.nextDouble();
		
		System.out.println("Entrez la hauteur:  ");
		double h = sc.nextDouble();
		
		System.out.println("L'aire du cylindre : "+aire.aireCyclindre(rayon));
		
		System.out.println("Volume du cylindre : "+aire.aireCyclindre(rayon)*h);
		
		
		
		

	}

}
