package Tema3;

import java.util.Scanner;

public class Diapositiva9 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int n = 0;
		int suma = 0;

		while (n < 10) {
			System.out.println("Ingrese un valor");
			int valor = sca.nextInt();
			suma = suma + valor;
			n++;
		}

		double promedio = 1.0 * suma / n;

		System.out.println("La suma de los valores ingresados es: " + suma);
		System.out.println("El promedio es: " + promedio);

	}

}
