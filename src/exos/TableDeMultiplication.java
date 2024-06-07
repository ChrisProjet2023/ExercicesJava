package exos;

import java.util.Scanner;
//exo 5
//Écrivez un programme Java qui prend un nombre en entrée et affiche sa table de multiplication jusqu’à 10.

public class TableDeMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Entrer le nombre : ");
		int nbre = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.println(nbre+"x"+(i+1)+"="+nbre*(i+1));
		}
		
		
	}

}
