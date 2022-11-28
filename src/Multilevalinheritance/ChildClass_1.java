package Multilevalinheritance;

public class ChildClass_1 extends ParentClass {
public static void m4() {
		
		System.out.println("public static method");
		
		
	}
	
	void m6() {
		System.out.println("default method 6");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass_1 j = new ChildClass_1();
j.m6();
m4();
j.m1();
j.m2();
j.m3();
j.m6();
m5();

	}

}
