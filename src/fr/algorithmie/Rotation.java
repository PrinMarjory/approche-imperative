package fr.algorithmie;

public class Rotation {
	
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 5};
		int[] arrayCopy = new int[array.length];
		
		arrayCopy[0]= array[array.length-1];
		
		for (int i = 1; i<array.length; i++) {
			arrayCopy[i] = array[i-1];
		}
		
		System.out.println("Tableau après rotation :");
		for (int i = 0; i<arrayCopy.length; i++) {
			System.out.println("Index " + i + ": " + arrayCopy[i]);
		}

	}
}
