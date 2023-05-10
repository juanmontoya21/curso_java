package condicionales;
import javax.swing.JOptionPane;

public class condicionales1 {
    public static void main(String[] arg)throws Exception{
        /* crear un sofware que calcule el amyor de dos numeros */

        int numero1,numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));

        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null,"el numero1: "+numero1+ " es mayor a numero2: "+numero2);
        }else{
            JOptionPane.showMessageDialog(null,"el numero2: "+numero2+ " es mayor a numero1: "+numero1);
        }
    }
}
