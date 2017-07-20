package kaoshi;

import java.util.Scanner;

public class Main1 {
	public static StringBuffer getdp1(char[]str1,char[]str2){//最长公共子串问题
		int[][]dp=new int[str1.length][str2.length];
		dp[0][0]=str1[0]==str2[0]?1:0;
		for(int i=0;i<str1.length;i++){
			dp[i][0]=str1[i]==str2[0]?1:0;
		}
		for(int j=0;j<str2.length;j++){
			dp[0][j]=str1[0]==str2[j]?1:0;
		}
		for(int i=1;i<str1.length;i++){
			for(int j=1;j<str2.length;j++){
				if(str1[i]==str2[j]){
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else 
					dp[i][j]=0;
			}
		}
		/*for(int i=0;i<str1.length;i++){
			for(int j=0;j<str2.length;j++){
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}*/
		int max=0;
		int end=0;
		for(int i=0;i<str1.length;i++){
			for(int j=0;j<str2.length;j++){
				if(dp[i][j]>max){
					max=dp[i][j];
					end=i;
					
				}
			}
		}
		//System.out.println("最长公共子串长度为："+max);
		StringBuffer sb=new StringBuffer();
		for(int i=end;i>end-max;i--){
			sb.append(str1[i]);
		}
		sb.reverse();
		
		return sb;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        	String str1=sc.next();
        	String str2=sc.next();
        	str1=str1.toLowerCase();
        	str2=str2.toLowerCase();
        	if(getdp1(str1.toCharArray(),str2.toCharArray()).equals("")){
        		System.out.println("result="+"");
        		
        	}
        	else{
        		System.out.println("result="+getdp1(str1.toCharArray(),str2.toCharArray()).toString());
        	}
        
        }
	}
}
