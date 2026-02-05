//Digite los número primos hasta 100

package CiclosBucles;

public class Ejemplo14_NumerosPrimos100_ {

    public static void main(String[] args) {
        
        int i,j,cont=0;
        
        for(i=2; i<=100; i++){
            
            for(j=1;j<=i;j++){
               
           if(i%j==0){
               cont++;
           
            }
           
            }
    
           if (cont==2){
               System.out.println("El No..." +i+ " es primo ");
               
            }
           
           cont=0;
        }
            
            
    }
    
}
