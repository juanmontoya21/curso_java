import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] arg) throws Exception {

    Scanner teclado = new Scanner(System.in);
    float base_triangulo, altura_triangulo, area_triangulo;

    System.out.print("ingrese la base del triangulo: ");
    base_triangulo = teclado.nextFloat();
    System.out.print("ingrese la base del triangulo: ");
    altura_triangulo = teclado.nextFloat();

    area_triangulo = (base_triangulo * altura_triangulo) / 2;
    System.out.println("el area del triangulo es: "+area_triangulo);
  }
}
