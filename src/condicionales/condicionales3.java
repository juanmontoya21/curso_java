package condicionales;
import javax.swing.JOptionPane;

public class condicionales3 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que calcule el mayor de tres numeros */

        int numero1, numero2,numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese le tercer numero: "));

        if(numero1 > numero2){
            System.out.println("numero1: "+numero1+" es mayor a numero2: "+ numero2 +" y numro3: "+numero3);
        }else if(numero2 > numero3 ){
            System.out.println("numero2: "+numero2+" es mayor a numero1: "+ numero1 +" y numro3: "+numero3);
        }else if(numero3 > numero2){
            System.out.println("numero3: "+numero3+" es mayor a numero1: "+ numero1 +" y numero2: "+numero2);
        }else{
            System.out.println("todos son iguales");
        }
    }
}
