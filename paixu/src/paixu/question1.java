package paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ��˼�� 1-10000��ɵ����У��ټ���һ��1-1000֮�������Ȼ����1001��������˳��
 * ���⣺�������õ�������һ���������ҳ��Ǹ��ظ�������
 * 2016.3.16
 * by����4�ַ���
 */

public class question1 {
	public static void answer1(){//1��������10001�����ĺͼ�ȥ10000������
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<10001;i++){
			list.add(i);
		}
		list.add(10);
		Collections.shuffle(list);
		Integer[]a=list.toArray(new Integer[list.size()]);
		/*
		int count=0;
		int idx=0;
		int temp=0;
		while (a[idx]!=0){
		    count=count +1;
		    temp=a[idx]; 
		    a[idx]=0;
		    idx=temp;
		    }
		System.out.print("�ҵ�"+temp+"ѭ��"+count+"��");
		*/
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++){
			sum1+=a[i];
		}
		for(int j=1;j<10001;j++){
			sum2+=j;
		}
		System.out.print(sum1-sum2);
	}
	public static void answer2(){//���ÿһ��������������������Ϊ0�������
		List<Integer>list=new ArrayList<Integer>();
		for(int i=1;i<10001;i++){
			list.add(i);
		}
		list.add(8768);
		Collections.shuffle(list);
		for(int i=0;i<list.size();i++){
			//System.out.print(list.get(i));
			for(int j=i+1;j<list.size();j++){
				int value=list.get(i)^list.get(j);
				if(value==0){
					System.out.print(list.get(i));
				}
			}
		}
		
	}
	public static void answer3(){//���������Ժ������Ķ�Ӧ��ϵ
		List<Integer>list=new ArrayList<Integer>();
		int[]a=new int[10001];
		for(int i=1;i<10001;i++){
			list.add(i);
		}
		list.add(332);
		Collections.shuffle(list);
		for(int i=0;i<list.size();i++){
			a[i]=list.get(i);
		}
		int count=0;
		int idx=0;
		int temp=0;
		while (a[idx]!=0){
		    count=count +1;
		    temp=list.get(idx); 
		    a[idx]=0;
		    idx=temp;
		    }
		System.out.print("�ҵ�"+temp+"ѭ��"+count+"��");
		
	}
	public static void answer4(){//Ͱ���򷨣��ٿ���һ��1000�ռ������ list2 ������1001�����ִӵ�һ����ʼ�����ηŵ� list2 �����ı��λ���ϡ�������������ȥ��ֱ��ĳ��Ҫ����������� list2 ��Ӧ��λ�����Ѿ����ڣ����ҵ���������֡���
		List<Integer>list=new ArrayList<Integer>();
		int[]a=new int[10001];
		int[]b=new int[10001];
		for(int i=1;i<10001;i++){
			list.add(i);
		}
		list.add(1234);
		Collections.shuffle(list);
		
		for(int i=0;i<list.size();i++){
			a[i]=list.get(i);
		}
		for(int i=0;i<10001;i++){
			if(b[a[i]]==0)
			b[a[i]]=a[i];
			else
				System.out.print(a[i]);
		}
		
		
		
	}
	public static void main(String[] args){
		
		answer4();
		
	}

}
