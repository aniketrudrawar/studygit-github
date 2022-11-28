package casting;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		long b =a; //widening type casting orimplicit type casting or casting down
		//here we convert lower data type to higher data type//it is safe and data is not ,issed
		
		
		double c=160.99;
		
		long e = (long) c;//narrowing type casting or explicit type casting or casting up
   // here we convert higher data type to lower data type, here some times data will be missed
	
	int f = (int)e;
	
	System.out.println(b);
	System.out.println(f);
	}

}
