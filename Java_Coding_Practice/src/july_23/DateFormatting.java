package july_23;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);

		SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
		String strDate1 = formatter1.format(date);
		System.out.println(strDate1);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String strDate2 = formatter2.format(date);
		System.out.println(strDate2);
	}

}
