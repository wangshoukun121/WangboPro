package huawei;

import java.text.ParseException;
import java.util.Scanner;



public class meituan {
	public int binarySearch(int[]srcArray,int des){  
        //第一个位置.  
        int low=0;  
        //最高位置.数组长度-1,因为下标是从0开始的.  
        int high=srcArray.length-1;  
        //当low"指针"和high不重复的时候. 
        StringBuffer str=new  StringBuffer();
        while(high-low>3){  
            //中间位置计算,low+ 最高位置减去最低位置,右移一位,相当于除2.也可以用(high+low)/2  
            int middle=low+((high-low)>>1);  
        //与最中间的数字进行判断,是否相等,相等的话就返回对应的数组下标.  
        if(des==srcArray[middle]){  
            return middle;  
        //如果小于的话则移动最高层的"指针"  
        }else if(des<srcArray[middle]){  
            high=middle-1; 
            str.append('0');
        //移动最低的"指针"   
        }else{  
        	str.append('1');
            low=middle+1; 
            
            }  
        }  
        System.out.println(str);
        return-1;  
        }  
      
      
  

	
		public static void main(String[] args) throws ParseException {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int[] num=new int[181];
			int zhi=-90;
			for(int i=0;i<181;i++){
				num[i]=zhi;
				zhi++;
			}
	        while (sc.hasNext()){
	        	int a=sc.nextInt();
	        	meituan rr=new meituan();
	    		rr.binarySearch(num,a);
	        }
		}
	

}
