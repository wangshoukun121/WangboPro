package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jinzhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        	String[]str=new String[2];
        	for(int i=0;i<2;i++){
        		str[i]=sc.nextLine();
        	}
           List<String>list=new ArrayList<String>();
           for(int i=0;i<2;i++){
           if(str[i].length()==8){
        	   list.add(str[i]);
           }
           if(str[i].length()<8){
        	   StringBuffer sb=new StringBuffer(str[i]);
        	   while(sb.length()!=8){
        		   sb.append('0');
        	   }
        	   list.add(sb.toString());
           }
           if(str[i].length()>8){
        	   String str1;
        	   while(str[i].length()>8){
        		   str1=str[i].substring(0,8);
        		   list.add(str1);
        		   str[i]=str[i].substring(8);
        	   }
        	   StringBuffer sb=new StringBuffer(str[i]);
        	   while(sb.length()!=8){
        		   sb.append('0');
        	   }
        	   list.add(sb.toString());
           }
           }
           for(String s:list){
        	   System.out.println(s);
           }
           /*int num=sc.nextInt();
           //Integer.parseInt(s, radix)表示将本来为radix进制的数s转为10进制，MAX_RADIX为32
            System.out.println(Integer.parseInt(str,12));
            //Integer.toString(i, radix)表示将i转为radix进制的字符串；
            System.out.println(Integer.toString(Integer.parseInt(str,12), 12));
            int x=0b1100;
            int y=0x89f;  
            System.out.println(Integer.toString(x, 8));//二进制转8进制
            System.out.println(Integer.toString(y, 8));//16进制转8进制
*/
        	
        }
    }
} 
