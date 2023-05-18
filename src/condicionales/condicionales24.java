package condicionales;

import java.util.Scanner;

public class condicionales24 {
    public static void main(String[] arg)throws Exception{
        /* de un operario se conoce su sueldo y los años de antiguedad. se pide confeccionar un programa que lea los datos de entrada e informe:
         * a) si el sueldo es inferrior a 500 y su antifuedad es igual o superior a 10 años otorgarle un aumento del 20% mostrar el suledo a pagar
         * 
         * b) si el suledo es inferiora 500 pero su antiguedad es menor a 10 años otorgarle un aumento del 5%
         * 
         */

        Scanner teclado = new Scanner(System.in);
        int sueldo_operario,años_operados;

        System.out.print("ingrese su sueldo por favor: ");
        sueldo_operario = teclado.nextInt();
        System.out.print("ingrese la cantidad de años trabajados: ");
        años_operados = teclado.nextInt();

        if(sueldo_operario <= 500 && años_operados >= 10){
            System.out.print("su sueldo es de: "+(sueldo_operario * 20));
        }else if(sueldo_operario <= 500 && años_operados < 10){
            System.out.print("su sueldo es de: "+(sueldo_operario * 5));
        }else{
            System.out.println("su sueldo es " + sueldo_operario);
        }


    }
}
