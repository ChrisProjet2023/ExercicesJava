package exos;

import java.util.Scanner;

//exo 8
//Écrivez un programme Java pour permuter deux variables.

public class PermuteVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la 1ere variable a: ");
		String a = sc.next();
		
		System.out.println("Entrer la 2e variable b: ");
		String b = sc.next();
		String temp;
		temp = a;
		a = b;
		b = temp;
		//a=b;
		
		System.out.println("a: "+a+" b: "+b);
		
		
		
		
	}

}
