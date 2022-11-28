package casting;

public class ChildClass_1 extends ParentClass_1 {
	int b=40;
	public void m2() {
		int a =50;
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass_1 g = new ChildClass_1();//upcasting or generalization or widening
		g.m1();
		System.out.println(g.b);//in that only parent class varible and methods called and if overriden then we call child class
		
		
		//ChildClass_1 h = new ParentClass_1();//shows compile time error and not possible in java
		ChildClass_1 h = (ChildClass_1) new ParentClass_1();//downcasting and it shows classcastexception in run time
		h.m1();
		h.m2();
		System.out.println(h.b);
	}

}
