package tema3FJRJ;

import java.util.Scanner;

public class Act17Boletin_Act3Moodle {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int pares = 0;
		int sumaPares = 0;

		System.out.println("Introduzca un número: ");
		long numero = sca.nextInt();

		for (long i = numero; i > 0; i = i / 10) {
			int digito = (int) i % 10;

			if (digito % 2 == 0) {
				pares++;
				sumaPares += digito;

			}
		}
		System.out.printf("El numero %d tiene %d digitos pares y suman %d \n", numero, pares, sumaPares);

	}
}