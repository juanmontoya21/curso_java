package condicionales;

import java.util.Scanner;

public class condicionales25 {
    public static void main(String[] arg)throws Exception{
        /* crear un programa  que pida un caracter y dado a ese caracter poder convertirlo a mayuscula o minuscula 
         * 
         * 1. convertir a mayuscula
         * 2. convertir a minuscula
        */

        Scanner teclado = new Scanner(System.in);
        char caracter;

        System.out.print("ingrese un caracter: ");
        caracter = teclado.next().charAt(0);

        if(caracter == Character.toUpperCase(caracter)){
            System.out.println("el caracter es mayuscula");
        }else if(caracter == Character.toLowerCase(caracter)){
            System.out.println("el caracter es minuscula");
        }else{
            System.out.println("no es minuscula y mayuscula");
        }
    }
}
