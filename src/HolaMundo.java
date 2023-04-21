/**
 * 
 */

/**
 * @author Ezequiel
 * Clase de muestra de Java
 *
 */
public class HolaMundo {
	 public static void main(String []args){
		 
		
	        String saludar = "Hola Curso desde Java";
	        System.out.println(saludar);
	        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
	        
	        
	        int numero = 11;
	        boolean valor = true;
	        int numero2 = 5;
	        
	        if(valor) {
	        	System.out.println("numero = " + numero );
	        	numero2  = 10;
	        }
	        System.out.println("numero = " + numero2);
	        
	        //JDK 10 +
	        var numero3 = "15";
	        
	        //Reglas
	        
	        String nombre;
	        
	        nombre = "Ezequiel";
	        
	        if(numero >10) {
	        	nombre = "Juan";
	        }
	        System.out.println("nombre = " + nombre);
	        
	        /*
	         * No se pueden inicializar variables con palabras propias del jdk
	        int if = 5;
	        int 2abc = 5;
	        int e5b_$TMCcd = 5;
	        **/
	        
	        //Este es un comentario
	       

	    }

}
