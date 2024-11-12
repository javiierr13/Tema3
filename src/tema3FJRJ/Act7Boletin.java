package tema3FJRJ;

import java.util.Scanner;

public class Act7Boletin {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int contadorMayor0= 0;
		int contadorMenor0= 0;
		int contadorIgual0= 0;

		
		System.out.println("¿Cuantos numeros vas a introducir?");
		int cantidad = sca.nextInt();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.printf("Introduce numero %d \n" , i+1);
			 int numeros = sca.nextInt();
			 
			 if(numeros > 0) {
					contadorMayor0++;
				}else if(numeros < 0){
					contadorMenor0++;
				}else if(numeros == 0) {
					contadorIgual0++;
				}
		}
		
		System.out.printf("Hay %d mayores de 0, %d menor que 0 e %d iguales a 0 \n" , contadorMayor0, contadorMenor0, contadorIgual0);
		
		
		
		
	}

}
