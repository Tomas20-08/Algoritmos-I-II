

//Pedir login y usuario en donde el número máximo de intentos para ingresar a un sistema 
//sea de 4, imprimir un mensaje si se  puede acceder, cuando usuario y contraseña, sean 
//correctas, si nó indicar que no se puede acceder al sistema. 


package TallerAlgoritmosCorte2;

import java.util.Scanner;

public class Ejercicio02_UserLoginIntentos_ {

    public static void main(String[] args) {
        
        //Scanner

        Scanner scanner = new Scanner(System.in);
        
        //Variables
        
        int x = 4;
        String login,user;
        String correctuser = "user";
        String correctlogin = "login";
        
        //Ciclo (While)
        
        while(x>0){
            
        //Entradas
           
        System.out.println("Type user");
        user = scanner.next();
        System.out.println("Type login");
        login = scanner.next();
        
        //Condicionales & Salidas
        
        if (user.equals(correctuser) && login.equals(correctlogin)){
            System.out.println("Correct: initializing");
            
            return;
            
        } else {
            
            x = x-1;
            
            System.out.println("Intorrect: "+x+" reamining attemps");

        }
        
        }
        
        if(x<=0){
            System.out.println("can´t access the system");
        }
       
    }
    
}

//Glosario

//user = Usuario
//login = Contraseña
//x = Cantidad de intentos disponibles