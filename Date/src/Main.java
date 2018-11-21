import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		
		
		//SimpleDate format is concrete class for formatting and parsing date which inherits
		//java.text.DateFormat class
		//formating means converting date to string, and parsing means converting string to date
		
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat formatter =new SimpleDateFormat("dd/MM/yy");//M-month, m-minute
		String strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter=new SimpleDateFormat("MM/dd/yyyy");
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter=new SimpleDateFormat("MM dd yyyy");
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter=new SimpleDateFormat("dd-M-yyyy  hh:mm:ss");
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter=new SimpleDateFormat("dd MMMM  yyyy zzzz");
		strDate=formatter.format(date);
		System.out.println(strDate);
		

		formatter=new SimpleDateFormat("E,dd MMMM  yyyy zzzz");
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		//Convert String into Date
		formatter=new SimpleDateFormat("dd/MM/yyyy");
		try {
		date=formatter.parse("31/03/2015");
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
		
		
	}

}
