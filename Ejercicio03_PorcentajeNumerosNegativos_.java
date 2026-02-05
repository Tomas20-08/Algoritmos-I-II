
//Codificar en java un algoritmo que le pida al usuario digitar  números positivos y repetir si 
//ingresa uno negativo, el usuario debe digitar la cantidad de números, indicar el porcentaje 
//de los números negativos digitados implementar do-while. 


package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio03_PorcentajeNumerosNegativos_ {

    public static void main(String[] args) {
        
        //Scanner

        Scanner scanner = new Scanner(System.in);
        
        //Variables
        
        int n,tn = 0,no,nn = 0;
        double pnn;
        
        //Entradas
        
        System.out.println("Digite la cantidad de numeros a procesar");
        n = scanner.nextInt(); 
        
        //Ciclo (Do - While)
        
        do{
        
        System.out.println("Digite numero");
        no = scanner.nextInt();
        
        //Condicionales & Salidas
        
        if (no<0){
           
            nn = (nn+1);
            System.out.println("Ha digitado un número negativo (accion no valida)");
        }else
             tn = (tn+1);
           
        } while(tn < n);

            pnn = (nn*100)/(n);
           
            System.out.println("El porcentaje de los numeros negativos es: "+pnn+"%");
    
    }
}

//Glosario
    
//n = Cantidad de numeros
//no = Numeros
//tn = Total de Numeros
//nn = Numeros Negativos
//pnn = Porcentaje de Numeros Negativos

