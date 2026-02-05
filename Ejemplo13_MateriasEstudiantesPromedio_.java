//se tiene "n" materias cada una con "m" estudiantes , hallar el promedio por materia.

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo13_MateriasEstudiantesPromedio_ {

    public static void main(String[] args) {
        
        //Variables
        
        int i,j,n,m;
        double cal=0,suma=0,prom=0;
        
        //Entrada
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el numero de materias a procesar");
        n = scanner.nextInt();
        
        //Ciclo/Bucle
        
        for (i=1;i<=n;i++){
            System.out.println("Digite el numero de estudiantes a procesar");
        m = scanner.nextInt();
        
        //Procesos
        
            for (j=1;j<=m;j++){
                System.out.println("Digite la calificación del estudiante "+m);
                cal = scanner.nextDouble();
                suma = (suma+cal);
            }
            
            //Procesos 
           
                prom = (suma/m);
                
            //Salida

                System.out.println("El promedio de las notas de la materia " +i+ " es..."+prom);
        
        }

    }
    
}
