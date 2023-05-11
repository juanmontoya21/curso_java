package condicionales;

import javax.swing.JOptionPane;

public class condicionales13 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que pida un caracter y dado a ese caracter comprobar si esta en minuscula o mayuscula*/

        char caracter;
        
        caracter = JOptionPane.showInputDialog("ingrese un caracter").charAt(0);

        if(caracter == Character.toUpperCase(caracter)){
            System.out.println("el caracter ingresado es mayuscula: "+ caracter);
        }else{
            System.out.println("el caracter ingresado es minuscula: "+ caracter);
        }
    }
}
