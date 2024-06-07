package Partie2;

import java.util.Scanner;

//exo1
//Écrivez une méthode qui inverse une chaîne.
public class InverseChaine {
	
	public static String inverseC(String chain) {
		
		String chaineInverse = "";
		
		if(chain==null) {
			return chain;
		}else {
			for(int i = chain.length()-1; i>=0; i--) {
				chaineInverse = chaineInverse+chain.charAt(i);
			}
			return chaineInverse;
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez la chaine: ");
		String chaine = sc.next();
		
		System.out.println("La chaine inversée de : "+chaine+" est "+inverseC(chaine));
		
		

	}

}
