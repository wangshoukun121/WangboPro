package codes;

import java.util.Scanner;

public class Ten { 
	
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String str=s.nextLine();
			char[] str1=str.toCharArray();
			if(str1.length%2==1){
				for(int i=0;i<str1.length;i++){
					if(i<(str1.length-1)/2){
						if(str1[i]=='a')
							str1[i]='z';
						else
						str1[i]=(char) (str1[i]-1);
					}
					if(i>(str1.length-1)/2){
						if(str1[i]=='z')
							str1[i]='a';
						else
						str1[i]=(char) (str1[i]+1);
					}											
				}
			}
			if(str1.length%2==0){
				for(int i=0;i<str1.length;i++){
					if(i<(str1.length-1)/2){
						if(str1[i]=='a')
							str1[i]='z';
						else
						str1[i]=(char) (str1[i]-1);
					}
					if(i>=(str1.length-1)/2){
						if(str1[i]=='z')
							str1[i]='a';
						else
						str1[i]=(char) (str1[i]+1);
					}	
				}
			}
			for(int i=0;i<str1.length;i++){
				System.out.print(str1[i]);
			}
			System.out.println();
		}
	}
}
