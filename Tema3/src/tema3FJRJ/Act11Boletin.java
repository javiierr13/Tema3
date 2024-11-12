package tema3FJRJ;

public class Act11Boletin {

	public static void main(String[] args) {

		int dinero = 10;
		int dineroTotal = 0;

		for (int i = 0; i < 20; i++) {
			System.out.printf("El mes %d pagará %d€ \n", i + 1, dinero);
			dineroTotal += dinero;
			dinero *= 2;
		}

		System.out.printf("En total pagará %d€.\n", dineroTotal);
	}
}
