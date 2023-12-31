package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };		
		int[] arraySomme = new int[Math.max(array1.length, array2.length)];
		
		if (array1.length <= array2.length) {
			for(int i = 0; i<array1.length; i++) {
				arraySomme[i] = array1[i] + array2[i];
			}
			for(int i = array1.length; i<array2.length; i++) {
				arraySomme[i] = array2[i];
			}
		} else {
			for(int i = 0; i<array2.length; i++) {
				arraySomme[i] = array1[i] + array2[i];
			}
			for(int i = array2.length; i<array1.length; i++) {
				arraySomme[i] = array1[i];
			}
		}
		
		System.out.println("arraySomme :");
		for (int i = 0; i<arraySomme.length; i++) {
			System.out.println("Index " + i + ": " + arraySomme[i]);
		}

	}

}
