package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet h = new LinkedHashSet();
		
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
//insertion order  maintained in that.