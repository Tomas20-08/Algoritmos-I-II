//Tablas de multiplicar uso de "For"

package CiclosBucles;

public class Ejemplo12_TablasDeMultiplicar_ {

    public static void main(String[] args) {
        
        //Variables

        int i,j,prod = 0;
        
        //Entrada
        
        for (i=1;i<=10;i++){
            for (j=1;j<=10;j++){
                prod = (i * j);
                
                //Salida
                
                System.out.println(""+i+ " * "+j+" = "+prod);
            }
        System.out.println("\n");  
        }
    }            
        
}
    

