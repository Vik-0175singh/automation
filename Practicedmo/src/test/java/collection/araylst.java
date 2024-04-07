package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class araylst {

	List<Integer> list = new ArrayList<Integer>();
	List<Integer> list1 = new ArrayList<Integer>();
	public void addElements() {
		
		list.add(5);
		list.add(11);
		list.add(33);
		list.add(23);
		list.add(33);
		list.add(23);
		list.set(3, null);
		list.remove(3);
	//	list.set(4, null);
		list.get(4);
	//	list.add(null);

	//	list.clear();
		System.out.println(list.size());
		
		list1.add(43);
		list1.add(13);
		list1.add(4);
		list1.add(435);
		
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list1);
	//	list1.clear();
		System.out.println(list);
		
		for(int i =0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		
		for(int ele:list) {
			
			System.out.println(ele);
		}
	}
	
	public void sortlist() {
		
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println(list.containsAll(list1));
		System.out.println(list.equals(list1));
	}

	public static void main(String[] args) {
		araylst al = new araylst ();
		al.addElements();
		
		al.sortlist();
	}

}
