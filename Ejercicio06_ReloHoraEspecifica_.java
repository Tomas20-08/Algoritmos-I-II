
//Codificar en java un algoritmo que, imprima todas las horas, minutos y segundos desde 
//00:00:00 hasta 12:15:59, implementar ciclos anidados. 

package TallerAlgoritmosCorte2;

public class Ejercicio06_ReloHoraEspecifica_ {

    public static void main(String[] args) {
        
        //Variables
        
        int x = 0,y = 0,z = 0;
        
        //Ciclo anidado (For)
        
            for(x=0;x<=12;x++){
 
                for(y=0;y<=15;y++){
      
                    for(z=0;z<=59;z++){
                        
                        //Salida
           
                        System.out.println(x+":"+y+":"+z);
                    
                }
            }
        }
    }
}

//Glosario

//x = Horas
//y = Minutos
//z = Segundos