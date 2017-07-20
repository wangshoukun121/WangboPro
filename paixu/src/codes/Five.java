package codes;


/**
 * @author wangbo
 *最长公共子序列（有序但是可以不连续）
 *最长公共子串（连续）
 */
public class Five {
	public int[][] getdp(char[] str1,char[] str2){//最长公共子序列长度获取
		int [][]dp=new int[str1.length][str2.length];
		dp[0][0]=str1[0]==str2[0]?1:0;
		for(int i=1;i<str1.length;i++){
			dp[i][0]=Math.max(dp[i-1][0], str1[i]==str2[0]?1:0);
		}
		for(int j=1;j<str2.length;j++){
			dp[0][j]=Math.max(dp[0][j-1], str1[0]==str2[j]?1:0);
		}
		for(int i=1;i<str1.length;i++){
			for(int j=1;j<str2.length;j++){
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				if(str1[i]==str2[j]){
					dp[i][j]=Math.max(dp[i][j], dp[i-1][j-1]+1);
				}
			}
		}
		for(int i=0;i<str1.length;i++){
			for(int j=0;j<str2.length;j++){
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		System.out.println("最长公共子序列长度："+dp[str1.length-1][str2.length-1 ]);
		
	
		return dp;	
	}
	public StringBuffer returndp(char str1[],char str2[]){//输出最长公共子序列
		StringBuffer res =new StringBuffer("");
		int[][]dp=getdp(str1,str2);
		int i=str1.length-1;
		int j=str2.length-1;
		int flag=dp[i][j]-1;
		while(flag>=0){
			if(i>0&&dp[i][j]==dp[i-1][j]){
				i--;
			}
			if(j>0&&dp[i][j]==dp[i][j-1]){
				j--;
			}
			else{
				res.append(str1[i]);
				flag--;
				i--;
				j--;
				}
				
			
		}
		res.reverse();
		//System.out.println("公共子序列为："+res);
		return res;
	}
	public int[][] getdp1(char[]str1,char[]str2){//最长公共子串问题
		int[][]dp=new int[str1.length][str2.length];
		dp[0][0]=str1[0]==str2[0]?1:0;
		for(int i=0;i<str1.length;i++){
			dp[i][0]=str1[i]==str2[0]?1:0;
		}
		for(int j=0;j<str2.length;j++){
			dp[0][j]=str1[0]==str2[j]?1:0;
		}
		for(int i=1;i<str1.length;i++){
			for(int j=1;j<str2.length;j++){
				if(str1[i]==str2[j]){
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else 
					dp[i][j]=0;
			}
		}
		/*for(int i=0;i<str1.length;i++){
			for(int j=0;j<str2.length;j++){
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}*/
		int max=0;
		int end=0;
		for(int i=0;i<str1.length;i++){
			for(int j=0;j<str2.length;j++){
				if(dp[i][j]>max){
					max=dp[i][j];
					end=i;
					
				}
			}
		}
		System.out.println("最长公共子串长度为："+max);
		StringBuffer sb=new StringBuffer();
		for(int i=end;i>end-max;i--){
			sb.append(str1[i]);
		}
		sb.reverse();
		System.out.println("最长公共子串为："+sb);
		return dp;
	}
	public StringBuffer huiwen(String str){//找回文子串
		StringBuffer str1=new StringBuffer(str);
		char[] a=str1.toString().toCharArray();
		char[] b=str1.reverse().toString().toCharArray();
		int dp[][]=new int[a.length][b.length];
		dp[0][0]=a[0]==b[0]?1:0;
		for(int i=0;i<a.length;i++){
			dp[i][0]=a[i]==b[0]?1:0;
			dp[0][i]=a[0]==b[i]?1:0;
		}
		for(int i=1;i<a.length;i++){
			for(int j=1;j<b.length;j++){
				dp[i][j]=a[i]==b[j]?dp[i-1][j-1]+1:0;
			}
		}
		int max=0;
		int end=0;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
			if(dp[i][j]>max){
				max=dp[i][j];
				end=i;
			}
		}
	}
	StringBuffer huiwen=new StringBuffer();
	for(int i=end;i>end-max;i--){
		huiwen.append(a[i]);
	}
		huiwen.reverse();
		System.out.println(huiwen);
		return huiwen;
		
	}
public static void main(String[]args){
	/*String a="1AB2345CD";
	String b="12345EF";
	char[] aa=a.toCharArray(); 
	char[] bb=b.toCharArray();
	new Five().getdp(aa,bb);
	new Five().returndp(aa,bb);
	new Five().getdp1(aa, bb);*/
	new Five().huiwen("google");
}


}
