package operaciones_Basicas;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que calcule la raiz cuadrada de un numero */

        Scanner teclado = new Scanner(System.in);

        double numero_raiz=0;

        System.out.print("ingrese un numero: ");
        numero_raiz = teclado.nextDouble();

        System.out.println("la raiz cuadrada es: " + Math.sqrt(numero_raiz));
    }
}
