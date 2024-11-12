package tema3FJRJ;

import java.util.Scanner;

public class Act2Moodle {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int numero = 0;
		int contador = -1;
		int impares = 0;
		int sumaImpares = 0;
		int mayorPar = 0;

		do {
			System.out.println("Dime un numero positivo");
			numero = sca.nextInt();
			contador++;
			if (numero % 2 == 0) {
				if (numero > mayorPar) {
					mayorPar = numero;
				}
			} else {
				impares++;
				sumaImpares += numero;
			}
		} while (numero > 0);
		int media = sumaImpares / impares;
		System.out.printf("Se han introducido %d numeros \nEl mayor Par es %d \nLa media de los impares es %d \n",
				contador, mayorPar, media);

	}

}
