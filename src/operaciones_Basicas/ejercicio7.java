package operaciones_Basicas;
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] arg) throws Exception {
    Scanner teclado = new Scanner(System.in);
    float nota1, nota2, nota3, nota4, nota5, promedio;


    System.out.print("ingrese la primera nota: ");
    nota1 = teclado.nextFloat();
    System.out.print("ingrese la segunda nota: ");
    nota2 = teclado.nextFloat();
    System.out.print("ingrese la tecer nota:  ");
    nota3 = teclado.nextFloat();
    System.out.print("ingrese la cuarta nota: ");
    nota4 = teclado.nextFloat();
    System.out.print("ingrese la quinta nota: ");
    nota5 = teclado.nextFloat();

    promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

    System.out.print("el promedio del estudiante es: "+promedio);
  }
}
