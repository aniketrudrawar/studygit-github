package Array_1;

public class Array_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		System.out.println(a.length);
		System.out.println(a[0]);
		
		//for(int b : a) {
			
			//System.out.println(b);
		//}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
//in array we are used for each or for loop for execution
//int a[]={10,20,30,40,50} as per that also we can write
//int a[]=variable declaration
//a[]=new int[size]=size declaration