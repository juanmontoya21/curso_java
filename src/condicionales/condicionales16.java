package condicionales;

import java.util.Scanner;

public class condicionales16 {
    public static void main(String[] arg)throws Exception{
        Scanner teclado = new Scanner(System.in);
    
        int numero_multiplo;

        System.out.print("ingrese un numero: ");
        numero_multiplo = teclado.nextInt();

        if(numero_multiplo % 3 == 0){
            System.out.print("el "+ numero_multiplo+" es multiplo de 3" );
        }else{
            System.out.println("el "+numero_multiplo+" no es multiplo de 3");
        }
    }
}
