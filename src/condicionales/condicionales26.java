package condicionales;

import java.util.Scanner;

public class condicionales26 {
    public static void main(String[] arg) throws Exception {
        /* pedir tres numeros y ordenarlos de mayor a menor */

        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        System.out.print("ingrese el tecer numero: ");
        numero3 = teclado.nextInt();




        if(numero1 > numero2 && numero2 > numero3){
            System.out.println(numero1+">"+numero2+">"+numero3);
        }else if(numero1 > numero2 && numero2 < numero3){
            System.out.println(numero1+">"+numero3+">"+numero2);
        }else if(numero2 > numero1 && numero1 > numero3){
            System.out.println(numero2+">"+numero1+">"+numero3);
        }
        //else if(numero2 > numero1 && numero3 > numero1){
            //System.out.println(numero2+">"+numero3+">"+numero1);
        //}

        // if(numero1 < numero2 && numero1 < numero3){
        //     System.out.println(numero3+">"+numero2+">"+numero1);
        // }else if (numero1 > numero2 && numero2 > numero3) {
        //     System.out.println(numero1 + ">" + numero2 + ">" + numero3);
        // }else if(numero1 > numero2 && numero2 < numero3){
        //     System.out.println(numero1 + ">" + numero3 + ">" + numero2);
        // }else if(numero2 > numero1 && numero3 > numero1){
        //     System.out.println(numero2 + ">" + numero3 +">" +numero1);
        // }else if(numero2 > numero1 && numero3 < numero1){
        //     System.out.println(numero2 +">"+numero1+">"+numero3);
        // }else if(numero3 > numero2 && numero2 > numero1){
        //     System.out.println(numero3+">"+numero2+">"+numero1);
        // }else if(numero3 > numero2 && numero2 < numero1){
        //     System.out.println(numero3+">"+numero1+">"+numero2);
        // }else if(numero1 < numero2 && numero1 < numero3){
        //     System.out.println(numero3 + ">" + numero2 + ">" + numero1);
        // }else{
        //     System.out.println("todos iguales");
        // }

    }
}
