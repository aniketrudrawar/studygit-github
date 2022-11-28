package Study_1;

import study.Modifier_1;

public class Modifier_3 extends Modifier_1{//make child class object for extends

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier_3 a = new Modifier_3();
		
		a.m1();
		a.m3();//for protected members access need to first inherit class by extends keyword and after that create object for child class then call
		

	}

}
