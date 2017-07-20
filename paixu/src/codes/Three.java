package codes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Three {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	int n=sc.nextInt();//cache大小
	int m=sc.nextInt();//页面请求数
	int que=0;
	Queue<Integer> q=new LinkedList<Integer>();
	int[] aaa=new int[m];
	for(int i=0;i<m;i++){
		aaa[i]=sc.nextInt();
	}
	for(int i=0;i<m;i++){
		if(q.size()<n&&!q.contains(aaa[i])){
			q.offer(aaa[i]);
			que++;
		}
		if(q.size()==n&&!q.contains(aaa[i])){
			q.remove();
			q.offer(aaa[i]);
			que++;
		}
		
	}
	System.out.println(que);
	}
}
}
