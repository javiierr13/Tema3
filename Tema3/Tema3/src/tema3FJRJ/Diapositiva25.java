package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva25 {

	public static void main(String[] args) {

	     Scanner sca= new Scanner(System.in);

	     int numero;
	     int suma = 0;
	     double media ;
	     
	     for (int i = 1; i <= 10; i ++) {
	    	 System.out.println("Escribe un numero");
	    	 numero = sca.nextInt();
	    	 suma+= numero;
	     }
		media = suma / 10.0;
		System.out.println("La media es " + media);
		
		
	}

}
