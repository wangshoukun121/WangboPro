package codes;

import java.util.ArrayList;
import java.util.List;


/**
 * @author wangbo 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？输出需要删除的字符个数。
 */
public class One {
	static class StopMsgException extends RuntimeException {  
    } 
	public static boolean huiwen(String a) {
		StringBuffer sb = new StringBuffer(a);
		String aa = sb.reverse().toString();
		if (a.equals(aa))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//while (sc.hasNextLine()) {
		//	String a = sc.next();
			/*if (huiwen(a)) {
				System.out.println(a.length());
				break;
			} else {
				for (int i = 1; i < a.length()+1; i++) {
					a=a.substring(0,i-1)+a.substring(i,a.length());
				}
			}*/
		//}
		StringBuffer res =new StringBuffer("");
		String a = "abrca";
		//System.out.println(hu(a));
		
		
		try {  
			hu(a,res); 
        } catch (StopMsgException e) {  
        	System.out.println(res);
        }  
		//System.out.println(huiwen("aba"));
		}
public static void  hu (String str, StringBuffer res) {
	System.out.println("str=="+str);
	if(huiwen(str)){
		res.delete(0,res.length());
		res.append(str);
		 throw new StopMsgException();
	}
	else 
		System.out.println("strelse=="+str);
	   List<String> strings= new ArrayList<>();
		for(int i = 1;i<str.length()+1;i++)
		{
			strings.add(str.substring(0,i-1)+str.substring(i,str.length()));
				
						
		}
		for(int i=0;i<strings.size();i++)
		{
			System.out.println("ddddd="+strings.get(i));
			if(huiwen(strings.get(i))){
				res.delete(0,res.length());
				res.append(strings.get(i));
				 throw new StopMsgException();
			}
			//hu(strings.get(i),res);
		}
		for(int i=0;i<strings.size();i++)
		{
			hu(strings.get(i),res);
		}

	
		
	
}
}
