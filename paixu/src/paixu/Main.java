package paixu;

import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
String s=in.nextLine();
String t=in.nextLine();
char[] sc= s.toCharArray();
char[] tc= t.toCharArray();
if(tc.length==0){
	System.out.println("yes");
}
if(sc.length==0){
	System.out.println("no");
}
else{
	int pos=0;
	for(int i=0;i<sc.length;i++){
		if(tc[pos]==sc[i]){
			pos++;
		}
		if(pos==tc.length){
			System.out.println("yes");
			break;
		}
		
	}
	if(pos<tc.length){
		System.out.println("no");

	}
}		
	}
}
