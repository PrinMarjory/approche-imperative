package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Ordre normal :");
		for (int i = 0; i<array.length; i++) {
			System.out.println("Index " + i + ": " + array[i]);
		}
		
		System.out.println("\n==========================\n");
		
		System.out.println("Ordre inversé :");
		int j = array.length-1;
		do {
			System.out.println("Index " + j + ": " + array[j]);
			j--;
		} while (j>-1);
		
		System.out.println("\n==========================\n");
		
		int[] arrayCopy = array;
		
		System.out.println("arrayCopy :");
		for (int i = 0; i<arrayCopy.length; i++) {
			System.out.println("Index " + i + ": " + arrayCopy[i]);
		}
		
	}

}
