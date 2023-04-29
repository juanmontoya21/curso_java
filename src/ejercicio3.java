import java.lang.invoke.LambdaConversionException;
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] arg) throws Exception {
    Scanner entradaTeclado = new Scanner(System.in);
    double lado, perimetro;

    System.out.print("escriba el lado del cuadrado: ");
    lado = entradaTeclado.nextDouble();

    perimetro = lado*4;
    System.out.println("el perimetro del cuadrado es: " + perimetro);


    }
}
