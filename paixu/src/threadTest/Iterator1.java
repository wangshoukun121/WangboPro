package threadTest;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Iterator1 {
	public static void main(String[] args) {
		Set<Integer>set=new TreeSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++){
			set.add(r.nextInt(100));
		}
		Iterator<Integer>it=set.iterator();
		while(set.size()>4){
			it.next();
			it.remove();
		}
		for(int n:set){
			System.out.println(n);
		}
		
	}
}
