
//Codificar en java un algoritmo que le pida al usuario  digitar números positivos y repetir si 
//ingresa uno negativo, el ciclo debe terminar cuando se ingrese el número 9999, imprimir el 
//número que más se repite y el número de veces. 

package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio04_NumeroMasRepetido_ {

    public static void main(String[] args) {

        //Scanner
        
        Scanner scanner = new Scanner(System.in);

        //Variables
        
        int n = 0;
        int maxrep = 0;
        int nummasrep = -1;
        int cont = 0;
        int numact = 0; 
        int repact = 0;

        //Bucle (While)
        
        while (n != 9999) {
            
            //Entrada
            
            System.out.println("Digite numero positivo (para terminar proceso digite el numero 9999):");
            n = scanner.nextInt();

            //Condición de Salida
            
            if (n == 9999) {
                System.out.println("Terminando proceso...");
                break;
            }

            //Condición Lógica
            
            if (n < 0) {
                System.out.println("Ha digitado un numero negativo (accion no valida)");
                continue;
            }
            
            // Condicionales

            if (n == numact) {
                repact++;
            } else {
                
                if (repact > maxrep) {
                    maxrep = repact;
                    nummasrep = numact;
                }
                
                numact = n;
                repact = 1;
            }
            
            cont++;
        }
        
        //Condicionales

        if (repact > maxrep) {
            maxrep = repact;
            nummasrep = numact;
        }
        
        System.out.println("El numero más repetido es " + nummasrep + " y se repitio " + maxrep + " veces");

    }
}

//Glosario

//n = Números
//cont = Contador
//nummasrep = Número que más se repite
//maxrep = máximas repeticiones
//numact = Numero Actual
//repact = Repeticiones Actuales