package study;

public class Modifier_1 {
	
	public void m1() {//it access to all pacakage and classes which are present in project
		
		int a =10;
		System.out.println(a);
	}
	
	void m2() {//it accessed only in same packege not outside the package
		int b =20;
		System.out.println(b);
	}
	
	protected void m3() {//it accessed in same package and if we inherit with extends keyword that class to another packege class and create child class object then we can accessed that
		
		int c =10;
		System.out.println(c);
	}
	
   private void m4() {//it accessed in same class not in other classes of same package and not in other package also
		
		int d =10;
		System.out.println(d);
	}

	public static void main(String[] args) {
		

	}

}
