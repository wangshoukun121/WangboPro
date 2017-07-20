package codes;

import java.util.Scanner;

public class Six {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		int n=sc.nextInt();//总共多少歌
		int s=sc.nextInt();//每首歌长度
		int L=sc.nextInt();//每个CD容量
		int flag=1;
		int num=0;//cd张数
		int cunzai = 0;//cd中已存在的容量
		int ge=0;//cd中已存在的歌的数量
		while(flag<=n){
			if(ge==0){
				System.out.println(flag+"---");
				cunzai=s+1;
				ge++;
				flag++;
				num++;
				System.out.println(flag+"---");

			}
			if(ge!=0&&ge!=1&&cunzai<=L-s&&(ge%13!=0)){
				System.out.println(flag+"haha");
				ge++;
				flag++;
				cunzai=cunzai+s+1;
			}
			else{
				System.out.println(flag+"hehe");
				num++;
				ge=1;
				cunzai=s+1;
				flag++;

			}
			
		}
		System.out.println(num);
	}
}
}
