package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Entiers supérieur à 3 :");
		for (int i = 0; i<array.length; i++) {
			if (array[i]>3) {
				System.out.println(array[i]);
			}
		} 
		
		System.out.println("\n==========================\n");
		
		System.out.println("Entiers pairs :");
		for (int i = 0; i<array.length; i++) {
			if (array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		} 
		
		System.out.println("\n==========================\n");
		
		System.out.println("Valeurs des index pairs :");
		for (int i = 0; i<array.length; i++) {
			if (i%2 == 0) {
				System.out.println("Index " + i + ": " + array[i]);
			}
		}
		
		System.out.println("\n==========================\n");
		
		System.out.println("Entiers impairs :");
		for (int i = 0; i<array.length; i++) {
			if (array[i]%2 != 0) {
				System.out.println(array[i]);
			}
		} 

	}

}
