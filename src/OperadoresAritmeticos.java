import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class OperadoresAritmeticos {
	
	public static void main(String[]args) {
		
		//SUMA
		int i = 5, j = 4, suma = i + j;
		
		System.out.println("suma = " + suma);
		
		System.out.println("i + j = " + (i+j));
		
		
		//Resta
		int resta = i - j;
		System.out.println("resta = " + resta);
		System.out.println("(i -j)" + (i-j));
		
		
		//Multiplicacion
		int multi = i * j;
		System.out.println("multiplicacion = " + multi);
		
		
		//Division
		int div = i / j;
		float div2 = (float)i/ (float)j;
		System.out.println("div = " + div);
		System.out.println("div2 = " + div2);
		
		
		//Resto
		int resto = i % j;
		System.out.println("resto = " + resto);
		
		resto = 8 % 5;
		System.out.println("resto = " + resto);
		
		
		//Ejemplo de comparaciones de numeros pares e impares
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if(numero % 2 == 0) {
			System.out.println("Numero par = " + numero);
			
		}else {
			System.out.println("Numero impar = " + numero);
		}
			
	}

}
