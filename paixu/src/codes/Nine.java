package codes;

import java.util.ArrayList;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sinScanner = new Scanner(System.in);
		ArrayList< String> arrayList=new ArrayList<>();
		while (sinScanner.hasNext()) {
			int m = sinScanner.nextInt();	
			for (int i = 2; i < m; i++) {
				int yu=0;
				int sum = 0;
				int wei=m;
				while(wei>=i){
					wei=wei/i;
					 yu=wei%i;
					sum+=yu;
					//System.out.print(wei+" "+yu+" "+sum+" ");
				}
				System.out.println(sum);
			}
			
			/*int gong=gongyue(sum,m-2);
			System.out.println(sum/gong + "/" +( (m - 2)/gong));*/
		}
		
}
	public static int gongyue(int m, int n) {   
        while (m % n != 0) {   
            int temp = m % n;   
            m = n;   
            n = temp;   
        }
        return n;
    }
}
