package paixu;

public class InsertSort {
	public static void insertsort(int[] num){
		int temp=0;  
		  
	    for(int i=1;i<num.length;i++){  
	  
	       int j=i-1;  
	  
	       temp=num[i];  
	  
	       for(;j>=0&&temp<num[j];j--){  
	  
	       num[j+1]=num[j];                       //将大于temp的值整体后移一个单位  
	  
	       }  
	  
	       num[j+1]=temp;  
	  
	    }  
	  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  insertsort(a);
		  for(int n:a){
			  System.out.println(n);
		  }
	}

}
