package paixu;
/*Ͱ����
 * 1,Ͱ�������ȶ���
 * 2,Ͱ�����ǳ�������������һ��,�ȿ��Ż�Ҫ�졭����������
 * 3,Ͱ����ǳ���,����ͬʱҲ�ǳ��Ŀռ�,����������Ŀռ��һ�������㷨
 * 4��һ������֪���������е����ֵ����Сֵʱ����
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
