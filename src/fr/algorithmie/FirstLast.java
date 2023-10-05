package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 1};
		boolean result = false;
		
		if (array.length>=1 && array[0]==array[array.length-1]){
			result = true;
		}

		System.out.println(result);

	}

}
