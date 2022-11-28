package Keywords;

public class This {
	
	int a = 10;
	
	public  void m1() {
		 int a =20;
		
		
		System.out.println(this.a);
	}
	
	 void m1(int a) {
		
		this.m1();
	}
	 
	 void m1(int a,int b) {
		 //this.m1(5);
		 this.m1();
	 }
	
	public  This() {
		
		System.out.println("constructor 1");
	}
	
	public This(int a) {
		this();
		System.out.println("constructor 2");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This k = new This();
		k.m1();
		new This(25);
		k.m1(5);
		k.m1(5, 10);
		
	}

}
// we can't use this keyword in static method and we can't give constructor as a static
// in constructor for if we write this() in parameterized constructor then at time of when we call parameterized constructor then we got both parameterized and non parameterized constructor as an output
//with the help of This keyword we call instance variable if our instance variable and local variable name is same
//this keyword also used for invoking methids and constructor
// we use new keyword for calling partameterized constructor and non-parameterized constructor called directly
