package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Eleven {
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	while(s.hasNext()){
		int n=s.nextInt();//桌子
		int m=s.nextInt();//人
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(s.nextInt());
		}
		Collections.sort(list);
		int[][]ren =new int[m][2];
		for(int i=0;i<m;i++){
			ren[i][0]=s.nextInt();//人数
			ren[i][1]=s.nextInt();//消费金额
		}
		int num=0;
		int qian=0;
		for(int i=0;i<m;i++){
			for(int j=i;j<m;j++){
				if(ren[i][1]<ren[j][1]){
					qian=ren[i][1];
					num=ren[i][0];
					ren[i][1]=ren[j][1];
					ren[i][0]=ren[j][0];
					ren[j][1]=qian;
					ren[j][0]=num;
				}
			}
		}
		
		/*for(int i=0;i<m;i++){
			System.out.print(ren[i][0]);
			System.out.println(ren[i][1]);
		}*/
		int sum=0;
		for(int i=0;i<m;i++){
			if(ren[i][0]<Collections.max(list)){
				for(int j=0;j<list.size();j++){
					if(ren[i][0]<list.get(j)){
						list.remove(j);
						sum=sum+ren[i][1];
						break;
					}
				}
			}
		}
		System.out.println(sum);
		
	}
}
}
