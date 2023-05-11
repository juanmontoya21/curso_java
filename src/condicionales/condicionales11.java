package condicionales;

import java.util.Scanner;

public class condicionales11 {
    public static void main(String[] arg)throws Exception{
        /*comprobar si dos palabras son iguales */

        Scanner teclado = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.print("ingrese la primer palabra: ");
        palabra1=teclado.next();
        System.out.print("ingrese la segunda palabra: ");
        palabra2=teclado.next();

        if(palabra1.equals(palabra2)){
            System.out.println("lo ingresado son iguales");
        }else{
            System.out.println("lo ingresado no son iguale");
        }
    }
}
