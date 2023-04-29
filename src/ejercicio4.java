import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] arg) throws Exception {
    Scanner entradaTeclado = new Scanner(System.in);
    int numero1, numero2;
    int suma, resta, multiplicacion, division;

    System.out.print("ingrese el primer numero: ");
    numero1 = entradaTeclado.nextInt();

    System.out.print("ingrese el segundo numero: ");
    numero2 = entradaTeclado.nextInt();

    suma = numero1 + numero2;
    resta = numero1 - numero2;
    multiplicacion = numero1 * numero2;
    division = numero1 / numero2;

    System.out.println("la suma de " + numero1 + " + " + numero2 + " = " + suma);
    System.out.println("la resta de " + numero1 + " - " + numero2 + " = " + resta);
    System.out.println("la multiplicacion de " + numero1 + " * " + numero2 + " = "+ multiplicacion);
    System.out.println("la division de " + numero1 + " / " + numero2 + " = " + division);
  }
}
