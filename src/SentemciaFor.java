/**
 * 
 */

/**
 * @author MatebookD16
 *
 */


public class SentemciaFor {
	public static  void main(String  []args) {
	
		//Ejemplo de sentencia For
		
		//Imprimimos los numero del 1 al 5 usando una sentencia "for"
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("Numero: " + i);
		}
		
		
		String [] nombres = {"Andres", "Pepe", "Maria", "Paco","Antonio", "Lalo"};
		int count = nombres.length;//Longitud de los nombres
		for(int i = 0; i < count; i++) {
			System.out.println(i + ".-" + nombres[i]);
		}
		
	}

}
