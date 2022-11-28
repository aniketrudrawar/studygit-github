package collections;


import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet h = new TreeSet();
		
		h.add("yogesh");
		//h.add(100);
		h.add("aniket");
		h.add("babu");
	//	h.add(null);//gives null pointer exception
		h.add("rushi");
		//h.add(102.33f);//given classcastexception
		//h.add(" ");//given classcastexception
		//h.clear();//for deleting all output
		
		
		for(Object m : h) {
			System.out.println(m);
		}

	}

}
//it don't allow duplicate and null element'
//if we enter null element here then it gives nullpointerexception
//if we enter duplicates then we get only one time output
//if we add float or emplty elements then it gives classcastexception
//it not maintain insertion order instead of that it follow ascending order
//it takes only similar(primitive and non-primitive) data type at one time only and gives ascending or alphabetical order output