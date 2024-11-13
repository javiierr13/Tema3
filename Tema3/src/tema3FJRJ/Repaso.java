package tema3FJRJ;

import java.util.Iterator;
import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int numero = sca.nextInt();
		boolean esPrimo = true;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				esPrimo = false;

			}

		}
		if (esPrimo == true) {
			System.out.println("Es PRIMO");
		} else {
			System.out.println("NO es PRIMO");
		}

	}
}

//10,11,13,14,16, cajafuerte, vladi, 