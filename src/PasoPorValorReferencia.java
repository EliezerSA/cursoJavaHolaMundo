/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class PasoPorValorReferencia {
	public static void main (String[]args) {
		
		int numero = 10;
		System.out.println("Antes de llamar al metodo: " + numero);
		modificarNumero(numero);{
		System.out.println("Despues de llamar al metodo: " + numero);
		
	}
}
	
	public static void modificarNumero(int numero){
		
		System.out.println("Dentro del metodo: " + numero);
		numero = 20;
		System.out.println("Despues de modificar: " + numero);
	
	}

}
