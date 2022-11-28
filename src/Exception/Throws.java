package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
	
	
	public static void m1() throws InterruptedException {//compile time exception
		
		for(int a=1;a<10;a++) {
			Thread.sleep(2000);
			System.out.println(a);
		}
	}
		public static void getdata() throws FileNotFoundException {//compile time exception
			FileInputStream file = new FileInputStream("c:\\lenovo\\file\\sk.xles");
		}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		m1();
		
		

	}

}
