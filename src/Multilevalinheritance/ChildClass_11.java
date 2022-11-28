package Multilevalinheritance;

public class ChildClass_11 extends ChildClass_1 {

	public void m7() {
		
		System.out.println("public method 7");
	}
	
	void m8() {
		
		System.out.println("default  method 8");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass_11 k = new ChildClass_11();
		
		
		k.m7();
		k.m8();
		k.m1();
		k.m2();
		k.m3();
		k.m6();
		m4();
		m5();
		}

}

//in multileval inheritance we are inherritted parentclass properties in childclass_1 and after that that childclass_1 properties to childclasss_11, lastly we can call both parentclass and childclass_1 properties in the childclass_11 with the help of his object
//here also we can call all access modifiers members except "private".
