package tema3FJRJ;

import java.util.Scanner;

public class Act1Boletin {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		String caracter = "";

		do {
			System.out.println("Dame una caracter");
			caracter = sca.next();

			if (caracter.equalsIgnoreCase("A") || caracter.equalsIgnoreCase("E") || caracter.equalsIgnoreCase("I")
					|| caracter.equalsIgnoreCase("O") || caracter.equalsIgnoreCase("U")) {
				System.out.println("VOCAL");
			} else {
				System.out.println("NO VOCAL");
			}

		} while (!caracter.equalsIgnoreCase("."));
		System.out.println("FINALIZADO");

	}

}
