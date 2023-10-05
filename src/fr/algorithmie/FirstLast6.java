package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 6};
		boolean result = false;
		
		if (array.length>=1 && (array[0]==6 || array[array.length-1]==6) ){
			result = true;
		}

		System.out.println(result);

	}

}
