package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {

		System.out.println("Nombres de 1 à 10 :");
		for (int i = 0; i<10; i++) {
			// affiche les nombres de 1 à 10
			System.out.println(i+1);
		}
		
		System.out.println("\nMon NOM et Prénom 20x :");
		for (int i=0; i<20; i++) {
			// affiche mon NOM et Prénom 20x
			System.out.println((i+1) + ": PRIN Marjory");
		}
		
		System.out.println("\nNombre pairs de 2 à 100 :");
		for (int i=2; i<=100; i+=2) {
			// affiche les nombres pairs de 2 à 100
			System.out.println(i);
		}
		
		System.out.println("\nNombre pairs de 1 à 99 :");
		for (int i=1; i<=99; i+=2) {
			// affiche les nombres pairs de 1 à 99
			System.out.println(i);
		}

	}

}
