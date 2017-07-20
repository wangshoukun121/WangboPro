package paixu;

import java.util.Scanner;

public class test1 {
public static void main(String[]args){
	int max= 2;
	int[] page={2,3,1,3,2,1,4,3,2};
	int [] neicun=new int[max];
	for(int i =0;i<max;i++){
		neicun[i]=-1;
	}
	
	int j=0;
	int count=0;
	boolean flag=false;
	for(int i =0;i<page.length;i++){
		for(int jj=0;jj<max;jj++){
			if(neicun[jj]==page[i]){
				flag=true;
			}
		}
		if(flag==false){
			count++;
			if(j==max)
			{
				j=0;
			}
			neicun[j]=page[i];
			j++;
		}
		flag=false;
		
		
		
	}
	System.out.println(count);
}

}
