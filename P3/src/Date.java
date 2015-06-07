import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;




/**
 * Creates a class for date management
 * @author Gustavo
 *
 */
public class Date {
	
		static Calendar calendar = new GregorianCalendar();
		static int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		static int year       = calendar.get(Calendar.YEAR);
		static int month      = calendar.get(Calendar.MONTH); 
		
		
/**
 * Returns the date on the computer
 * @return date
 */
	public static String getDate(){
		
		 SimpleDateFormat dformat =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		 Date date = new Date();
			 Calendar cal = Calendar.getInstance();
		 
		String dateOut;
		dateOut = dformat.format(cal.getTime());
		
		return dateOut;
		
	}
	
	
	
	
	
}
