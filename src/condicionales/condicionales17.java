package condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class condicionales17 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion si un numero es multiplo de 3 o de 5 */

        Scanner teclado = new Scanner(System.in);
        int numero_multiplo;

        numero_multiplo = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        if(numero_multiplo % 3 == 0 && numero_multiplo % 5 == 0){
            System.out.println("el "+numero_multiplo+" es multiplo de 5 y de 3");
        }else if(numero_multiplo % 5 == 0){
            System.out.println("el "+ numero_multiplo +" es multiplo de 5");
        }else if(numero_multiplo % 3 == 0){
            System.out.println("el "+ numero_multiplo +" es multiplo de 3");
        }else{
            System.out.println("el "+ numero_multiplo +" no es multiplo de 3 y de 5");
        }
    }
}
