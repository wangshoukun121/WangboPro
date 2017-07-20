package codes;

import java.util.Scanner;

/**
 * @author wangbo
 *拉姆刚开始学习英文单词，对单词排序很感兴趣。
如果给拉姆一组单词，他能够迅速确定是否可以将这些单词排列在一个列表中，使得该列表中任何单词的首字母与前一单词的为字母相同。
你能编写一个程序来帮助拉姆进行判断吗？
 */
public class Two {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		int n=sc.nextInt();
		StringBuffer sb[]=new StringBuffer[n];
		for(int i=0;i<n;i++){
			sb[i]=new StringBuffer(sc.next());
		}
		int i=0;
		while(i<n-1){
			if(sb[i].charAt(sb[i].length()-1)==sb[i+1].charAt(0)){
				i++;
			}
			else{
				System.out.println("No");
				break;
			}
			if(i==n-2){
				System.out.println("Yes");
			}
		}
		
		
	}
}
}

