package tema3FJRJ;

import java.util.Scanner;

public class Act1Moodle {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Introduce la cadena:");
        String cadena = sca.next();

        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            String letra = cadena.substring(i, i + 1);

            if (letra.equals(letra.toUpperCase())) {
                resultado = resultado + letra.toLowerCase();
            } else {
                resultado = resultado + letra.toUpperCase();
            }
        }

        System.out.println("Resultado: " + resultado);
    }
}
