package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Ordre normal :");
		for (int i = 0; i<array.length; i++) {
			System.out.println("Index " + i + ": " + array[i]);
		}
		
		System.out.println("\nOrdre inversé :");
		int j = array.length-1;
		do {
			System.out.println("Index " + j + ": " + array[j]);
			j--;
		} while (j>-1);
		
		System.out.println("\nEntiers supérieur à 3 :");
		for (int i = 0; i<array.length; i++) {
			if (array[i]>3) {
				System.out.println(array[i]);
			}
		} 
		
		System.out.println("\nEntiers pairs :");
		for (int i = 0; i<array.length; i++) {
			if (array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		} 
		
		System.out.println("\nValeurs des index pairs :");
		for (int i = 0; i<array.length; i++) {
			if (i%2 == 0) {
				System.out.println("Index " + i + ": " + array[i]);
			}
		}
		
		System.out.println("\nEntiers impairs :");
		for (int i = 0; i<array.length; i++) {
			if (array[i]%2 != 0) {
				System.out.println(array[i]);
			}
		} 
		
	}
}
