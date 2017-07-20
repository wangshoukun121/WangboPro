package huawei;

import java.util.Scanner;

public class Huiwen {
	public boolean huiwen(String str){//判断一个字符串是否是回文
		boolean flag=true;
	for(int i=0;i<str.length()/2;i++){
		if(str.charAt(i)!=str.charAt(str.length()-1-i)){
			flag=false;
			break;
		}
		
	}
	return flag;
	}
	public static void main(String[]args){
		System.out.println("http://iotchinamoble.zhiye.com/campus".toUpperCase());
		 Scanner sc=new Scanner(System.in);
	        while (sc.hasNext()){
	        	String str=sc.nextLine();
	        	String[] str1=str.split("\\s+");//字符串分割，不管中间有多少个空格
	        	System.out.println(str1.length);
	        	for(int i=0;i<str1.length;i++){
	        		System.out.println(str1[i]);
	        	}
	        }
	}
}
