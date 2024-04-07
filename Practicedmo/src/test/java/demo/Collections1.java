package demo;

import java.util.HashMap;
import java.util.HashSet;

public class Collections1 {
	
	HashSet<Integer> hs=new HashSet<Integer>();
	
	HashMap <Integer,String> map = new HashMap<Integer,String>();
	
	public void addValueHashSet() {
		
		hs.add(33);
		hs.add(23);
		hs.add(44);
		hs.add(55);
		hs.remove(33);
		
		for(int i: hs)
		{
			System.out.println(i);
			
		}

	}
	
	public void addValueHashMat() {
		
		map.put(1, "vikash");
		map.put(2, "vikash");
		map.put(3, "vik");
		map.put(1, "pari");
		map.put(5, null);
		map.remove(3);
		map.put(null, "san");
		System.out.println(map);
		System.out.println(map.get(3));
	}
	
	public static void main(String[] args) {
		
		Collections1 cn = new Collections1();
		cn.addValueHashSet();
		cn.addValueHashMat();
		
	}

}
