package tema3FJRJ;

import java.util.Random;
import java.util.Scanner;

public class ActividadCajaFuerte {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		Random random = new Random();

		int contra = random.nextInt(1000, 9999);
		System.out.println(contra);

		int contrasenna = 0;

		int contador = 0;
		do {
			System.out.println("Introduzca contraseña");
			contrasenna = sca.nextInt();
			contador++;
			if (contrasenna != contra) {
				System.out.println("Contraseña Incorrecta");
			}

		} while (contrasenna != contra && contador < 4);
		if (contrasenna == contra && contador < 4) {
			System.out.println("Padentro");
		} else {
			System.out.println("Agotado fallos");
		}

	}

}


//MI VERSION
//Scanner sca = new Scanner(System.in);
//Random random = new Random();
//
//int contra = random.nextInt(1000, 9999);
//System.out.println(contra);
//int codigo = 0;
//
//do {
//	System.out.println("Introduce la contraseña");
//	codigo = sca.nextInt();
//	if (contra!=codigo) {
//		System.out.println("Contraseña Incorrecta");
//	}
//	
//} while (contra!=codigo);
//System.out.println("Contraseña correcta , PADENTRO");
//
//}
//
//}
