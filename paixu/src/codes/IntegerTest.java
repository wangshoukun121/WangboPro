package codes;

import java.util.Scanner;



public class IntegerTest {
	public static void xipai(int n,int[] pai){
		int zuo[]=new int[n];
		int you[]=new int[n];
		//List<Integer> done=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			zuo[i]=pai[i];
			you[i]=pai[i+n];
		}
		for(int i=0;i<n;i++){
			pai[i*2]=zuo[i];
			pai[i*2+1]=you[i];
		}
		/*for(int j=0;j<n;j++){
			done.add(zuo[j]);
			done.add(you[j]);
		}*/
		/*for(int i=0;i<done.size();i++){
			System.out.print(done.get(i)+" ");
		}*/
	}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int zun;
	zun=s.nextInt();
	for(int j = 0 ;j<zun;j++){
    int n,k;
    n=s.nextInt();
    k=s.nextInt();
    
	int a[]= new int[2*n];
	for(int i=0;i<2*n;i++){
		a[i]=s.nextInt();
		
	}
    for(int i=0;i<k;i++)
	
	xipai(n,a);
    for(int i=0;i<a.length-1;i++){
		System.out.print(a[i]+" ");		
    		}
    
    System.out.println(a[a.length-1]);
	}
}}
