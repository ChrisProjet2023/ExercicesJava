package exos;

import java.util.Scanner;

//exo 9
// Écrivez une méthode qui calcule la factorielle d’un nombre donné.

//Le factoriel est le produit de tous les entiers positifs inférieurs ou égaux à n.

public class Factorielle {
	
	public static int factorielle(int n) {
		
		int f= n;
		for(int i=n-1 ;i>0;i--) {
			f=f*i;
		}
		
		return f;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez le nombre : ");
		int n = sc.nextInt();
		int f = factorielle(n);
		
		System.out.println("Factorielle de "+n+" égal à "+f);
		

	}

}
