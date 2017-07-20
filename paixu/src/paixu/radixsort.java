package paixu;

import java.util.ArrayList;
import java.util.List;
/*
 * 基数排序
 * 队列实现（二维数组也可实现）
 * 时间复杂度O(d*n)d为最大数的位数=time
 * 2016.3.18by王博
 */

public class radixsort {
	public static void radix_sort(int[]list){
		int max=list[0];
		for(int i=0;i<list.length;i++){
			if(list[i]>max)
				max=list[i];//找出序列中最大值
		}
		int time=0;//找出最大值的位数，即要做几趟排序
		while(max>0){
			max/=10;
			time++;
		}
		List<ArrayList>queue=new ArrayList<ArrayList>();
		for(int i=0;i<10;i++){
			ArrayList<Integer>queue0=new ArrayList<Integer>();
			queue.add( queue0);
		}
		for(int i=1;i<time+1;i++){
			for(int j=0;j<list.length;j++){
				int x= list[j]%(int)Math.pow(10, i)/(int)Math.pow(10, i-1);//计算每个数第time位值
				ArrayList<Integer>queue1=queue.get(x);//queue1是queue中第x个元素
				queue1.add(list[j]);//队列queue1放的是第time位相同的list中的值
				queue.set(x, queue1);//queue放的是10个队列
			}
		
		int count=0;
		for(int j=0;j<10;j++){
			while(queue.get(j).size()>0){
			ArrayList<Integer>queue2=queue.get(j);
			list[count]=queue2.get(0);
			queue2.remove(0);
			count++;
			}
			}
		}
	}
		
	public static void main(String[]args){
		int[]a={43,132,3,45,67,657,960,6};
		radix_sort(a);
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" " );
		}
		
	}
		
	}
		
