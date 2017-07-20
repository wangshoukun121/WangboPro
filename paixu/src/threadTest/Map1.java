package threadTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


/**
 * @author wangbo
 *在映射中放入十个随机数，将放入序号作为键，放入数值作为值，对随机数进行排序，输出键值对
 */
public class Map1 {
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		Random random=new Random();
		for(int i=0;i<10;i++){
			map.put(i, random.nextInt(100));
		}
		Collection<Integer>values=map.values();//值得集合
		Integer[]array= values.toArray(new Integer[10]);//值得集合to数组
		Set<Integer> set=new TreeSet<Integer>();
		for(int n:array){
			set.add(n);
		}
		for(int i:set){
			for(Map.Entry<Integer, Integer>entry:map.entrySet()){
				if(entry.getValue()==i){
					System.out.println(entry.getKey()+":"+entry.getValue());
				}
				
			}
		}
	}
}
