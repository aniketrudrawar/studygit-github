package interfaces;

public interface Interface_1 {
	
	public static final int a=10;//we can declare public static final variable under interface
	
	
	
	public  abstract void m1();
	
	//protected abstract void m2();
	
	//private abstract void m3();
	
	abstract void m4();
	
	public static void m5() {
		System.out.println("regular method m5");
	}
	static void m6() {
		System.out.println("regular method m6");
	}
	
	default  void m7() {
		System.out.println("regular method m7");
	}
	
	public default void  m8() {
		System.out.println("regular method m8");
		
	}
	
	//Interface_1(){//interfaces can not have constructor
		
	//}
	
	//final void m9() {
		
	//}
	
	public static void main(String[] args) {
		//Interface_1 j = new Interface_1();
	}
	
	
}


//we can't instantiate menas can't create object in interface
//we can't declare final regular method under the interface
//we can't given FINAL and STATIC keyword for abstract method in interface
//we can not give default and static keyword at one time
//we cannot declare abstract method as protected and private in interface.
//we can not declare regular method with all access modifiers under the interfaces and we can declare public and default method only but need to give STATIC and DEFAULT keyword there.
