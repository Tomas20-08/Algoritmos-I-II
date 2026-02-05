//Codificar un programa en java que permita al ususario ingresar calififcaciones entre 0 y 5 hallar la calififcación mayor la calificación menor

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo09_CalificacionesMayorMenor_ {

    public static void main(String[] args) {
        
        //Variables
        
        int n,cont=0;
        double cal,may=0,men=5;
        
        //Entrada
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el numero de Calificaciones a procesar");
        n = scanner.nextInt();
        
        //Ciclo/Bucle
        
        while(cont<n){
            System.out.println("Digite nota estudiante "+ (cont+1) +":");
            cal = scanner.nextDouble();
            
            //Condicionales
            
            if(cal>=0 && cal <=5){
                if(cal>may) {
                may=cal; 
                            }
            
            if(cal<men){
                men=cal;
                       }
                                 } 
            else {
                System.out.println("Nota inválida. Debe estar entre 0 y 5.");
                 }
 
                cont++;
                
    }
        
        //Salida
        
        System.out.println("La nota mayor es..."+may);
        System.out.println("La nota menor es..."+men);

    }
    
}
