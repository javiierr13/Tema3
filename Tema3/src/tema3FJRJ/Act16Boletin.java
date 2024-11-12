package tema3FJRJ;

import java.util.Random;

public class Act16Boletin {

	public static void main(String[] args) {

		Random rand = new Random();
		int pares = 0;
		int impares = 0;
		int golMbappe = 0;

		int aleatorio = rand.nextInt(100000000, 1000000000);

		for (int i = aleatorio; i > 0; i = i / 10) {
			int digito = (int) i % 10;

			if (digito % 2 == 0) {
				pares++;
				{
					if (pares % 4 == 0) {
						golMbappe++;
					}
				}
			} else {
				impares++;
			}
		}

		System.out.printf("Numero generado %d \nFRANCIA %d - %d INGLATERRA \nGoles de Mbappé: %d \n", aleatorio, pares,
				impares, golMbappe);

	}

}
