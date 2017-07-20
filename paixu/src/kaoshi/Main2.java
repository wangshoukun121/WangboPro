package kaoshi;

import java.util.Scanner;

public class Main2 {
	public static int MinSubString(String src, String dest) {  
	    int min = Integer.MAX_VALUE;// 找最短子串  
	    int minfront = 0;// 最短子串开始位置  
	    int minrear = 0;// 最短子串结束位置  
	    int front, rear;  
	    front = rear = 0;  
	    int count = 0;  
	    int hashtable[] = new int[256];  
	    int cnt[] = new int[256];  
	    for (int i = 0; i < dest.length(); i++) {  
	        hashtable[dest.charAt(i)] = 1;  
	    }  
	    while (rear < src.length()) {  
	        if (hashtable[src.charAt(rear)] == 1) {// rear当前字符在字符集中  
	            // 判断是否是本子串中第一次检索到此字符，由count统计字符集中已出现的字符数  
	            if (cnt[src.charAt(rear)] == 0) {  
	                count++;  
	                cnt[src.charAt(rear)]++;  
	                if (count == dest.length()) {// 字符集中的字符在本子串中都已检索到  
	                    while (true) {  
	                        if (hashtable[src.charAt(front)] == 1) {// front当前字符在字符集中  
	                            cnt[src.charAt(front)]--;  
	                            // 字符集中某个字符为0，此时front到rear所指字符串即为符合条件的子串  
	                            if (cnt[src.charAt(front)] == 0) {  
	                                
	                                if (rear - front + 1 < min) {  
	                                    min = rear - front + 1;  
	                                    minrear = rear;  
	                                    minfront = front;  
	                                }  
	                                // count不需要清空（赋0），cnt数组也不需要任何操作  
	                                count--;// 因为某个字符为出现次数已经减为0了，所以count--  
	                                front++;// 这个不可少  
	                                break;  
	                            }  
	                        }  
	                        front++;  
	                    }  
	                }  
	            } else {  
	                cnt[src.charAt(rear)]++;  
	            }  
	        }  
	        rear++;  
	    }  
	    if (min == Integer.MAX_VALUE) {  
	        return src.length()/2; 
	    } else {  
	        return minrear+1-minfront;
	    }  
	}  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        	String str=sc.nextLine();
        	StringBuffer str1=new StringBuffer(str);
        	str1.append(str);
        	String str2=new String("ABCDE");
    		System.out.println(str.length()-MinSubString(str1.toString(),str2));
        }

		
	}
}
