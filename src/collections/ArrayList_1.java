package collections;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
	ArrayList h = new ArrayList();
	
	h.add("rahul");
	h.add(100);
	h.add("movie");
	h.add('c');
	h.add(null);
	h.add(100);
	h.add(null);
	h.add(102.33f);
	h.add(" ");
	h.clear();//for deleting all output
	
	
	for(Object m : h) {
		System.out.println(m);
	}
	}

}
//here only for each loop we can use
//as per insertion order output will be printed
//we are added duplicate elements and number of null elements here and that all are printed in output