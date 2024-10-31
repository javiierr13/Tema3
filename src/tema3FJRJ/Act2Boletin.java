package tema3FJRJ;

import java.util.Scanner;

public class Act2Boletin {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		String caracter = "";

		System.out.println("Introduce la cadena");
		String cadena = sca.next();

		do {
			System.out.println("Introduce el caracter");
			caracter = sca.next();

		} while (caracter.length() != 1);

		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			String letra = cadena.substring(i, i + 1);

			if (letra.equalsIgnoreCase(caracter)) {
				contador++;
			}

		}
		System.out.printf("El caracter aparece %d veces \n", contador);

	}

}
