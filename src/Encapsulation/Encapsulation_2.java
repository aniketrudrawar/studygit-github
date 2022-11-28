package Encapsulation;

public class Encapsulation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation_1 h = new Encapsulation_1();
		
		h.set(10);
		
		//h.setB(20);

		System.out.println(h.get());
		//System.out.println(h.getB());
		h.set(20);
		System.out.println(h.get());
		h.set(30);
		System.out.println(h.get());
	}

	
}
//by the help of getter and setter concept we do encapsulation by default
//or by the help of public methods we can encapsulate private methods.
//we can give different different variable values here and get output as per that