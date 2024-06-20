package partie3;

import java.util.Scanner;

//exo 6
/*Écrivez une méthode qui renvoie le nième élément d’une séquence de Fibonacci. Une séquence de Fibonacci 
 * est une série de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, … Le nombre suivant est trouvé en additionnant 
 * les deux nombres précédents. Supposons que les index commencent à 0, par exemple, fibonacci(0) = 0, fibonacci(1) = 1, etc…
 * 
 * */

public class SuiteFibonacci {
	
	public static int fibonacci(int n) {
		
		int nbre =0;
		
		/*for(int i =2;i<n;i++) {
			
			nbre = (i-1)+(i-2);
		}*/
		
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		//return  nbre;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre : ");
		int nbre = sc.nextInt();
		
		System.out.println("Fibonacci("+nbre+") = "+fibonacci(nbre));
		

	}

}
