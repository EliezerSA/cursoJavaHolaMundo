/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class SentenciaIfElse {
	public static void main(String  []args) {
		
		
		float promedio = 7.0f;
		
		if(promedio >= 6.5) {
			
			System.out.println("Felicitaciones, excelente promedio");
			
		}else if(promedio >= 6.0){
			
			System.out.println("Muy buen promedio");
			
		}else if(promedio >= 5.5) {
			System.out.println("Buen promedio!");
		
		}else if(promedio >= 5.0) {
			System.out.println("Regular, necesitas esforzarte un poco mas");
		
		}else if(promedio >= 4.0) {
			System.out.println("Insuficiente, necesitas estudiar  mas");
		
		}else {
			System.out.println("Lo siento mucho, has reprobado");
		}
		
		System.out.println("Tu promedio es: " + promedio);
		//Copnvertr a operador ternario la estructura de la senetencia if/else
		
	}

}
