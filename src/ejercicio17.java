import javax.swing.JOptionPane;

public class ejercicio17 {
    public static void main(String[] arg)throws Exception{

        /* crear una aplicacion que halle el amyor de dos numeros usando la clase math */

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingerse el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));

        JOptionPane.showMessageDialog(null,"el numero mas grande es: " +Math.max(numero1, numero2));

    }   
}
