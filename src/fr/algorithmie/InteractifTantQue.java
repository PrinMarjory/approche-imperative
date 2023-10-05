package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un nombre entre 1 et 10 :");
		int nb = scanner.nextInt();
		
		while (nb<1 || nb>10) {
			System.out.println("Le nombre saisi n'est pas compris entre 1 et 10, veuillez saisir un autre nombre :");
			nb = scanner.nextInt();
		}
		
		System.out.println("Le nombre saisi est : " + nb);
	}

}
