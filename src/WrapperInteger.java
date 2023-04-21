/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class WrapperInteger {
	public static void main(String []args) {
		//Conversion de Datos primitivos a Integer
		int intPrimitivo = 32768;
		
		Integer intObjeto = Integer.valueOf(intPrimitivo);
		Integer intObjeto2 = intPrimitivo;
		System.out.println("intObjeto = " + intObjeto);
		
		
		int num = intObjeto;
		System.out.println("num = " + num);
		int num2 = intObjeto.intValue();
		System.out.println("num2 = "+ num2 );
		
		//Comnversion de String a un tipo de valor entero
		String valorLCD = "6700";
		Integer valor = Integer.valueOf(valorLCD);
		System.out.println("valor = " + valor);
		
		
		//Conversion con jun short
		Short shortObjeto = intObjeto.shortValue();
		System.out.println("shortObjeto = " + shortObjeto);
		
		//Conversion con un byte
		//-128 a 127
		Byte byteObjeto = intObjeto.byteValue();
		System.out.println("byteObjeto = " + byteObjeto);
		
		//Conversion con Long
		Long longObjeto = intObjeto.longValue();
		System.out.println("longObjeto = " + longObjeto);
	}

}
