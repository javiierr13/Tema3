package tema3FJRJ;

import java.util.Scanner;

public class Act14Boletin {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int numero;
		int suerte = 0;
		int noSuerte = 0;

		do {
			System.out.println("Introduzca un número: ");
			numero = sca.nextInt();

		} while (numero <= 0);
		// do /while valida que el numero sea positivo
		int numero1 = numero;

		while (numero > 0) {
			int digito = numero % 10;
			if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				suerte++;
			} else {
				noSuerte++;
			}
			numero = numero / 10;
		}

		if (suerte > noSuerte) {
			System.out.printf("El %d es un numero afortunado", numero1);
		} else {
			System.out.printf("El %d es un numero desafortunado", numero1);
		}

	}
}
