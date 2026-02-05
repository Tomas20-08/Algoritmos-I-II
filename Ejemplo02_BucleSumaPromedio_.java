//Bucles, Sumas Y Promedio

//Imprima los números del 1 al 100 y sumelos lugo halle el promedio.

package CiclosBucles;

public class Ejemplo02_BucleSumaPromedio_ {

    public static void main(String[] args) {
        
        //Variables
        
        int i;
        double suma=0,prom;
        
       //Procesos
        
        for(i=1;i<=100;i++){
            
        //Salida Dentro Del Bucle/Ciclo
            
            System.out.println("No..."+i);
            
        //Procesos Dentro Del Bucle/Ciclo
            
            suma=(suma+i);
            
                            }
        
        //Proceso Fuera Del Bucle/Ciclo
       
            prom=(suma/100);
            
        //Salidas Fuera Del Bucle/Ciclo
            
            System.out.println("La Suma es igual a..."+suma);
            System.out.println("El Promedio es igual a..."+prom);
    }
    
}
