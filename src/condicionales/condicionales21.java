package condicionales;

import javax.swing.JOptionPane;

public class condicionales21 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacio que compruebe si un numero es par o impar */

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        if(numero % 2 !=0){
            System.out.println("el numero ingresado: "+numero+" es un numero impar");
        }else{
            System.out.println("el numero ingresado: "+numero+" es un numero par");
        }
    }
}
