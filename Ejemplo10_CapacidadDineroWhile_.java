//Codificar en java un programa que permita hallar el valor total del dinero que ingresa por un evento 
//el valor unitario lo define el ususario el sistema debe permitir el ingreso únicamente de personas mayores de edad 
//y debe mostrar la capacidad a medida de que ingresa cada uno de los asistentes la capacidad inicial la define el usuario.
 
package CiclosBucles;

import java.util.Scanner;

public class Ejemplo10_CapacidadDineroWhile_ {

    public static void main(String[] args) {
        
        //Variables
        
        int cap,cont=0;
        double ent,suma=0;
                
        //Entrada
        
         Scanner scanner = new Scanner(System.in);       
         System.out.println("Digite el valor de la entrada:");
         ent=scanner.nextDouble();
         System.out.println("Digite la capacidad del evento:");
         cap=scanner.nextInt();
         
        //Bucle/Ciclo
        
        while (cont<cap){
            System.out.println("Digite la edad de la persona");
            int edad = scanner.nextInt();
            if (edad>=18){
                suma=suma+ent;
                cont++;
                        
            System.out.println("La capacidad actual es..."+(cap-cont));
            } else {
                System.out.println("No puede ingresar, es menor de edad.");
                   }
        }        
        
        //Salida
        
        System.out.println("Total recaudado: $" + suma);

    }
    
}
