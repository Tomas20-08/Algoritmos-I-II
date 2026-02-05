//Codificar un programa en java que le permita al usuario digitar nuemeros enteros positivos, 
//unicamente debe aceptar números pares hallar la suma y el promedio.

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo08_NumeroEnteroPostivoSumaPromedio_ {

    public static void main(String[] args) {
        
        //Variables
        
        int num,n,cont=0,suma=0;
        double prom;
        
        //Entrada
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la cantidad de números pares a ingresar:");
        n = scanner.nextInt();
        
        //Ciclo/Bucle
        
        while(cont< n){
        System.out.println("Digite un número entero positivo y par:");
        num = scanner.nextInt();
        
        //Condicionales

        if (num >= 0 && num % 2 == 0) {
            suma += num;
            cont++;
                                      } 
        else {
        System.out.println("El número no es válido (debe ser positivo y par).");
             }
                
                      }
            
        //Procesos Fuera del Bucle
        
        prom = suma/n;
        
        //Salidas
        
        System.out.println("La suma es..."+suma);
        System.out.println("El Promedio es..."+prom);

    }
  

}
 
