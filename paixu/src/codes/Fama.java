package codes;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Fama{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] m_weight = new int[n];//重量
            int[] x_num = new int[n];//数量
            for(int i = 0 ; i < n ; i++){
                m_weight[i] = scan.nextInt();
            }
            for(int i = 0 ; i < n ; i++){
                x_num[i] = scan.nextInt();
            }
            printNumOfDifferentWeight(n , m_weight , x_num);
        }
        scan.close();
    }
    private static void printNumOfDifferentWeight(int n , int[] m_weight , int[] x_num){
        Set<Integer> set = new HashSet<Integer>();
        //先求出第一种砝码可能称出的重量,个数可以为0~x_num[0]
        for(int i = 0 ; i <= x_num[0] ; i++){
            set.add(i * m_weight[0]);
        }
        //再在第一个砝码的基础上增加其他重量
        //逐个增加砝码，更新集合set,i代表砝码的种类，从0开始
        for(int i = 1 ; i < n ; i++){
            //遍历第i个砝码的个数，从第二个砝码开始
            //因为set无序集合并且没有get方法，所以将结果暂存于ArrayList中遍历
            List<Integer> list = new ArrayList<Integer>(set);
            //j遍历第i种砝码的个数
            for(int j = 1 ; j <= x_num[i] ; j++){
                for(int k = 0 ; k < list.size() ; k++){
                   set.add(list.get(k) + j * m_weight[i]); 
                }                
            }
        }
        System.out.println(set.size());
        for(Integer s:set){
        	System.out.println(s);
        }
    }
}