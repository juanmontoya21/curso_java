package condicionales;

import java.util.Scanner;

public class condicionales22 {
    public static void main(String[] arg)throws Exception{
        /* realizar un programa que pida cargar una fecha cualquiera, luego verificar s dicha fecha corresponde a navidad */
   
        // Solicitar al usuario ingresar una fecha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha (dd/mm/aaaa): ");
        String fechaIngresada = scanner.nextLine();
        
        // Verificar si la fecha ingresada es Navidad
        if (esNavidad(fechaIngresada)) {
            System.out.println("La fecha ingresada corresponde a la Navidad.");
        } else {
            System.out.println("La fecha ingresada NO corresponde a la Navidad.");
        }
    }
    
    public static boolean esNavidad(String fecha) {
        // Dividir la fecha en día, mes y año
        String[] partesFecha = fecha.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        
        // Verificar si la fecha corresponde a la Navidad (25 de diciembre)
        if (mes == 12 && dia == 25) {
            return true;
        } else {
            return false;
        }
    }
}


        

