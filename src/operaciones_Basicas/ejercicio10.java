package operaciones_Basicas;
import java.util.Scanner;

public class ejercicio10 {
    public static void main (String[] arg)throws Exception{
        /*crear una aplicacion que calcule el area de un trapecio */

        Scanner teclado = new Scanner(System.in);
        float altura_trapecio=0, base_menor=0,base_Mayor=0,area_Trapecio=0;

        System.out.print("ingerse la altura  del trapecio: ");
        altura_trapecio =teclado.nextFloat();
        System.out.print("ingerse la base menor del trapecio: ");
        base_menor = teclado.nextFloat();
        System.out.print("ingrese la base mayor del trapecio: ");
        base_Mayor =  teclado.nextFloat();

        area_Trapecio = (altura_trapecio*(base_Mayor * base_menor))/2;
        System.out.print("el area del trapecio es: "+area_Trapecio);
        

        


    }
}
