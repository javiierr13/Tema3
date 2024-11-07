package tema3FJRJ;

import java.util.Scanner;

public class ActVladi {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dame un numero");
		int numero = sca.nextInt();
		boolean esPrimo= true;
		
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				esPrimo=false;
			}
		}
		if(esPrimo==true) {
			System.out.println("Es Primo");
		}else {
			System.out.println("No es Primo");
		}
		
		
		
	}

}
