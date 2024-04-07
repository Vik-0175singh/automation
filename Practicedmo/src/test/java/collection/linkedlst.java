package collection;

import java.util.LinkedList;
import java.util.List;

public class linkedlst {

List <Integer> list = new LinkedList<Integer>();

public void addElements() {
	
	list.add(5);
	list.add(11);
	list.add(33);
	list.add(23);
	list.add(33);
	list.add(23);
	list.set(3, null);
	list.remove(3);
	list.add(55);
	System.out.println(list.get(3));
	System.out.println(list);
	((LinkedList<Integer>) list).addFirst(33);
	
	((LinkedList<Integer>) list).addLast(74);
	
	for(Integer a :list) {
	//for(int i=0;i<list.size();i++) 
		
	//	System.out.println(list.get(i));
		System.out.println(a);
	}
	
}

public static void main(String[] args) {
	
	linkedlst ll = new linkedlst();
	ll.addElements();
	
}

}


