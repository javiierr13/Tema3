package tema3FJRJ;

import java.util.Scanner;

public class Diapositiva30 {

	public static void main(String[] args) {

	     Scanner sca= new Scanner(System.in);

	     int contador = 0;
	     
	     for(int i = 0; i < 5; i ++) {
	    	 System.out.println("Dime la nota del alumno " + (i+1));
	    	 int nota = sca.nextInt();
	    	 
	    	 if(nota<5) {
	    		 contador ++;
	    	 }
	     }

		System.out.printf("Hay %d suspensos /n" , contador);
		
	}

}
