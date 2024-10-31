package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva14 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int numero = 0;

		do {

			System.out.println("Dame un numero entre 1-10");
			numero = sca.nextInt();
		} while (numero < 1 || numero > 10);
		System.out.println("Ese numero esta dentro del rango ");

	}

}
