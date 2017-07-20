package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hh {
/*	static{
		x=1;
	}
	static int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
x--;
method();
System.out.println(x+y+ ++x);

	}
	static void method(){
		y=x++ + ++x;
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int num=(int) Math.pow(3, n);
			if(n<3){
				System.out.println(num);
			}
			else{
				int flag=n/3;
				int buchun=(int) (num-6*(n-2)*Math.pow(3, (n-3)));
				System.out.println(buchun);
			}
		}
	}
}

