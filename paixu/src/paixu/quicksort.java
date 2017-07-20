package paixu;
/*
 * ¿ìÅÅ
 */
public class quicksort {
	public int getmid(int[]list,int left,int right ){
		int temp=list[left];
		while(left<right){
			while(left<right&&list[right]>=temp){
				right--;
			}
			list[left]=list[right];
			while(left<right&&list[left]<temp){
				left++;
			}
				list[right]=list[left];
		}
		list[left]=temp;
		return left;
	}
	public void quick_sort(int[]list,int left,int right){
		if(left<right){
		int midnum=getmid(list,left, right);
		quick_sort(list,left,midnum-1);
		quick_sort(list,midnum+1,right);}	
	}
	public quicksort(){
		int[]a={12,45,3,6,44,2};
		quick_sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" " );
		}
		
	}
}
