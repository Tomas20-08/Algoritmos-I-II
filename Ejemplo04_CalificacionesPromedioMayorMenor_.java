//"For" Aplicado en problemas

//Leer los nombres para n estudiantes, leer su calificación, hallar el promedio hallar la menor y la mayor calificación digitada.

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo04_CalificacionesPromedioMayorMenor_ {

    public static void main(String[] args) {

        //Variables
        
        int n,i;
        double cal,suma=0,prom,may=0,men=5.0;
        
        //Entrada
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el numero de Calificaciones a procesar");
        n = scanner.nextInt();
        
        //Bucle/Ciclo
        
        for(i=1;i<=n;i++){
            
            System.out.println("Digite la calificacion del estudiante "+i);
            cal = scanner.nextDouble();
            
            //Procesos dentro del Bucle/Ciclo
            
            suma =(suma+cal);
            
            //Número Mayor y Menor
                       
            if (cal>may){
                may = cal; }
            
            if (cal < men) {
                men = cal; }
                          
        }
                        
            //Procesos fuera del Bucle/Ciclo
        
            prom = (suma/n);
        
            //Salida
        
            System.out.println("El Pormedio es igual a..."+prom);
            System.out.println("La Calificación Mayor es igual a..."+may);
            System.out.println("La Calificación Menor es igual a..."+men);
        
        
    }
    
}
