package Exception;

public class Try_Catch_Final {
	
	
	public static void main(String[] args) {//Arithmeticexception
		int a =100;
		int b=0;
		
		int c[]= {10,20,30,40};
		
		
		try {
		System.out.println(a/b);
		System.out.println(c[4]);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("last index of array must be(size of array -1)");
			}
		finally {
			System.out.println("finally called");
			System.out.println(a);
		}
		
		}
	}


