package interfaces;

public class Runner extends Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementation h = new Implementation();
		//Implementation h = new Runner();
		Runner h = new Runner();//no issue if we create child class, parent class or upcasting for all  output is same
		//Runner h = (Runner) new Implementation();//need to casting if taken firstly child class and right side parent class
		// and given classcastexception, that's why downcastong is not possible
		h.m1();
		h.m10();
		h.m11();
		h.m4();
		h.m7();
		h.m8();
		System.out.println(a);
		Interface_1.m5();//for calling static method for interface need to give class name.method name
		Interface_1.m6();//for calling static method for interface need to give class name.method name

	}

}
