package tema3FJRJ;

import java.util.Scanner;

public class Act6Boletin {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		String palabra = "";
		String palabraFinal= "";

		do {
			System.out.println("Introduce una palabra");
			palabra = sca.next();

		} while (palabra.length() <= 1);
		// Pide una palabra de longitud mayor a 1

		for (int i = palabra.length()-1 ; i >= 0; i--) {
			String caracter = palabra.substring(i, i + 1);
			palabraFinal = palabraFinal + caracter;
		}
		if (palabra.equalsIgnoreCase(palabraFinal)) {
			System.out.printf("La palabra es un palindromo");
		} else {
			System.out.printf("La palabra NO es un palindromo");
		}
	}
}