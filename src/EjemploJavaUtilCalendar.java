import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class EjemploJavaUtilCalendar {
	public static void main(String []args) {
		
		Calendar calendario = Calendar.getInstance();
		
		//Calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10)
		calendario.set(Calendar.YEAR, 2020);
		calendario.set(Calendar.MONTH, Calendar.JULY);
		calendario.set(Calendar.DAY_OF_MONTH, 25);
		
		
		calendario.set(Calendar.HOUR_OF_DAY, 21);
		calendario.set(Calendar.MINUTE, 20);
		calendario.set(Calendar.SECOND,10);
		
		Date fecha = calendario.getTime();
		System.out.println("fecha sin formato = " + fecha);
		
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
		String fechaConFormato = formato.format(fecha);
		System.out.println("fechaConFormato = " + fechaConFormato);
		
		
		
		
		
		
		
	}

}
