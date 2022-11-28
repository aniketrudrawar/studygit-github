package study;

public class Variables {//store the information
	
	int a=6;//instance or global variable or non-static
	static int b=10;//static variable or class variable
	
	public void m1() {
	int v=7;//local variable
	
	System.out.println(b);//call static variable under the regular method
	System.out.println(a);//call instance variable under the regular method
	System.out.println(v);//call local variable
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variables n = new Variables();//object created for instance variable

n.m1();//call non-static method with the help of object
System.out.println(n.a);//call non-static variable
System.out.println(b);//call static variable
		
	}

}
