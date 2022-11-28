package polymorphism;

public class MethodOverloading {
	
	
	public static void m1() {
	
	System.out.println("static method 1");
	}
	
public static void m1(int a) {
		
		System.out.println("static method 2");
	}

public static void m1(int a,int b) {
	
	System.out.println("static method 3");
}


public void m2() {
	
	System.out.println("non static method 1");
}

public void m2(int a) {
	
	System.out.println("non static method 2");
}

public  void m2(int a,int b) {
	
	System.out.println("non static method 3");
}

final static void m1(int a,int b,int c) {
	
	System.out.println("Static final method");
	
}

final  void m2(int a,int b,int c) {
	System.out.println("non static final method");
	}

final void m3() {
	
	System.out.println("non static final method 3");
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading t = new MethodOverloading();
		
		t.m2();
		t.m2(10);
		t.m2(10, 20);
		t.m2(10, 20, 30);
		t.m3();
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30);

	}

}
