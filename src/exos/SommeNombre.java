package exos;

import java.util.Scanner;
//exo 4
//Écrivez un programme Java qui prend deux nombres en entrée
//et affichez le produit de deux nombres.
public class SommeNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter le 1er nombre : ");
		int nbre1 = sc.nextInt();
		
		System.out.println("Entrer le 2e nombre : ");
		int nbre2 =  sc.nextInt();
		
		System.out.println("Le produit de "+nbre1+"x"+nbre2+"="+nbre1*nbre2 );
		

	}

}
