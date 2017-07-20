package codes;

import java.util.Scanner;

public class Eight {
private static Scanner s;

public static void main(String[]args){
	s = new Scanner(System.in);
	while(s.hasNext()){
		int n=s.nextInt();
		int m=s.nextInt();
		int []shu=new int[n+1];
		for(int i=1;i<n+1;i++){
			shu[i]=(int) Math.pow(10, 8);
		}
		for(int i=0;i<m;i++){
			int tian=s.nextInt();
			shu[tian]=s.nextInt();
			for(int j=1;j<n+1;j++){
				if(j<tian)
				shu[j]=Math.min(shu[j],(shu[tian]+(tian-j)));
				if(j>tian){
				shu[j]=Math.min(shu[j],(shu[tian]+(j-tian)));
				}
			}
		}
		int max=0;
		boolean flag=true;
		for(int i=1;i<n+1;i++){
			if(shu[i]>max)
				max=shu[i];
		}
		for(int i=2;i<n+1;i++){
			if(shu[i]-shu[i-1]>1||shu[i]-shu[i-1]<-1){
				System.out.println("IMPOSSIBLE");
				flag=false;
			}
		}
		if(flag==true){
			System.out.println(max);
		}
		
	}
}
}
