package tema3FJRJ;

import java.util.Scanner;

public class Act4Boletin {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dime una cadena");
		String cadena = sca.next();
		String caracter;
		String caracter2;
		String cadenaFinal = "";

		do {
			System.out.println("Dime un caracter");
			caracter = sca.next();
			System.out.println("Dime un caracter");
			caracter2 = sca.next();

		} while (caracter.length() != 1 && caracter2.length() != 1);

		for (int i = 0; i < cadena.length(); i++) {
			String letra = cadena.substring(i, i + 1);
			if (letra.equalsIgnoreCase(caracter)) {
				cadenaFinal = cadenaFinal + caracter2;
			} else {
				cadenaFinal = cadenaFinal + letra;
			}
		}
		System.out.println(cadenaFinal);

	}

}
