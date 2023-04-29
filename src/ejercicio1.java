import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
      
      Scanner entrada = new Scanner(System.in);
      float lado;
      float superficie;

      System.out.print("ingrese el lado del cuadrado: ");
      lado = entrada.nextFloat();
      superficie = lado * lado;
      System.out.print("la superficie del cuadrado es igual: " + superficie);

    }
}
