package partie3;

import java.util.Scanner;

//partie 3

// exo 4
//Écrivez une méthode qui renvoie « Fizz » pour des multiples de trois et « Buzz » pour des multiples de cinq.

//Pour les nombres qui sont des multiples de trois et de cinq, retournez « FizzBuzz ».

//Pour les nombres qui ne sont ni l’un ni l’autre, renvoyez le nombre saisi.

public class FizzBuzz {
	
	public String modulo(double nbre) {
		
		return "";
		
	}

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Entrez un nombre: ");
		
		double nbre = sc.nextDouble();
		
		int m = (int) (nbre % 3);
		int n = (int) (nbre % 5);
		
		
		if  (m == 0 && n == 0)  {
			System.out.println("FizzBuzz");
			
		}else {
			if (m == 0){
				
				System.out.println("Fizz");
				
				
			}else {
				if (n == 0){
					
					System.out.println("Buzz");
					
					
				}else {
					System.out.println("Ce n'est ni multiple de 3 ni multiple de 5");
				}
			}
			
		}
		
		
	}

}
