package condicionales;

import javax.swing.JOptionPane;

public class condicionales10 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacon de compruebe si dos numeros son iguales, si los numeros son iguales mostrar y calcular su promedio caso contraio si son distintos pues simplemente mostrar el amyor y menor de ellos */

        int numero1,numero2,promedio,mayor,menor;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

        if(numero1 == numero2){
            promedio = (numero1 + numero2)/2;
            System.out.println("los dos numeros son iguales");
            System.out.println("el promedio de los dos numeros es "+promedio);
        }else{
            mayor = Math.max(numero1, numero2);
            menor = Math.min(numero1,numero2);
            System.out.println("el mayor es "+mayor);
            System.out.println("menor es "+menor);
        }
    }
}
