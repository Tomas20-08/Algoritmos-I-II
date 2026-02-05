//Plantear el algoritmo de la división

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo18_AlgoritmoDeLaDivisión_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        int cociente = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor; // residuo = residuo - divisor
            cociente++;
        }

        System.out.println(dividendo + " / " + divisor + " = " + cociente + " con residuo " + residuo);
    }
}