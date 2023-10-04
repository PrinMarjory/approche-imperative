package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		byte age = 43;
		short taille = 172;
		int nbHabitantFrance = 68_042_591;
		long nbFourmisTerre = 20_000_000_000_000_000L;
		float prix = 10.15f;
		double tailleElectron = 2.43e-12; 
		char initialPrenom = 'm';
		boolean isTrue = true;
		String proverbe = "Le sage apprend de ses erreurs, l'ignorant les répète";
		
		System.out.println(prix);
		
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		
		System.out.println(randomString);
		
		randomString = "Voici le résultat d’un calcul : \n1+5=6";
		
		System.out.println(randomString);
	}
	
}
