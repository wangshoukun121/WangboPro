package huawei;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        	String str=sc.nextLine();
        	String[] str1=str.split(",");
        	String[] str2=new String[str1.length];
        	System.out.print("[");
        	for(int i=0;i<str1.length-1;i++){
        		str2[i]=str1[i].replace('=', ',');
        		System.out.print("["+str2[i]+"]"+",");
        	}
        	str2[str1.length-1]=str1[str1.length-1].replace('=', ',');
        	System.out.print("["+str2[str1.length-1]+"]");
        	System.out.println("]");

        }
	}

}
