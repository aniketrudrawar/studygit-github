package abstraction;

public abstract class Abstr {
	
	Abstr(){
		System.out.println("constructor");
	}
	
	public abstract void m1();
	
	//private abstract void m2();
	
	abstract void m3();
	protected abstract void m4();
	
	public  void m5() {
		System.out.println("regular method m5");
		
	}
	
	private void m6() {
		System.out.println("private method m6");
	}
	
	protected void m7() {
		System.out.println("protected method m7");
	}
	
	 void m8() {
		System.out.println("default method m8");
	}
	 
	 final void m9() {
		 
		 System.out.println("final method");
		 
	 }
	
	public static void main(String[] args) {
		
		//Abstr j = new Abstr();
		System.out.println("main method");
		

	}

}

//we can not create abstract method as a private.
//we can create abstract method as a public,protected and default
//we cannot take same name of abstract and regular methods
//we can create all types (with all access modifiers)of regular methods under the abstract class
//we cannot give final and static keyword to abstract method
//we can write regular method with final and static keyword under the abstract class
//we can  create constructor under the abstract class
//we can not given to abstract,final and static keywords to constructor
//we cannot instantiate abstract class(means we cannot create object under abstract class)