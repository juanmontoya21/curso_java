package condicionales;
import javax.swing.JOptionPane;

public class condicionales4 {
    public static void main(String[] arg)throws Exception{
        /* crear un sofware que ingrese el sueldo de un empleado y si el sueldo es mayor o igaul a 300 nos daran un aumento del 1500 soles, caso contrario que diga simplemente mostrar un mensaje que diga tu sueldo tiene que estar en el promedio de 3000 soles */

        int sueldo_empleado;

        sueldo_empleado = Integer.parseInt(JOptionPane.showInputDialog("ingrese su sueldo por favor: "));

        if(sueldo_empleado >= 3000){
            System.out.println("tu sueldo es de " + sueldo_empleado+" soles, tienes un aumento de 1500 soles");
            System.out.println("tu sueldo con el aumento es de " + (sueldo_empleado+1500) + " soles");
        }else{
            System.out.println("tu sueldo tiene que estar en el promedio de 3000 soles");
        }
    }
}
