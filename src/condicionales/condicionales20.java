package condicionales;

import java.util.Scanner;

public class condicionales20 {
    public static void main(String[] arg)throws Exception{
        /* se ingresa por teclado tres numeros si todos los valores ingresados son menores a 10 imprimir en pantalla la leyenda "todos los numeros son menores a 10" */

        Scanner teclado = new Scanner(System.in);
        int numero1,numero2,numero3;

        System.out.print("ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        System.out.print("ingrese el tercer numero: ");
        numero3 = teclado.nextInt();

        if(numero1 < 10 && numero2 < 10 && numero3 < 10){
            System.out.println("los numeros son menores a 10");
        }
    }
    
    
    
}
