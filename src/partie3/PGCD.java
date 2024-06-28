package partie3;

import java.util.Scanner;

//exo 8
//Le PGCD ou le Plus Grand Commun Diviseur de deux entiers est le plus grand 
//entier pouvant diviser exactement deux nombres (sans reste).

public class PGCD {
	
	public static int pgcd(int n, int m) {
			
		if (m == 0) {
		   return n;
		 }
		return pgcd(m, n % m);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le 1er nombre : ");
		int p = sc.nextInt();
		
		System.out.print("Entrez le 2e nombre : ");
		int q = sc.nextInt();
		
		System.out.print(pgcd(p,q));
		
		

	}

}
