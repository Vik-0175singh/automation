package collection;

import java.util.HashSet;

public class HashSetDemo {
	
	HashSet <Integer> set = new HashSet<Integer>();
	
	public void hashset() {
		
		set.add(33);
		set.add(59);
		set.add(67);
		set.add(67);
		set.add(76);
		set.add(97);
		set.add(747);
		set.add(76);
		set.add(null);
		set.add(null);
		
		//set.remove(76);
		System.out.println(set);
		
		for (Integer a:set) {
			
		System.out.println(a);	
		}
	}
	
	public static void main(String[] args) {
		
		HashSetDemo hs = new HashSetDemo();
		hs.hashset();
		
	}
}
