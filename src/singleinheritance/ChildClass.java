package singleinheritance;

public class ChildClass extends ParentClass{
	
	public static void m4() {
		
		System.out.println("public static method");
		
		
	}
	
	void m6() {
		System.out.println("default method 6");
	}

	public static void main(String[] args) {
		
		ChildClass g = new ChildClass();
		
		g.m1();
		g.m2();
		g.m3();
		g.m6();
		m4();
		m5();

	}

}
//if we give final keyword and static keyword for parent class methods and if we inherite them we can call them in subclass with the subclass object
//all acess modifiers methods or members we can inherite ec=xcept "private"