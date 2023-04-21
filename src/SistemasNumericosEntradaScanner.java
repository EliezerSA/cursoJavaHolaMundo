import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class SistemasNumericosEntradaScanner {
	public static void main(String []args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		String numeroStr = scanner.nextLine();
		int numeroDecimal = 0;
		try {
			numeroDecimal = Integer.parseInt(numeroStr);
		}catch(NumberFormatException e) {
			System.out.println("Error debe ingresar un numero entero");
			main(args);
			System.exit(0);;
		}
		System.out.println("numeroDecimal = " + numeroDecimal);
		
		String resultadoBinario = "numero binario de " +  numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

		//Conversio sistema octal
		String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
		
		//Conversion a sistema Hexadecimal
		String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);;
		
		
		String mensaje = resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHex;
		
				
		System.out.println(mensaje);;
		
	}

}
