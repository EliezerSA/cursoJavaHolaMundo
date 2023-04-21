/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class PrimitivosCaracteres {
	public static void main(String []args) {
		
		
		char caracter = '\u0040';
		char decimal = 64;
		System.out.println("caracter = " + caracter);
		System.out.println("caracter = " + decimal);
		System.out.println("decimal = caracter: " + (decimal == caracter));
		
		char simbolo = '@';

		System.out.println("siumbolo = " + simbolo);
		System.out.println("simbolo = caracter: " + (simbolo == caracter));
		
		
		System.out.println("tipo char corresponde en byte a  = " + Character.BYTES);
		System.out.println("tipo char corresponde en bites a = " + Character.SIZE);
		System.out.println("valor maximo de un char  = " + Character.MAX_VALUE);
		System.out.println("valor minimo de un char  = " + Character.MIN_VALUE);
		
		
		
		
		
		char espacio = '\u0020';
		char retroceso = '\b';
		char tabualdor = '\t';
		char nuevaLinea = '\n';
		char retornoCarro = '\r';
		
		System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
		System.out.println("char corresponde en bites a = " + Character.SIZE);
		System.out.println("valor maximo de un char  = " + Character.MAX_VALUE);
		System.out.println("valor minimo de un char  = " + Character.MIN_VALUE);
		
		
		
		
	}

}
