package study;

public class Classandobject {//class name should be start with uppercase letter
	
	int a=7;
	static String b = "aniket";
	
	public void m1() {//non-static method
		
		char c = 'h';
		
		System.out.println(c);
	}
	
	public static void m2() {//static method
		
		boolean d = true;
		
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classandobject r = new Classandobject()	;//r-reference variable used for call the non-static members
		
		System.out.println(r.a);//call non-static variable
		System.out.println(b);//call static variable
		r.m1();//call non static method
		m2();//call static method

	}

}
