package paixu;
/*桶排序
 * 1,桶排序是稳定的
 * 2,桶排序是常见排序里最快的一种,比快排还要快…大多数情况下
 * 3,桶排序非常快,但是同时也非常耗空间,基本上是最耗空间的一种排序算法
 * 4，一般用于知道无序序列的最大值和最小值时排序
 */
public class tongpaixu {
	public static void tong(int[]unsorted,int max){
		int[]sorted=new int[max+1];
		for(int i=0;i<unsorted.length;i++){
			sorted[unsorted[i]]=unsorted[i];
		}
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i]+" ");
		}
	}
	public static void main(String args[]){
		int[] a={3,5,4,2,9,1,7};
		tong(a,9);
		
	}


}
