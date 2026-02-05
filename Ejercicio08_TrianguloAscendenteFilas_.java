
//Codificar en java un algoritmo que imprima el siguiente triangulo. 
//1 
//12 
//123 
//1234                                      
//El usuario determina el número de filas. 

package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio08_TrianguloAscendenteFilas_ {

    public static void main(String[] args) {  
      
        //Scanner
               
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        
        int n , x , y ;
        
        //Entrada
        
        System.out.println("Digite el numero de filas a procesar...");
        n = scanner.nextInt();
        
        //Ciclo anidado (For)
        
        for (x=1;x<=n;x++){
            for (y=1;y<=x;y++){
                
                //Salidas
                
                System.out.print(y);
            }
            System.out.println();
        }
    }   
}

//Glosario

//n = Numero de Filas
//x = Cobtador 1
//y = Contador 2