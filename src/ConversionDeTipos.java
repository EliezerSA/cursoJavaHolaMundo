/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class ConversionDeTipos {
	public static void main(String [] args) {
		
		String numeroStr = "50";
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " + numeroInt);
		
		
		String realStr = "98765.43";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		
		String logicoStr = "false";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("logicoBoolean = " + logicoBoolean);
		
		
		int otroNumeroInt = 100;
		
		System.out.println("otroNumeroInt" + otroNumeroInt);
		
		String otroNumeroStr = Integer.toString(otroNumeroInt);
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		
	}

}
