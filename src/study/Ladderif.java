package study;

public class Ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a =10;

if (a<20) {//condition 1
	System.out.println("a is greater than 20");// if condition 1 is true then print this statement
}

else if(a<15) {//condition 2
	System.out.println("a is greater than 15 but less than 20");// if condition 1 is false and condition 2 is true  then print this statement
}
else if(a<=10) {//condiotion 3
	System.out.println("a is less than 10");// if condition 1 is false and condition 2 is false and condition 3 is true  then print this statement
}
else {
	System.out.println("a is equal to 10");//if all conditions atre false then print this statement
}

}

}
//if compiler get any condition is true after than compiler not going to the another conditions instead of that he directly given output.