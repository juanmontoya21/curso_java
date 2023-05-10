package operaciones_Basicas;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] arg)throws Exception{
        /* se debe desarrollar un programa que pida el ingreso de un articulo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador */

        Scanner teclado = new Scanner(System.in);
        double precio_Articulo, valor_Articulo;
        int cantidad_Articulo;

        System.out.print("ingrese el precio del articulo: ");
        precio_Articulo = teclado.nextDouble();

        System.out.print("ingrese la cantidad de articulos: ");
        cantidad_Articulo = teclado.nextInt();

        valor_Articulo = precio_Articulo * cantidad_Articulo;

        System.out.println("el precio de articulo es " + precio_Articulo + " ,la cantidad a llevar es " + cantidad_Articulo + " y el valor total a pagar es " + valor_Articulo);
    }
}
