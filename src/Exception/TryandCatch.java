package Exception;

public class TryandCatch {
	
	
	

	public static void main(String[] args) {//ArrayIndexOfBoundsException
		// TODO Auto-generated method stub
		int i =100;
		int a[]= {10,20,30,30};
		
		try {
		System.out.println(a[4]);
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("last index of array must be(size of array -1)");
		}
		
		System.out.println(i);

	}

}
