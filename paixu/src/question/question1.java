package question;

import java.util.Scanner;

/*
 * 求两个数的最大公约数
 * 递归，如果q和r分别是m除以n的商和余数，那么m和n的最大公约数等于n和r的最大公约数
 * question1:小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
 * 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
 * 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并 且使得自己的能力值增加bi;
 * 如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.那么问题来了,在一系列的锻炼后,
 * 小易的最终能力值为多少?
 */
public class question1 {
	public int gcd(int m,int n){//最大公约数
		return n==0?m:gcd(n,m%n);
	}
	public int gbs(int m,int n){//最小公倍数
		return n=n*m/gcd(m,n);
	}
	public static void main(String[]args){
		//System.out.print("请输入小易现在的能力值，遇到怪物的个数和每个怪物的攻击值：");
		Scanner input= new Scanner(System.in);
		question1 q=new question1();
		while(input.hasNext()){
			
//			int a=input.nextInt();
//			int n=input.nextInt();
//			int[]guai=new int[n];
//			for(int i=0;i<guai.length;i++){
//				guai[i]=input.nextInt();
//				if(guai[i]<=a)
//					a+=guai[i];
//				else
//					a=a+q.gcd(a,guai[i]);
			int m=input.nextInt();
			int n=input.nextInt();
			System.out.println("最大公约数："+q.gcd(m, n)+"最小公倍数："+q.gbs(m, n));
			}
			//System.out.print("小明现在能力值为："+a);
			
		}
		
		
	}


