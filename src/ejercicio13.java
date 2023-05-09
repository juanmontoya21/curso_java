import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Parser;

public class ejercicio13 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que calcule una potencia */

        int base_potencia,exponente;

        base_potencia = Integer.parseInt(JOptionPane.showInputDialog("ingrese la base de la potencia: "));
        exponente = Integer.parseInt(JOptionPane.showInputDialog("ingrese el exponente de la potencia: "));

        System.out.print(base_potencia +" ^ " + exponente +" = " + Math.round(Math.pow(base_potencia, exponente)));
    }
}
