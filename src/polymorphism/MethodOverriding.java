package polymorphism;

public class MethodOverriding extends MethodOverloading {
	
//public static void m1() {
//		
//		System.out.println("static method 11");
//	}
//	
//public static void m1(int a) {
//		
//		System.out.println("static method 21");
//	}
//
//public static void m1(int a,int b) {
//	
//	System.out.println("static method 31");
//}
//
//
//
public void m2() {
	
	System.out.println("non static method 11");
}
//
//public void m2(int a) {
//	
//	System.out.println("non static method 21");
//}
//
//public  void m2(int a,int b) {
//	
//	System.out.println("non static method 31");
//}
//
////final static void m1(int a,int b,int c) {
//	
//	//System.out.println("Static final method 1");
//	
////}
//
////final  void m2(int a,int b,int c) {
//	//System.out.println("non static final method 1");
//	//}
////final void m3() {
//	
//	//System.out.println("non static final method 31");
////}
//



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodOverriding p = new MethodOverriding()	;
		
		//p.m2();
		//p.m2(10);
		//p.m2(10, 20);
		//p.m2(10, 20, 30);
		//p.m3();

;
		
//MethodOverloading q = new MethodOverloading();
//
//q.m2();
//q.m2(10);
//q.m2(10, 20);
//q.m2(10, 20, 30);
//q.m3();
//m1();
//		m1(10,20);
//		m1(10,20,30);
//		m1(10);

MethodOverloading r = new MethodOverriding();

r.m2();
//r.m2(10);
//r.m2(10, 20);
//r.m2(10, 20, 30);
//r.m3();
//m1();
//m1(10,20);
//m1(10,20,30);
//m1(10);

//MethodOverriding s = (MethodOverriding) new MethodOverloading();
//
//s.m2();
//s.m2(10);
//s.m2(10, 20);
//s.m2(10, 20, 30);
//s.m3();
//m1();
//m1(10,20);
//m1(10,20,30);
//m1(10);




	}

}
