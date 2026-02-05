//Plantera el algoritmo de la multiplicacion

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo17_AlgoritmoDeLaMultiplicación_ {

    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        int resultado = 0;

        // Multiplicar sumando a varias veces
        
        for (int i = 0; i < b; i++) {
            
            resultado += a; // resultado = resultado + a
        }

        System.out.println(a + " x " + b + " = " + resultado);
    }
}