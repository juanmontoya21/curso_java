package condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class condicionales9 {
    public static void main(String[] arg)throws Exception{
        /* crear un cajero automatico sencillo en java 1. depositar 2.retirar 3.consultar 4.salir*/

        Scanner teclado = new Scanner(System.in);
        double saldo_inicial=150000, depositar,retirar,consultar_Saldo;
        String cajero;

        System.out.println("BIENVENIDO A NUESTRO CAJERO AUTOMATICO \ndebes ingresar la operacion a realizar asi como estan escritos sin los numeros \n 1.depositar \n 2.retirar \n 3.consultar \n 4.salir ");

        cajero = JOptionPane.showInputDialog("ingrese la operacion a realizar: ");

        switch(cajero){
            case "depositar":
            System.out.print("ingrese el valor su deposito: ");
            depositar = teclado.nextDouble();

            System.out.println("su deposito fue exitoso \nsu deposito fue de "+depositar);
            System.out.println("su saldo es de "+ (depositar+saldo_inicial));
            break;

            case "retirar":
            System.out.print("ingrese el valor a retirar: ");
            retirar = teclado.nextDouble();

            if(retirar < saldo_inicial){
                System.out.println("su retiro a sido exitoso");
                System.out.println("su saldo ahora es de "+ (retirar-saldo_inicial));
            }else{
                System.out.println("no cuentas con suficiente saldo");
            }
            break;

            case "consultar":
            System.out.println("su saldo es "+saldo_inicial);
            break;

            default:
            System.out.println("acabas de salir del cajero muchas gracias por usarnos");


        }

    }
}
