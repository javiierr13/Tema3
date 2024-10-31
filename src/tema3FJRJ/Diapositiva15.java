package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		String letra = "";

		do {
			System.out.println("Dame una letra");
			letra = sca.next();

		} while (letra.equalsIgnoreCase("A") && letra.equalsIgnoreCase("E") && letra.equalsIgnoreCase("I")
				&& letra.equalsIgnoreCase("O") && letra.equalsIgnoreCase("U"));

		System.out.println("Esa letra es una vocal ");

	}

}