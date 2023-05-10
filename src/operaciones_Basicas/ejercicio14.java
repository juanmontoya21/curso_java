package operaciones_Basicas;
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que calcule el area de un circulo */

        Scanner teclado = new Scanner(System.in);
        float radio;
        double area;
        

        System.out.print("ingrese el radio del circulo: ");
        radio = teclado.nextFloat();

        area = Math.PI * (Math.pow(radio, 2));

        System.out.print("el area del circulo es: " + area);

        
    }
}
