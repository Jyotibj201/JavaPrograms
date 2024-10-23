package JavaPrograms;

import java.util.Date;

public class GetCurrentDateCode {

	public static void main(String[] args) {
		Date dt=new Date();
//		String Idate=dt.toString();
//		String date=Idate.replace(' ', '_');
		String Idate=dt.toString().replace(' ', '_');
		System.out.println(Idate);
	}

}
