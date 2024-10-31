package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {

		Scanner pig = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Dame un numero positivo");
			numero = pig.nextInt();

		} while (numero <= 0);

		while (numero > 0) {
			int unidad = numero % 10;
			numero = numero / 10;
			System.out.println(unidad);
			
			
		}

	}
}
