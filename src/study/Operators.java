package study;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		int c = 10;
		
	
		
		//*****Arithmetic operators*****//
		System.out.println(a+b);
		System.out.println(c-a);
		System.out.println(a*b);
		System.out.println(c/a);
		System.out.println(a%b%c);
		
		//*****Relational operators*****//
				System.out.println(a<b);
				System.out.println(b>c);
				System.out.println(a<=c);
				System.out.println(b>=a);
				System.out.println(a==c);
				System.out.println(a!=c);
		
		//*****Unary operators*****//
				System.out.println(b++ + --a);//11
				System.out.println(++a + ++b);//14
				System.out.println(c-- + ++b);//20
				System.out.println(--c - --b);//-1
				
		
				//*****Bitwise AND*****//T&T-T other false
				System.out.println(a<b & b<c);//T&T-T
				System.out.println(a<c & a>b);//T&F-F
				System.out.println(a>c & b>a);//F&T=F
				System.out.println(c>a& b>a);//F&F-F
				
				//*****Bitwise or*****//T&T-T 
				System.out.println(a<b |b<c);//T|T-T
				System.out.println(a<c |a>b);//T|F-T
				System.out.println(a>c |b>a);//F|T-T
				System.out.println(c>a|b>a);//F|F-F
				
				//*****logicaland//
				System.out.println(a<b &&b<c);//T&&T-T
				System.out.println(a<c &&a>b);// T&&F-F              does not check second condition if first condition is false
				System.out.println(a>c &&b>a);//F&&T-F
				System.out.println(c>a&&b>a);//F&&F-F
				
				//*****logical or
				System.out.println(a<b||b<c);//T||T-T
				System.out.println(a<c||a>b);//T||F-T             does not check second condition if first condition is true
				System.out.println(a>c |b>a);//F||T-T
				System.out.println(c>a||b>a);//F||F-F
				
		
		//Shift operators
				
				System.out.println(a<<2);//Left shift-a*(square of 2)
				System.out.println(16>>2);//right shift-16/(square of 2)
		
				//ternary operators
				double	y = (a==5)?61:90;
				System.out.println(y);//if condition is true then we get expression1(61)is output

				double	z = (a==10)?61:90;
				System.out.println(z);//if condition is false then we get expression 2 (90) is output
				
				//Assignment operator//
				int d=10;
				int e=20;
				System.out.println(d=e);//first operator value changes as per last stt,here d becomes e means d=20
				System.out.println(d+=e);//here d=20 and d+e=20+20=40, d=40
				System.out.println(d-=e);//here d=40 and 40-20=20,d=20
				System.out.println(e*=d);//here e=20 and d=20, 20*20=400, e=400
				System.out.println(e/=d);//here e=400 and d=20,400/20,e=20
				
		
		
		
		

	}

}
