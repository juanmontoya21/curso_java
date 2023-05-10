package condicionales;
import java.util.Scanner;


public class condicionales2 {

    public static void main(String[] arg)throws Exception{
        /* crear un sofware que calcule el promedio de un alumno de 3 notas y si el promedio es mayor a 15 pues el alumno esta aprobado caso contrario estara desaprobado */

        Scanner teclado = new Scanner(System.in);
        float nota1,nota2,nota3,promedio;

        System.out.print("ingrese la primera nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("ingrese la segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("ingrese la segunda nota: ");
        nota3 = teclado.nextFloat();

        promedio = (nota1 + nota2 + nota3)/3;

        System.out.println("el promedio del alumno es: " + promedio);

        if(promedio >= 3.0){
         System.out.println("APROBASTE");   
        }else{
            System.out.println("NO APROBASTE");
        }




    
    }
   
    


}
