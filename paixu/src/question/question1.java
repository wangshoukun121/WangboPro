package question;

import java.util.Scanner;

/*
 * �������������Լ��
 * �ݹ飬���q��r�ֱ���m����n���̺���������ôm��n�����Լ������n��r�����Լ��
 * question1:С�׾���������������Ϸ.��һ��,������һ�������������Ϸ,���Ľ�ɫ�ĳ�ʼ����ֵΪ a.
 * �ڽ�������һ��ʱ����,��������������n������,ÿ������ķ�����Ϊb1,b2,b3...bn.
 * ��������Ĺ��������biС�ڵ���С�׵ĵ�ǰ����ֵc,��ô���������ɴ�ܹ���,�� ��ʹ���Լ�������ֵ����bi;
 * ���bi����c,����Ҳ�ܴ�ܹ���,����������ֵֻ������bi ��c�����Լ��.��ô��������,��һϵ�еĶ�����,
 * С�׵���������ֵΪ����?
 */
public class question1 {
	public int gcd(int m,int n){//���Լ��
		return n==0?m:gcd(n,m%n);
	}
	public int gbs(int m,int n){//��С������
		return n=n*m/gcd(m,n);
	}
	public static void main(String[]args){
		//System.out.print("������С�����ڵ�����ֵ����������ĸ�����ÿ������Ĺ���ֵ��");
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
			System.out.println("���Լ����"+q.gcd(m, n)+"��С��������"+q.gbs(m, n));
			}
			//System.out.print("С����������ֵΪ��"+a);
			
		}
		
		
	}


