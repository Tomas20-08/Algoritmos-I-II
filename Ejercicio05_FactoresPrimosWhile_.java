
//Imprimir los factores primos de un número digitado por el usuario, implementar un único 
//ciclo while. 

package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio05_FactoresPrimosWhile_ {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        
        int i = 2,n;
        
        //Entradas
        
        System.out.println("Digite un numero");
            n = scanner.nextInt();
            
            //Condición Logica
            
            if (n <= 1) {
            System.out.println("No se pueden calcular factores primos de " + n);
            return;
            }
            
            //Ciclo (While)
        
        while(n>1){
            
            //Condicionales & Salidas
            
            if(n % i == 0){
                
                n /= i;
                
                System.out.println("El numero es primo y sus factores son: 1 "+i);
                
            }else{
                
                i++;
            }
            
        }
         
        
    }
    
}

//Glosario

//i = Numero
//n = Divisor