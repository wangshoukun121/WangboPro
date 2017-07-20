package codes;

import java.util.Scanner;


/**
 * @author wangbo
 *
 */
public class Four {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			StringBuffer str=new StringBuffer(sc.next());
			int n=sc.nextInt();
			int p[]=new int[n];
			int l[]=new int[n];
			for(int i=0;i<n;i++){
				p[i]=sc.nextInt();
				l[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				StringBuffer jie=new StringBuffer(str.substring(p[i],p[i]+l[i] ));
				str=str.insert(p[i]+l[i], jie.reverse());
			}
			System.out.println(str);
			
			
			
		}
		}

}
