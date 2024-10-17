import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;


		do {

			System.out.println("Dame un numero");
			numero1 = sca.nextInt();
			
			System.out.println("Dame otro numero");
			numero2 = sca.nextInt();
			
		} while (numero1 != numero2);
		System.out.println("Esos numero son iguales ");

	}

}