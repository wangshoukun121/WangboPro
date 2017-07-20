package kaoshi;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	//double a=Math.pow(10, 5);
        	int[] num=new int[n];
        	//List<Integer> list=new ArrayList<Integer>();
        	long count=0;
        	for(int i=0;i<n;i++){
        		num[i]=sc.nextInt();
        	}
        	for(int i=0;i<n;i++){
        		for(int j=i;j<n;j++){
        			if((num[i]^num[j])>m)
        			count++;
        		}
        	}
        	
        	System.out.println(count);
        	
        }
        }
}
