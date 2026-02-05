       
//Codificar en java un algoritmo que permita que un usuario digite precios de productos sin 
//que se pase de un presupuesto dado por el cliente, imprimir el número de productos que 
//se han podido pagar. 

package TallerAlgoritmosCorte2;

    import java.util.Scanner;

        public class Ejercicio10_PresupuestoCantidadProductos_ {

            public static void main(String[] args) {
                
                //Scanner
                
                Scanner scanner = new Scanner(System.in);
                
                //Variables

                int cont = 0;
                double pre,cos;
                
                //Entradas

                System.out.println("Digite el Presupuesto");
                pre = scanner.nextDouble();
                
                //Ciclo (While)

                while(pre > 0){

                     System.out.println("Digite el precio del producto "+ (cont+1) +" a comprar (COP)");
                     cos = scanner.nextDouble();
                     
                     //Condionales

                      if (cos > pre) {
                        System.out.println("No alcanza el presupuesto restante de COP " + pre);
                        break;
                      }
                      
                      //Procesos
                      
                    pre -= cos;
                    cont++;
                    
                    //Condición Lógica
                    
                     if (pre == 0) {
                System.out.println("No hay mas presupuesto.");
                break;
                     }
                }
                
                //Salida

                System.out.println("La cantidad de productos que se puedieron pagar fue de: "+cont);

            }
        }

        //Glosario

        //cont = Contador
        //pre = Presupuesto
        //cos = Costo (Precio)