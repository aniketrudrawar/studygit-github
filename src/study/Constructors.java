package study;

public class Constructors {//iused for initialize object
	
	 Constructors() {//non parameter constructor/non arguments/ zero constructor
		System.out.println("no parameter");
	}
	
	
    Constructors(int a) {//parameterized constructor
    	System.out.println("one parameter");////constructor can be overloaded
    	System.out.println(a);//ouput is the value of a which is initialize in main method
	}
    
    Constructors(int a, int b, int c){
    	System.out.println("three parameter");
    }

 Constructors(int a, int b){
	 System.out.println("two parameter");
    }
	public static void main(String[] args) {//with the help of new keyword we are called the constructors
		// TODO Auto-generated method stub
		
		new Constructors();//calling default constructor
		new Constructors(10);//calling parameterized constructor
		new Constructors(10,20,30);
		new Constructors(10,20);
	}

}
//we can't declare constructor as a "final"
//we can't declare constructor as a" static"
//we can "overload" the constructor.
//we can't "override" constructor because class name is same as the constructor name if we do then both classes are duplicates'
//we can give "access modifiers" to constructors or declares with access modifiers