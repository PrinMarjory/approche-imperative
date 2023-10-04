package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		
		int[] tableauEntier = new int [] {8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println(tableauEntier[0]);
		
		System.out.println(tableauEntier.length);
		
		System.out.println(tableauEntier[tableauEntier.length-1]);
		
		System.out.println(tableauEntier[10]); 
		/* Ne fonctionne pas car l'index 10 n'existe pas, le tableau s'arrête à l'index 7*/
	}

}
