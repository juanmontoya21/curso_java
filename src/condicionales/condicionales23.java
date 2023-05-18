package condicionales;

import java.util.Scanner;

public class condicionales23 {

    public static void main(String[] arg)throws Exception{
        /* confeccionar un programa que permita cargar un numero entero positivo de hatsa 3 cifras y muestre un mensaje indicando si tiene 1, 2 o 3 cifras.. mostrar un mensaje de error si el numero de cifras es mayor */
        Scanner teclado = new Scanner(System.in);
        int numero1;

        System.out.print("ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        
        String numString = String.valueOf(numero1);

        if(numString.length() >= 4){
            System.out.print("error el numero no puede se mayor de  3 cifras");
        }else if(numString.length() == 1){
            System.out.println("el numero es menor de 1 cifras");
        }else if(numString.length() == 2){
            System.out.println("el numero es menor de 2 cifras");
        }else{
            System.out.println("el numero es menor de 3 cifras");
        }

    }
}
