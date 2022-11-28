package polymorphism;

public class ClassB extends ClassA{
	
	public static void m1() {
		System.out.println("static method 12");
	}
	
	public static void m1(int a) {
		System.out.println("static method 22");
	}
	
	    void m2() {
		System.out.println("non static method 11");
	}
	
	   void m2(int a) {
		System.out.println("non static method 21");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassB h = new ClassB();//call all child class members, it inherite all properties from classa to classb due to we create child class object it only call child class members and in that if any access modifier is available in classA members it inherit in any access member of classB, instead of private.if classA member is private then fpor override it need to be private member in classB 
		
//		h.m2();
//		h.m2(10);
//		m1();
//		m1(10);
		
//		ClassA k = new ClassA();//in that if ClassA having any private member then we can't call it with the help of parent class
//		
//		k.m2();//only private we can't call another all members we can called but only non static members are called in ClassA
//		k.m2(10);
//		m1(); //static methods are called in child class with the help of parent class object
//		m1(10);
//
//
//		ClassA j = new ClassB();//up casting and method overriding 
//		j.m2(); //if method is override then it is calling child class members if not then it calls parent class members
//		j.m2(10);
//		m1();
//		m1(10);
//		
 // ClassB k = new ClassA();//this is not possible for that type creation we need downcasting 
		
		ClassB k = (ClassB) new ClassA();//downcasting and if we call members then it shows exception-java.lang.classcastexception
		
		k.m2();
		k.m2(10);
		m1();
		m1(10);
			
		
		
		}

}

