package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;	
		int nombreCommun = 0;
		
		if (array1.length <= array2.length) {
			for(int i = 0; i<array1.length; i++) {
				for(int j = 0; j<array2.length; j++) {
					if (array1[i] == array2[j]) {
						nombreCommun++;
					}
				}
			}		
		} else {
			for(int i = 0; i<array2.length; i++) {
				for(int j = 0; j<array1.length; j++) {
					if (array2[i] == array1[j]) {
						nombreCommun++;
					}
				}
			}	
		}
		
		System.out.println("Nombre d'élément en commun : " + nombreCommun);

	}

}
