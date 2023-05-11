package condicionales;

import javax.swing.JOptionPane;

public class condicionales14 {
    public static void main(String[] arg)throws Exception{
        /* crear una aplicacion que pida 3 caracteres y dado esos caracteres tendras que sumarlos te puedes guiar de la tabla ASCII y por ultimo si la suma de los caracteres es mayor o igual 100 pues mostrar un mensaje : "suma perfecta " caso contrario "suma inperfecta" */

        char caracter1,caracter2,caracter3;
        int suma_caracter;

        caracter1 = JOptionPane.showInputDialog("ingrese el primer caracter: ").charAt(0);
        caracter2 = JOptionPane.showInputDialog("ingrese el segundo caracter: ").charAt(0);
        caracter3 = JOptionPane.showInputDialog("ingrese el tercer caracter: ").charAt(0);

        suma_caracter = caracter1 + caracter2 + caracter3;

        if(suma_caracter >= 100){ 
            System.out.print("su puntuacion es perfecta: "+suma_caracter);
        }else{
            System.out.println("su puntuacion es inperfecta: "+suma_caracter);
        }



    }
}
