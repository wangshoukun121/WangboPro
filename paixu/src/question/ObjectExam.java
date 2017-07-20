package question;

public class ObjectExam {
	public static void main(String[] args){
		String str1="abc";
		String str=new String("abc");
		
	
		
		Integer a= new Integer(10);
		int b=10;
		Object obj=a;
		System.out.println(obj.hashCode());	
		System.out.println(a==b);	
	}
}
