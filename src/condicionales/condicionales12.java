package condicionales;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;

public class condicionales12 {
    public static void main(String[] arg)throws Exception{
        /* crar un sofware que renga un menu de opciones:
         * 1. calcular el area de un triangulo 
         * 2. calcular el area de un circulo  
         * 3. calcular el area de un trapecio
         * 4. calcular el area de un cuadrado
         * 5. salir
         * 
         */

         double area, radio,altura_trapecio,base_menor,base_Mayor,lado_cuadrado,base_triangulo,altura_triangulo;
         String calcular_area;

        JOptionPane.showMessageDialog(null,"para acceder al a cada calculo escriba el nombre el calculo tal como esta en el menu");
         calcular_area = JOptionPane.showInputDialog("bienvenido al menu de calcular el area de los siguiente objetos : \n triangulo \n circulo \n trapecio \n cuadrado \n salir");

         switch(calcular_area){
            case "triangulo":
                altura_triangulo = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del triangulo:"));
                base_triangulo = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del triangulo:"));
                area = (altura_triangulo * base_triangulo)/2;
                JOptionPane.showMessageDialog(null,"el area del triangulo es "+area);
                break;
            case "circulo":
                radio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio del circulo:"));
                area = Math.PI * (Math.pow(radio,2));
                JOptionPane.showMessageDialog(null,"el area del circulo es "+area);
                break;
            case "trapecio":
            altura_trapecio = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del trapecio:"));
            base_menor = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base menor del trapecio:"));
            base_Mayor = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base mayor del trapecio:"));

            area = (altura_trapecio*(base_menor * base_Mayor))/2;
            JOptionPane.showMessageDialog(null,"el area del trapecio es "+area);
            break;

            case "cuadrado":
            lado_cuadrado = Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado del cuadrado:"));

            area = lado_cuadrado * lado_cuadrado;
            JOptionPane.showMessageDialog(null,"el area del cuadrado es "+area);
            break;

            case "salir":
            JOptionPane.showMessageDialog(null,"usted acaba de salir de la calculador");
            break;

            default:
            JOptionPane.showMessageDialog(null,"la opcion ingresada no existe");
            break;

         }

    }
}
