package huawei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exam2 {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        String str=sc.nextLine();
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=df.parse(str);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		cal.add(Calendar.SECOND, 1);
		System.out.println(df.format(cal.getTime())); 
        }
	}
	

}
