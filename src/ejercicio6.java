import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] arg) throws Exception {
    Scanner entrada = new Scanner(System.in);

    int sueldo, horas_trabajadas, dias_trabajados, sueldo_trabajador, tiempo_trabajado;

    System.out.print("ingrese el sueldo del trabajador: ");
    sueldo_trabajador = entrada.nextInt();
    System.out.print("ingerse las horas trabajadas: ");
    horas_trabajadas = entrada . nextInt();
    System.out.print("ingrese los dias trabajados: ");
    dias_trabajados = entrada.nextInt();

    tiempo_trabajado = horas_trabajadas * dias_trabajados;
    sueldo = tiempo_trabajado * sueldo_trabajador;

    System.out.println("el sueldo del trabajador es: " + sueldo);
    

  }
}
