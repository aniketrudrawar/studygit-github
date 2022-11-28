package Hierarchicalinheritance;

public class ChildClass_1 extends ParentClass {
	
public static void m4() {
		
		System.out.println("public static method");
		
		
	}
	
	void m6() {
		System.out.println("default method 6");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass_1 l = new ChildClass_1();
		
		l.m1();
		l.m2();
		l.m3();
		m4();
		m5();
		l.m6();

	}

}
