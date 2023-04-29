import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] arg) throws Exception {
    
    Scanner entradaTeclado = new Scanner(System.in);
    int numero1, numero2, numero3,suma;

    System.out.print("ingrese el primer numero: ");
    numero1 = entradaTeclado.nextInt();

    System.out.print("ingerese el segundo numero: ");
    numero2 = entradaTeclado.nextInt();

    System.out.print("ingrese el tercer numero: ");
    numero3 = entradaTeclado.nextInt();

    suma = numero1 + numero2 + numero3;

    System.out.println("la suma de "+ numero1+" + "+numero2+" + "+ numero3 + " = "+ suma);
  }
}
