package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection {

	List<Integer> arrlst1 = new ArrayList<Integer>();
	List<Integer> arrlst2 = new ArrayList<Integer>();
	
	LinkedList<Integer> list = new LinkedList<Integer>();

	public void addElements() {
		
		
		list.add(10);
		list.add(11);
		list.set(0, 47);
		list.add(21);
		list.addFirst(98);
		list.addLast(92);
		
		
		System.out.println(list);

		arrlst1.add(10);
		arrlst1.add(11);
		arrlst1.set(1, 30);
		arrlst1.add(21);
		arrlst1.add(32);
		arrlst1.add(2);
	
		
		
		arrlst2.add(21);
		arrlst2.add(10);
		

		// arrlst1.remove(1);

		System.out.println(arrlst1.indexOf(21));

		System.out.println(arrlst1);
		System.out.println(arrlst1.contains(21));
		// arrlst1.clear();
		System.out.println(arrlst1.isEmpty());

		System.out.println(arrlst1.size());
		Collections.sort(arrlst1);
		System.out.println(arrlst1);
		Collections.sort(arrlst1, Collections.reverseOrder());
		System.out.println(arrlst1);
		
		System.out.println(arrlst1.containsAll(arrlst2));
		
		arrlst1.addAll(arrlst2);
		System.out.println(arrlst1);
		arrlst1.add(1, 3);
		arrlst1.set(1, 22);
		System.out.println(arrlst1);
		
	}

	public static void main(String[] args) {

		Collection co = new Collection();
		co.addElements();

	}

}
