package tema3FJRJ;

import java.util.Scanner;

public class Act10Boletin {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dame un numero entero");
		double base = sca.nextInt();

		System.out.println("Dame un exponente");
		int exponente = sca.nextInt();
		double resultado = 1.0;

		for (int i = 0; i < exponente; i++) {
			resultado = resultado * base;
		}
		System.out.println(resultado);

	}

}
//10,11,13,14,16, cajafuerte, vladi, mbappe