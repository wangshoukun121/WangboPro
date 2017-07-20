package huawei;

import java.util.ArrayList;
import java.util.List;

public class 最长递增子序列 {
	public int[] getdp(int[]num){
		int[]dp=new int[num.length];
		for(int i=0;i<num.length;i++){
			dp[i]=1;
			for(int j=0;j<i;j++){
				if(num[i]>num[j]){
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
	 		}
			
	}
		
		System.out.println();
		return dp;
	}
	public static void main(String[]args){
		int[] num={2,1,5,3,6,4,8,9,7};

		int[]num1=new 最长递增子序列().getdp(num);
		int max=0;
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<num1.length;i++){
			if(num1[i]>=max){
				list.clear();
				max=num1[i];
				list.add(i);
			}
		}
		int[]lis=new int[max];
		for(int n:list){
			lis[--max]=num[n];
			for(int i=n;i>=0;i--){
				if(num[i]<num[n]&&num1[i]==num1[n]-1){
					lis[--max]=num[i];
					n=i;
				}
			}
			for(int j:lis){
				System.out.print(j+" ");
			}
			
		}
	}
}
