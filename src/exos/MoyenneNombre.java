package exos;

import java.util.Scanner;

//exo 7
// Écrivez un programme Java qui prend trois nombres en entrée 
// pour calculer et afficher la moyenne des nombres.

public class MoyenneNombre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nombre 1 : ");
		double nbre1 = sc.nextDouble();
		
		System.out.println("Entrer le nombre 2 : ");
		double nbre2 = sc.nextDouble();
		
		System.out.println("Entrer le nombre 3 : ");
		double nbre3 = sc.nextDouble();
		
		System.out.println("La moyenne des nombre : "+(nbre1+nbre2+nbre3/3));
		
		
	}

}
