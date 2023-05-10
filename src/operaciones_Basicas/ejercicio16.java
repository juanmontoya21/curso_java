package operaciones_Basicas;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] arg)throws Exception{

        /* crear una aplicacion que te pida 3 numeros por teclado, y dado a esos 3 numeros calcular su promedio y finalmente nuestra ese promedio al cubo */

        Scanner teclado = new Scanner(System.in);

        int numero1,numero2, numero3, promedio;

        System.out.print("ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        System.out.print("ingrese el tecer numero: ");
        numero3 = teclado.nextInt();

        promedio = (numero1 + numero2 + numero3)/3;

        System.out.println("el promedio es: "+ promedio);
        System.out.println("el promedio al cubo es: "+ Math.pow(promedio , 3));

    }
}
