package study;

public class Methods {
	
	
	public void m1() {//non-static method
		
		char c = 'h';
		
		System.out.println(c);
	}
	
	public static void m2() {//static method
		
		boolean d = true;
		
		System.out.println(d);
	}

	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
Methods j = new Methods();//object reated for calling non static method
j.m1();//call non static method with the help of object
m2();//we can call it with or without object because this is static 
	}

}
