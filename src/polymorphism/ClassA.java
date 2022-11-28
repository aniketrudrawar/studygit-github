package polymorphism;

public class ClassA {
	
	protected static void m1() {
		System.out.println("static method 1");
	}
	
	public static void m1(int a) {
		System.out.println("static method 2");
	}
	
      void m2() {
		System.out.println("non static method 1");
	}
	
	   void m2(int a) {
		System.out.println("non static method 2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA h = new ClassA();
		
		h.m2();
		h.m2(10);
		
		m1();
		m1(10);

	}

}
//we can overload public,protected,default,private,final and final with static members.
//if one method is non static and one method is static then overloading is not possible
//for method overloading need both methods are static and having same method name but need different parameters
//for method overloading need both methods are non static and having same method name but need different parameters