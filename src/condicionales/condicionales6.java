package condicionales;
import java.util.Scanner;

public class condicionales6 {
    public static void main(String[] arg)throws Exception{
        /* confeciionar un programa qu epida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos mensajes 
         si el promedio es >=7 mostrar "promocionado"
         si el promedio es >=4 y <7 mostrar "regular"
          si el promedio es <4 mostrar "regular"
        */

        float nota1, nota2,nota3, promedio;

        Scanner teclado = new Scanner(System.in);        

        System.out.print("ingrese la primera nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("ingrese la segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("ingrese la tercer nota: ");
        nota3 = teclado.nextFloat();

        promedio = (nota1 + nota2 + nota3)/3;

        if(promedio >= 7){
            System.out.println("Promocionado");
        }else if(promedio >= 4 && promedio < 7){
            System.out.println("regular");
        }else{
            System.out.println("reprobado");
        }
    }
}
