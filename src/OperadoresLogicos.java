/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class OperadoresLogicos {
	
	public static void main(String[]args) {
		
		boolean a = true;
		boolean b = false;
		
		
		//Ejemplo de operadores logicos
		boolean resultado1 = a && b; //Comprobar si a y b son veradaderos
		boolean resultado2 = a || b; //Comprobar si a o b son veraderos
		boolean resultado3 = !a; //Comprobar si a es falso(NOT logico)
		
		
		//Imroimir resultados
		System.out.println("a && b: " + resultado1);
		System.out.println("a || b: " + resultado2);
		System.out.println("!a: " + resultado3);
	}

}
