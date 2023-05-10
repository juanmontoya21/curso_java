package condicionales;
import javax.swing.JOptionPane;

public class condicionales5 {
    public static void main(String[] arg)throws Exception{
        /* crear un sofware que dado a un numero comprobar si ese numero es positivo, negativo o cero */
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));


        if(numero > 0){
            System.out.println("el numero es positivo");
        }else if(numero < 0){
            System.out.println("el numero es negativo");
        }else{
            System.out.println("es cero");
        }
    }

    


    
}
