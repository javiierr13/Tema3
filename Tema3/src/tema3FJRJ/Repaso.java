package tema3FJRJ;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		String aux = "";
		String cadena = "sever la anedac";

		for (int i = 22; i < cadena.length() + 1; i--) {
			aux = aux+ cadena.substring(i, i - 1);
		}
		System.out.println(aux);
	}
}