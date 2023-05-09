import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que calcule la edad de una persona, para calcular su edad necesitaremos su fecha de nacimiento y la fecha actuall */

        Scanner teclado = new Scanner(System.in);
        int fecha_nacimiento, fecha_Actual, edad ;
        
        System.out.print("digite la fecha actual: ");
        fecha_Actual = teclado.nextInt();

        System.out.print("ingrese la fecha de nacimiento: ");
        fecha_nacimiento = teclado.nextInt();

        edad = fecha_Actual -fecha_nacimiento;
        System.out.println("la edad que tiene es  "+edad);
    }
}
