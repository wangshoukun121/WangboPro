package kaoshi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			Set<String> hset1=new LinkedHashSet<String>();
			Set<String> hset2=new LinkedHashSet<String>();
			if(n>=1){
				
				hset1.add("()");
		
			for(int i=1;i<n;i++){
				hset2.clear();
				hset2=new  HashSet<String>(hset1);
				hset1.clear();
				for(String temp:hset2){
					for(int j=0;j<=temp.length();j++){
						
						hset1.add(temp.substring(0, j)+"()"+temp.substring(j));
					}
				}
			}
			for(String temp:hset1){
				System.out.println(temp);
			}
			System.out.println();
			System.out.println();
			}
		}

	}

}

