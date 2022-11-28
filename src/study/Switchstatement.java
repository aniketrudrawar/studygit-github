package study;

public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =3;
		
		switch (a) {//a=variable and 1,2,3,4,5,6 are the values of variables
		case 1: System.out.println("jan");//if case 1 is true then print this statement
		break;
		case 2: System.out.println("feb");//if case 1 is false and 2 is true then print this statement
		break;
		case 3: System.out.println("mar");//if case 1,2 is false and 3 is true then print this statement
		break;
		case 4: System.out.println("apr");//if case 1,2,3 is false and 4 is true then print this statement
		break;
		case 5: System.out.println("may");//if case 1,2,3,4 is false and 5 is true then print this statement
		break;
		case 6: System.out.println("jun");//if case 1,2,3,4,5 is false and 6 is true then print this statement
		break;
		default: System.out.println("wrong input");//if all cases are false then print default statement
		}

	}

}
//if we didn't use break statement here then after compiler find true statement then compiler print this statement and all other next statement as it is, he will not check that rae true or false directly printed these statements that's why we use break statement here.'