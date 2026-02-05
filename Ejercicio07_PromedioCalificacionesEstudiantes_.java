
//Codificar en java un algoritmo que imprima el promedio de las calificaciones de varios 
//estudiantes, el sistema debe pedir el nombre del estudiante y debe, terminar cuando se 
//digite el nombre salir, cada uno de los estudiantes puede tener un número diferente de 
//calificaciones. 

package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio07_PromedioCalificacionesEstudiantes_ {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Ciclo (While)
        
        while(true){
            
        //Variables
            
        int n , cont = 0;
        double cal = 0 , sum = 0 , prom = 0;
        String nom;
        
        //Entradas
            
        System.out.print("Digite nombre del estudiante (Escriba *salir* para cerrar el sistema)");
        nom = scanner.next();
        
        //Condicion de salida
        
        if(nom.equals("salir")){
            
            System.out.println("Cerrando Sistema");
            break;
            
        }
        
        System.out.println("Digite la cantidad de notas que va a procesar el sistema: ");
        n = scanner.nextInt();
        
        //Ciclo anidado (While)
        
      while(cont < n){
          
        //Procesos
          
      cont++;
      
        System.out.println("Digite nota # " +(cont)+ " del estudiante "+(nom)+" (La nota debe ser entre el intervalo 0.0 y 5.0)");
        cal = scanner.nextDouble();
        
        sum += cal;   
  }
      
      prom = sum/n;
      
      //Salida
           
      System.out.println("El promedio del estudiante " +(nom)+" es: " +prom);
      
        }
    }
}

//Glosario

//n = Numero de Calificaciones
//cont = Contador
//cal = Calificaiones
//sum = Suma
//prom = Promedio
//nom = Nombres y Apellidos