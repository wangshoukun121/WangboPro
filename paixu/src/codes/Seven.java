package codes;

/**
 * @author wangbo
 *跳台阶问题
 */
public class Seven {
	public int tiao(int n){//一个台阶总共有n级，如果一次可以跳1级，也可以跳2级。求总共有多少总跳法
		if(n==1||n==2){
			return n;
		}
		else
			return tiao(n-1)+tiao(n-2);
	}
	public int biantaitiao(int n){//一个台阶总共有n级，如果一次可以跳1级，也可以跳2级......它也可以跳上n级。此时跳上一个n级的台阶总共有多少种跳法？
		if(n==0||n==1){
			return 1;
		}
		else
			return 2*biantaitiao(n-1);
	}
	public int jiafa(int a,int b){//写一个函数，求两个整数的之和，要求在函数体内不得使用＋、－、×、÷。
		if(b==0){
			return a;
		}
		int yihuo;
		if(a==0){
			return b;
		}
		else
			 yihuo=a^b;
			int yu=(a&b)<<1;
			return jiafa(yihuo,yu);
		
	}
	public class Solution {
	    public String replaceSpace(StringBuffer str) {
	    	String str1=str.toString().replaceAll(" ", "%20");
	    	return str1;
	    }
	}
	public static void main(String[]args){
		Seven s=new Seven();
		/*Seven s=new Seven();
		System.out.println(s.tiao(9));
		System.out.println(s.biantaitiao(9));*/
		//System.out.println(s.jiafa(12, 66));
		//s.tihuan("hello word");
	}
}
