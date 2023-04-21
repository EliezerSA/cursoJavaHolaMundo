/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class OperadoresRelacionales {
	public static void main (String []args) {
		
		int a = 5;
		int b = 10;
		int c = 5;
		
		//Ejemplo de operadores relacionales
		//Comprobar si a es igual a b
		boolean igual = a == b;
		
		//Comprobar si a es diferente de b
		boolean diferente = a != b;
		
		//Comprobar si a es mayor que b
		boolean mayor = a > b;
		
		//Comprobar si a es menos que b
		boolean menor = a < b;
		
		//Comprobams si a es mayor o igual a b
		boolean mayorIgual = a >= b;
		
		//Comprobamos si a es menor o igual a b
		boolean menorIgual = a <= b;
		
		
		
		//Imprimimos el resultado obtenido
		
		System.out.println("a == b: " + igual);
		System.out.println("a != b: " + diferente);
		System.out.println("a > b: " + mayor);
		System.out.println("a < b: " + menor);
		System.out.println("a >= b: " + mayorIgual);
		System.out.println("a <= b: " + menorIgual);
	}

}
