
//En la facultad de ingeniería de Ucompensar existen x programas cada uno con y semestres 
//& z materias por semestre, codificar en java un algoritmo para determinar el semestre y el 
//programa con el mayor y el menor número de materias ,hallar el total de las materias que 
//existen en la facultad. 

package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio09_FacultadProgramaMaterias_ {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        
        int x,y,z;
        int i,j;
        int ztot = 0;
        int may = 0, men = 0;
        int zx = 0, zmay = 0, zmen = 0;
        
        //Entradas
        
        System.out.println("Numero de Programas");
        x = scanner.nextInt();
        
        //Ciclo anidado (For)
        
        for(i=1;i<=x;i++){
            
            System.out.println("Numero de Semestres "+i);
            y = scanner.nextInt();
            
            zx = 0;
            
            for(j=1;j<=y;j++){
                
                System.out.println("Numero de Materias "+j);
                z = scanner.nextInt();
                
                //Procesos
                
                zx += z;
            } 
            
            ztot += zx;
            
            //Ciondioales (Mayor y Menor) En bucles
            
            if (i == 1){
                may = zx;
                men = zx;
                zmay = i;
                zmen = i;
            } else {
            if (zx > may){
                may = zx;
                        zmay = i;
            }
            
            if (zx < men){
                men = zx;
                        zmen = i;
                        
            }
            
        }
            
    }
        
        //Salidas
        
          System.out.println("Programa con más materias: " + zmay + " (" + may + " materias)");
        System.out.println("Programa con menos materias: " + zmen + " (" + men + " materias)");
        System.out.println("Total de materias en la facultad: " + ztot);
        
    }
    
}

//Glosario

//x = Numero de Programas
//y = Numero de Semestres
//z = Numero de Materias
//i = Contador 1
//j = Contador 2
//ztot = Total de Materias
//may = Mayor
//men = Menor
//zx = Cantidad de Materias por Programa
//zmay = Programa con más Materias
//zmen = Programa con menos Materias