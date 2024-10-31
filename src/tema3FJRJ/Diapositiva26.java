package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva26 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Introduce un numero de 1 al 10");
			numero = sca.nextInt();

		} while (numero < 1 || numero > 10);
		System.out.println("Tabla del " + numero);

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + numero * i);

		}
	}
}