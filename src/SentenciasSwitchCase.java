/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class SentenciasSwitchCase {
	public static void main(String  []args) {
		
		byte num = 6;
		
		switch(num) {
		case 0:
			System.out.println("El numero es cero");
			break;
		case 1: 
			
			System.out.println("El num es uno");
			break;
		case 2:
			
			System.out.println("El num es dos");
			break;
		case 3: 
			
			System.out.println("El num es tres");
			break;
			
		case 'b':
			System.out.println("El numero es b");
			break;
			
			default:
				System.out.println("Numero desconocido");
			
		
		}
		
		String nombre = "pepe";
		switch(nombre) {
		case "admin":
			System.out.println("Hola Admin, Bienvenido");
			break;
		
		case "andres":
			System.out.println("Hola Andres, Bienvenido");
			break;
		case "antonio":
			System.out.println("Hola Antonio, Bienvenido");
			break;
			
			default:
				System.out.println("Usuario desconocido");
		}
	}

}
