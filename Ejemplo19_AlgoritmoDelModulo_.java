//Plantear el algoritmo del modulo

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo19_AlgoritmoDelModulo_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int b = scanner.nextInt();

        int residuo = a;

        while (residuo >= b) {
            residuo -= b;
        }

        System.out.println(a + " % " + b + " = " + residuo);
    }
}