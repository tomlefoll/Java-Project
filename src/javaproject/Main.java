package javaproject;

public class Main {

	public static void main(String[] args) {
		
		// variable de type String donc chaine de caractere 
		String prenom = "Tom";
		String nom = "lefoll";
		String ecole = "saintexdupéry";
		String classe = "3ème B";
		String adresse = "8 rue de la fraterniter";	
		
		// Variable de type booléen
		Boolean accepted =  false;
		
		// Variable de type int entier				
		int age = 14;
		int majeur = 18;
		int argentDePoche = 1;
		int distributeurCooki = 2; 
		
		
		//Variable de type float virgule flotante
		float note = 10.5f;
		
		
		System.out.println(nom + " " + prenom + " " + age + " " + ecole + "  " + 
		classe + "  " + adresse + " " + note);
		
		// Structure conditionelle if/else...
		
		if (age > majeur){
			System.out.println(nom + prenom + " vrai");
		} else {
			System.out.println(nom + prenom + " faux");
		}
	
		// Structure conditionnelle 
		
		if (argentDePoche > distributeurCooki) {
			System.out.println(nom + prenom + " valider");
		}else {
			System.out.println(nom + prenom + " pas valider");
			}
		
		//---------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		}
		

	}


