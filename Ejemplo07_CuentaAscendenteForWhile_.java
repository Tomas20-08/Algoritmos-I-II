//Uso de "while" y "for" (Comparación)

package CiclosBucles;

public class Ejemplo07_CuentaAscendenteForWhile_ {

    public static void main(String[] args) {
        
        int x;
        x=1;
        //While
        while (x<=100) {
            System.out.println(x);
            System.out.println(" - ");
            x = x + 1;
        }
        //For
         System.out.println("\n");
        for(x=1; x<=100; x++){
            System.out.println(x);
            System.out.println(" - ");
        }

    }
    
}
