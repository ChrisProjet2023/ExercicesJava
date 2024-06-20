package partie3;

import java.util.Scanner;

//exo 5
//Un nombre premier est un nombre naturel supérieur à 1 qui n’a pas de diviseurs positifs que 1 et lui même.

//Écrivez une méthode qui vérifie si un nombre est un nombre premier.

/*Concrètement, vous pouvez simplement diviser ce nombre par tous les entiers de 2
 *  jusqu'à sa racine carrée. Si aucun de ces entiers ne le divise sans reste,
 *   alors le nombre est premier.*/

public class NombrePremier {
	
	public static Boolean check(int n) {
		
		boolean nbrePremier = true;
		for (int i = n - 1; i > 1; i--) {
		       if (n % i == 0) {
		         nbrePremier = false;
		         break;
		       }
		     }
		
		return nbrePremier;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre: ");
		
		int nbre = sc.nextInt();
		
		System.out.println(check(nbre));
		
		
	}

}
