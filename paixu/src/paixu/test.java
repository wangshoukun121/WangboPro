package paixu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 
public class test {  
public static void main(String[] args) throws IOException {  
	/*
Scanner in=new Scanner(System.in);
List<Integer> list=new ArrayList<Integer>();
List<Integer> list1=new ArrayList<Integer>();
while(in.hasNextInt()){
	list.add(in.nextInt());
}
while(list.size()>1){
	list1.add(list.get(0));
	list.add(list.get(1));
	list.remove(0);	
	list.remove(0);
}
list1.add(list.get(0));
for(int i=0;i<list1.size();i++){
	System.out.println(list1.get(i));
}
*/
	
	Scanner in=new Scanner(System.in);
	int d,sumTime;
	while(in.hasNext()){
	d = in.nextInt();
	sumTime = in.nextInt();
	int[] mins=new int[d];
	int[] maxs=new int[d];
	int maxsum=0;
	int minsum=0;
	for(int i=0;i<d;i++){
		mins[i] = in.nextInt();
		maxs[i] = in.nextInt();
		maxsum+=maxs[i];
		minsum+=mins[i];
	}
	if(sumTime>=minsum&&sumTime<=maxsum){
		System.out.println("true");
		for(int i=0;i<d;i++){
			if(sumTime>=maxs[i]){
			System.out.println(maxs[i]);
			sumTime-=maxs[i];
			}
			else
				System.out.println(sumTime);
				
			
		}
	}
	else
		System.out.println("false");
	}	
	
}
}