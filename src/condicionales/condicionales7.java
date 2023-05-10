package condicionales;

import javax.swing.JOptionPane;

public class condicionales7 {
    public static void main(String[] arg)throws Exception{
        /* cerar una calculadora aritmetica en Java:
            1. Sumar
            2. Restar
            3.Multiplicar 
            4. Dividir
            5. Raiz cuadrada
            6. Raiz Cubica
            7. elevar exponente
            8. hallar su porcentaje
            9.salir 
        */

        String operaciones;
        double calcular, operador1,operador2;

        operaciones = JOptionPane.showInputDialog("ingrese una operacion arirmetica");

        switch (operaciones) {
            case "suma":
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un el primer numero: "));
                operador2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un el segundo numero: "));
                calcular = operador1 + operador2;
                System.out.println("la suma "+ operador1 +" + "+ operador2+" = " + calcular);
                break;
            case "resta":
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese  el primer numero: "));
                operador2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese  el segundo numero: "));
                calcular = operador1 - operador2;
                System.out.println("la resta "+ operador1 +" - "+ operador2+" = " + calcular);
                break;
            case "multiplicar":
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un el primer numero: "));
                operador2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un el segundo numero: "));
                calcular = operador1 * operador2;
                System.out.println("la multiplicacion "+ operador1 +" * "+ operador2+" = " + calcular);
                break;
            case "dividir":
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el dividendo: "));
                operador2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el divisor: "));
                calcular = operador1 / operador2;
                if(operador2 == 0){
                    System.out.println("no se puede dividir por 0");
                }else{
                    System.out.println("la suma "+ operador1 +" - "+ operador2+" = " + calcular);
                }
                break;
            case "raiz cuadrada": 
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un el primer numero: "));
                calcular = Math.sqrt(operador1);
                System.out.println("la raiz cuadrada de "+operador1+" es " +calcular);
                break;
            case "raiz cubica": 
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un el primer numero: "));
                
                calcular = Math.cbrt(operador1);
                System.out.println("la raiz cubica de "+operador1+" es " +calcular);
                break;
            case "potencia":
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base: "));
                operador2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el exponente: "));
                calcular = Math.pow(operador1, operador2);
                System.out.println("la potencia "+operador1+"^"+operador2+"="+calcular);
                break;
            case "porcentaje":
                operador1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el  numero: "));
                operador2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el porcentaje: "));
                calcular = operador1 * (operador2 / 100);
                System.out.println("el poncentaje "+operador1+"*("+operador2+"/100)="+calcular);
                break;
            default:
                System.out.println("acabas de salir de la calculadora");
                break;
        }


    }
}
