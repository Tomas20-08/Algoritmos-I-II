//Plantear el algoritmo de la resta

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo16_AlgoritmoDeLaResta_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        int resultado = a;

        // Decrementa resultado una vez por cada unidad de b
        for (int i = 0; i < b; i++) {
            resultado--;
        }

        System.out.println(a + " - " + b + " = " + resultado);
    }
}