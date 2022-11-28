package interfaces;

public  class Implementation implements Interface_1,Interface_2{

	@Override
	public void m10() {
		System.out.println("abstract method 1");
		
	}

	@Override
	public void m11() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 4");
	}
	
//	public static void main(String[] args) {
//		
//		Implementation h = new Implementation();
//		
//		h.m1();
//		h.m10();
//		h.m11();
//		h.m4();
//		h.m7();
//		h.m8();
//		System.out.println(a);
//		Interface_1.m5();//for calling static methpod for interface need to give class name.method name
//		Interface_1.m6();//for calling static methpod for interface need to give class name.method name
//		
		
	//}

}

//we can implements interface to abstract class
//here also need to unimplement both classes 
//for class - class = extends, interface-interface = extends, interface-class= implements class- interface= not possible