package paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 意思是 1-10000组成的序列，再加入一个1-1000之间的数，然后将这1001个数打乱顺序。
 * 问题：你现在拿到了这样一组数，请找出那个重复的数。
 * 2016.3.16
 * by王博4种方法
 */

public class question1 {
	public static void answer1(){//1求和相减（10001个数的和减去10000个数）
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
		System.out.print("找到"+temp+"循环"+count+"次");
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
	public static void answer2(){//异或（每一个数和其他数做异或，如果为0则输出）
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
	public static void answer3(){//利用连续性和索引的对应关系
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
		System.out.print("找到"+temp+"循环"+count+"次");
		
	}
	public static void answer4(){//桶排序法（再开辟一个1000空间的数组 list2 ，将这1001个数字从第一个开始，依次放到 list2 中他的编号位置上。依次这样做下去，直到某个要保存的数字在 list2 对应的位置上已经存在，就找到了这个数字。）
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
