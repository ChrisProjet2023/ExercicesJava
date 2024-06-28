package partie3;

import java.util.Scanner;

//exo 9
/*
Exercice 9: Additionnez les chiffres d’un nombre
Écrivez un programme qui lit un entier entre 0 et 1000 et calcul la somme de tous les chiffres. 
Par exemple, le nombre 122, la somme de tous ses chiffres est 5.

Astuce: utilisez l’opérateur % pour extraire les chiffres et utilisez l’opérateur / pour supprimer 
le chiffre extrait. Par exemple, 122 % 10 = 2 et 122/10 = 12.
 modulo = reste de la division
 */
public class AdditionnerChiffreNombre {
	
	public static boolean verif(int c) {
		
		if (c==0) {
			return false;
		}else {
			if(c>0 && c<1000) {
				return true;
			}
		}
		
		return false;
	}

	public static int additionneChiffre(int c) {
		
		int k = c % 10;
		int u = c/10;
		int j=0;
		
		u+=k;
		
		for(int i=0; i<=u;i++) {
			j+=i;
		}
		
		
		return j;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le chiffre : ");
		int c = sc.nextInt();
		
		if (verif(c)==true) {
			
			System.out.println("La somme de "+c+" est "+additionneChiffre(c));
		}
		
		
		
		

	}

}
