//"For" Aplicado en problemas

//Digitar el salario de n empleados, hallar la suma, promedio y salario mayor.

package CiclosBucles;

import java.util.Scanner;

public class Ejemplo03_BucleSumaPromedioMayor_ {

    public static void main(String[] args) {
        
        //Variables
        
        int n,i;
        double sal,suma=0,prom,may=0;
        
        //Entrada
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el numero de empleados");
        n = scanner.nextInt();
        
        //Bucle/Ciclo
        
        for(i=1;i<=n;i++){
            
            System.out.println("Digite el salario del empleado "+i);
            sal = scanner.nextDouble();
            
            //Procesos dentro del Bucle/Ciclo
            
            suma=(suma+sal);
            
            //Condicionales
            
            if(sal>may){
                may=sal;
            }
        }
        
        //Procesos Fuera del Bucle/Ciclo
        
        prom = (suma/100);
        
        //Salida
        
        System.out.println("La Suma es igual a..."+suma);
        System.out.println("El Pormedio es igual a..."+prom);
        System.out.println("El Salario mayor es igual a..."+may);
    }
    
}
