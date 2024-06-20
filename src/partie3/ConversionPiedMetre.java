package partie3;

import java.util.Scanner;

//partie 3
//exo 3
//Écrivez un programme qui lit un nombre en Pieds, le convertit en Mètres et affiche le résultat. 
//Un Pied mesure 0,305 mètre.

public class ConversionPiedMetre {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez la valeur en Pied: ");
		
		double p = sc.nextDouble();
		
		System.out.println(p+" Pied : "+p*0.305+" mètre");
		
		
		

	}

}
