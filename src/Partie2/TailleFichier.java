package Partie2;

import java.io.File;

//exo 4 
//Écrivez un programme Java pour trouver la taille d’un fichier spécifié.

public class TailleFichier {

	public static void main(String[] args) {
	 long size1 = new File("D:\\CHRIS\\CHRIS\\2024\\ERPCOMPTA\\RAPPORTS DE TEST\\Nouveau dossier\\ecohada_mecef.pdf").length();
	//long size2 = new File("").length();
		System.out.println("Taille "+size1+" en octets");

	}

}
