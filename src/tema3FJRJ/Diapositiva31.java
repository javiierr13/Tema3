package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva31 {

	public static void main(String[] args) {

	     Scanner sca= new Scanner(System.in);

	     int opcion = 0;

			do {
				System.out.println("Elige una opcion del menu");
				System.out.println("1. Opcion 1");
				System.out.println("2. Opcion 2");
				System.out.println("3. Opcion 3");
				System.out.println("4. Opcion 4");
				System.out.println("5. Salir");

				opcion = sca.nextInt();

				switch (opcion) {
				case 1: 
					System.out.println("Ejecutando la opción 1.........");
					break;
				case 2: 
					System.out.println("Ejecutando la opción 2.........");
					break;
				case 3: 
					System.out.println("Ejecutando la opción 3.........");
					break;
				case 4: 
					System.out.println("Ejecutando la opción 4.........");
					break;
					
				default:
					System.out.println("Saliendo.........");
				}
				
			} while (opcion >= 1 && opcion <= 4);

		
	}

}
