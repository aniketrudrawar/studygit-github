package Keywords;

public class Super_1 extends This {
	
int a = 30;
	
	public  void m1() {
		 int a =40;
		
		
		System.out.println(super.a);
	}
	
	 void m1(int a) {
		
		this.m1();
	}
	 
	// void m1(int a,int b) {
		 //this.m1(5);
		// this.m1();
	// }
	
	public  Super_1() {
		super();
		System.out.println("constructor 3");
	}
	
	public Super_1(int a) {
		super(10);
		System.out.println("constructor 4");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_1 j = new Super_1();
		
		j.m1();
		new Super_1(10);

	}

}
//if we written super,a in child class method then it is used to call parent class instance variable
//super keyword also we can't use in static members
//non paremeterized constructors are called directly called in super also need extends keyword
//it is used to call parent class variables, methods and constructor if also we create child class object