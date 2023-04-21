import java.util.Scanner;

/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class OperadoresLogicosLoginArreglos {
	public static void main(String []args) {
		//Primer forma de estructura de datos
		/**String[] usernames = new String[3];
		String[] passwords = new String[3];
		
		usernames[0] = "antonio";
		passwords[0] = "123";
		
		usernames[1] = "admin";
		passwords[1] = "1234";
		
		usernames[2] = "pedro";
		passwords[2] = "12345";**/
		
		//Segunda forma de estructura de datos
		String[] usernames = {"antonio", "admin", "pedro"};
		String[] passwords = {"123", "1234", "12345"};
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el username");
		
		String u = scanner.next();
		
		System.out.println("Ingrese el password");
		String p = scanner.next();
		
		boolean esAutenticado = false;
		
		for(int i=0; i < usernames.length; i++) {
			//Modo de validacion con operador ternario
		esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;
			
		
		//Modo sentencia if
			/*if((usernames[i].equals(u) && passwords[i].equals(p))){
			esAutenticado = true;
			break;
		}*/
		
	}
		String mensaje = esAutenticado ? "Bienvenido Usuario".concat(u).concat("!"):
			"Username contraseña incorrectos!\nLo sentimos, requiere de autenticacion";
		System.out.println("mensaje = " + mensaje);
		
		
		/*if(esAutenticado) {
			System.out.println("Bienvenido usuario: ".concat(u).concat("!"));
			
		}else {
			System.out.println("Username o contraseña incorrectos!");
			System.out.println("Lo siento, requiere autenticacion");
		}*/
	}

}
