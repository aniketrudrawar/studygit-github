package collections;

import java.util.HashSet;


public class Hashset_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h = new HashSet();
		
		h.add("rahul");
		h.add(100);
		h.add("movie");
		h.add('c');
		h.add(null);
		h.add(100);
		h.add(null);
		h.add(102.33f);
		h.add(" ");
		//h.clear();//for deleting all output
		
		
		for(Object m : h) {
			System.out.println(m);
		}

	}

}
//it not allow duplicate element
//it allow only one null element
//insertion order not maintain