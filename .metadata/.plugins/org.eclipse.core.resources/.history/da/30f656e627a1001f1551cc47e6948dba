package tema3FJRJ;

import java.util.Scanner;

public class actividadFIBONACCI {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("Dame un numero");
		int cantidad = sca.nextInt();

		int numeroAnterior = 0;
		int numeroActual = 1;

		for (int i = 1; i <= cantidad; i++) {
			System.out.println(numeroAnterior);
			int siguiente = numeroAnterior + numeroActual;
			numeroAnterior = numeroActual;
			numeroActual = siguiente;
		}

		System.out.println("Ahora al reves, hacia atras");
	

		for (int i = 1; i <= cantidad; i++) {
			 int siguiente = numeroActual;
			numeroActual = numeroAnterior;
			numeroAnterior = siguiente - numeroActual;
			System.out.println(numeroAnterior);
			
		}
	}
}
//0,1,1,2,3,5,8
//reves 3  siguiente 2 
// System.out.println(numeroActual);3
// System.out.println(numeroAnterior);5