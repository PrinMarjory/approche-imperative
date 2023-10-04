package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		
		String[] nomVilles = {"Nantes", "Rennes", "Vannes", "Brest", "Lorient"};
		
		System.out.println(nomVilles[0]);
		System.out.println(nomVilles[1]);
		System.out.println(nomVilles[2]);
		System.out.println(nomVilles[3]);
		System.out.println(nomVilles[4]);
		
		System.out.println(nomVilles.length);
		
		nomVilles[3] = "Reims";
		
		System.out.println(nomVilles[0]);
		System.out.println(nomVilles[1]);
		System.out.println(nomVilles[2]);
		System.out.println(nomVilles[3]);
		System.out.println(nomVilles[4]);	
	}

}
