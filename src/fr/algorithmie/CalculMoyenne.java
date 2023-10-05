package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		double moyenne = array[0];
	
		for (int i = 1; i<array.length; i++) {
			moyenne = moyenne + array[i];
		} 

		System.out.println("Moyenne du tableau : " + (moyenne/array.length));

	}

}
