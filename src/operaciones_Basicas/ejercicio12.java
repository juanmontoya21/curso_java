package operaciones_Basicas;
import javax.swing.JOptionPane;

public class ejercicio12 {
    public static void main(String[] arg) throws Exception{
        
        /* crear una aplicacion que nos pida 2 cadenas(String) por teclado y de dichas cadenas mostrar su combinacion o suma por pantalla */

        String cadena_1,cadena_2,suma_cadena;


        cadena_1 = JOptionPane.showInputDialog("ingrese la primera cadena: ");
        cadena_2 = JOptionPane.showInputDialog("ingrese la segunda cadena: ");

        suma_cadena = cadena_1 +" " + cadena_2;

        System.out.println(suma_cadena);
    }
}
