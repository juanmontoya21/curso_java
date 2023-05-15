package condicionales;

import javax.swing.JOptionPane;

public class condicionales19 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que nos pida dos cadenas y calcular su longitud , por ultmo mostar la mayor y la menor longitud de las cadenas */

        String cadena1,cadena2;

        cadena1 = JOptionPane.showInputDialog("ingrese la primera cadena: ");
        cadena2 = JOptionPane.showInputDialog("ingrese la segunda cadena: ");

        if(cadena1.length() > cadena2.length()){
            System.out.println("la cadena1: " +cadena1+" es mayor a la cadena2: "+cadena2);
        }else if(cadena1.length() < cadena2.length()){
            System.out.println("la cadena2: " +cadena2+" es mayor a la cadena1: "+cadena1);
        }else{
            System.out.println("la cadena2: " +cadena2+" es igual a la cadena1: "+cadena1);
        }

    }
}
