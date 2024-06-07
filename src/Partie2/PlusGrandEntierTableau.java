package Partie2;

import java.util.Scanner;

//exo 2
//Écrivez une méthode qui renvoie le plus grand entier dans un tableau.


public class PlusGrandEntierTableau {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Entrez les données du tableau : ")
		int tab[]= {1,20,45,60,180,250};
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		String contenuTab = "";
		for(int i = 0; i<tab.length;i++) {
			if(tab[i]< max) {
				max = tab[i];
				
			}
			if(tab[i]> min) {
				min = tab[i];
			}
			if(i>0 && i<tab.length) {
				contenuTab+=",";
			}
			contenuTab += tab[i];
			
		}
		System.out.println("le nbre min du tableau ["+contenuTab+"] est "+min);
		System.out.println("le nbre max du tableau ["+contenuTab+"] est "+max);
		
		
	}

}
