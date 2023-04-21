import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class SistemasNumericos {
	public static void main(String []args){
		
		String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
		int numeroDecimal = 0;
		try {
			numeroDecimal = Integer.parseInt(numeroStr);
		}catch(NumberFormatException e) {
			JOptionPane.showConfirmDialog(null, "Error debe ingresar un numero entero");
			main(args);
			System.exit(0);;
		}
		System.out.println("numeroDecimal = " + numeroDecimal);
		
		String resultadoBinario = "numero binario de " +  numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
		System.out.println(resultadoBinario);
		//Conversion a sistema binario
		
		int  numeroBinario = 0b111110100;
		System.out.println("numeroBinario = " + numeroBinario );
		
		
		//Conversio sistema octal
		String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
		System.out.println(resultadoOctal);
		int numeroOctal = 0764;
		System.out.println("numeroOctal = " + numeroOctal);
		
		//Conversion a sistema Hexadecimal
		String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);;
		System.out.println(resultadoHex);
		int numeroHex = 0x1f4;
		System.out.println("numeroHex = " + numeroHex);
		
		
		String mensaje = resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHex;
		
				
		JOptionPane.showMessageDialog(null, mensaje);
		
	}

}
