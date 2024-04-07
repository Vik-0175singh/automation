package collection;

import java.util.HashMap;
import java.util.Map;

public class Hash {

	HashMap<Integer, String> map = new HashMap<Integer, String>();

	public void addentry() {
		map.put(1, "vikash");
		map.put(2, "vikash");
		map.put(1, "vikash");
		map.put(3, "sandy");
		map.put(4, null);
		map.put(5, null);
		map.put(null, null);
		map.put(null, "pinki");
		
		map.remove(null);
	

		System.out.println(map.size());
		
		
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println(entry.getKey());

			System.out.println(entry.getValue());
			
		}


	}

	public static void main(String[] args) {
		Hash ab = new Hash();
		ab.addentry();

	}

}
