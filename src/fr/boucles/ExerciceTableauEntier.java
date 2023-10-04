package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		int[] tableauEntier = new int [10];
		
		for (int i=0; i<tableauEntier.length; i++) {
			tableauEntier[i] = i+1;
		}
		
		System.out.println("Index 0: " + tableauEntier[0]);
		
		System.out.println("Longueur du tableau: " + tableauEntier.length);
		
		System.out.println("Dernier élément du tableau: " + tableauEntier[tableauEntier.length-1]);
		
		tableauEntier[4] = 8;
	}

}
