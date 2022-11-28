package Hierarchicalinheritance;

public class ChildClass_2 extends ParentClass {
public void m7() {
		
		System.out.println("public method 7");
	}
	
	void m8() {
		
		System.out.println("default  method 8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass_2 m = new ChildClass_2();
		
		m.m1();
		m.m2();
		m.m3();
		m.m7();
		m.m8();
		m5();
		

	}

}
//in hierarchical we call parent class properties in different child class with the help of child class objects.

//here also "private" members can not called/.