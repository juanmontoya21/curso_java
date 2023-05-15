package condicionales;
import javax.swing.JOptionPane;

public class condicionales18 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion si un numero es multiplo de 3 y a la vez de 5 */
        
        int numero_multiplo;

        numero_multiplo = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        if(numero_multiplo % 3 == 0 && numero_multiplo % 5 == 0){
            System.out.println("el "+numero_multiplo+" es multiplo de 5 y de 3");
        }else{
            System.out.println("el "+numero_multiplo+" no es multiplo de 5 y de 3");
        }
    }
}
