import javax.swing.JOptionPane;

public class ejercicio11 {
    public static void main(String[] arg)throws Exception{
        /*crear una aplicacion que nos pida dos caracteres por teclado y dados esos dos caracteres sumarlos y mostrarlos */

        
        char caracter1,caracter2;
        String suma_caracteres = "";
        caracter1 = JOptionPane.showInputDialog("digite el primer caracter: ").charAt(0);
        caracter2 = JOptionPane.showInputDialog("digite el segundo caracter: ").charAt(0);

        suma_caracteres += caracter1 + caracter2;

        System.out.print("la suma de caracteres es: " + suma_caracteres);
        
    }
}
