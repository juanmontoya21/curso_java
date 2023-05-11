package condicionales;

import java.util.Scanner;

public class condicionales8 {
    public static void main(String[] arg)throws Exception{

        /* crear un sofware que calcule el mayor y menor de 5 numeros */

        int numero1,numero2,numero3,numero4,numero5;

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("ingrese el segundo numero: ");
        numero2 = teclado.nextInt(); 
        System.out.print("ingrese el tercer numero: ");
        numero3 = teclado.nextInt();
        System.out.print("ingrese el cuarto numero: ");
        numero4 =  teclado.nextInt();
        System.out.print("ingrese el quinto numero: ");
        numero5 = teclado.nextInt();

        if(numero1 > numero2){
            System.out.println("el numero1 es mayor");
        }else if(numero2 > numero3){
            System.out.println("el numero2 es mayor");
        }else if(numero3>numero4){
            System.out.println("el numero3 es mayor");
        }else if(numero4 > numero5){
            System.out.println("el numero4 es mayor");
        }else if(numero5 > numero1){
            System.out.println("el numero5 es mayor");
        }else{
           System.out.println( "todos son iguales");
        }
        
        if(numero1 < numero2){
            System.out.println("el numero1 es menor");
        }else if(numero2 < numero3){
            System.out.println("el numero2 es menor");
        }else if(numero3 < numero4){
            System.out.println("el numero3 es menor");
        }else if(numero4 < numero5){
            System.out.println("el numero4 es menor");
        }else if(numero5 < numero1){
            System.out.println("el numero5 es menor");
        }else{
           System.out.println( "todos son iguales");
        }



    }
}
