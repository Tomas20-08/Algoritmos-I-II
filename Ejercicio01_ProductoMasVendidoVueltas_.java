

//Codificar en java un algoritmo en donde el usuario ingresa código, nombre de producto, el 
//precio y cantidades, hasta que existan los productos, el ciclo debe terminar cuando se asigne -1 a una variable, 
//calcular el producto que más se vendió, el total del pedido y teniendo en 
//cuenta el pago por parte del cliente, calcular el valor de el cambio. 



package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio01_ProductoMasVendidoVueltas_ {

    public static void main(String[] args) {
        
        //Scanner
    
        Scanner sc = new Scanner(System.in);
        
        //Variables
        
        int co, ca, catot = 0, camay = 0;
        double pre, totpe = 0, sub, pag;
        String nom, promas = null;
        
        //Bucle (While)

        while (true) {
            System.out.print("Ingrese el código del producto (-1 para salir): ");
            co = sc.nextInt();
            
            //Condición de Salida
            
            if (co == -1) 
            break;
            
            //Entradas

            sc.nextLine(); 
            System.out.print("Nombre del producto: ");
            nom = sc.nextLine();

            System.out.print("Precio: ");
            pre = sc.nextDouble();

            System.out.print("Cantidad: ");
            ca = sc.nextInt();

            sub = pre * ca;
            totpe += sub;
            catot += ca;
            
            //Condicionales

            if (ca > camay) {
                camay = ca;
                promas = nom;
            }
        }
        
        //Salidas

        System.out.println("Producto más vendido: " + promas);
        System.out.println("Total del pedido: $" + totpe);
        
        System.out.print("Ingrese el valor pagado por el cliente: ");
        pag = sc.nextDouble();
        
        System.out.println("Cambio: $" + (pag - totpe));
    }
}

//Glosario

//co = Codigo
//ca = Cantidad
//catot = Cantodad Total
//camay = Cantidad Mayor
//pre = Precio
//totpe= Total Pedido
//sub = Subtotal
//pag = Pago
//nom = Nombre del Producto
//promas = Producto más Vendido