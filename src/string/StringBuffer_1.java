package string;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer j = new StringBuffer(" ");
		StringBuffer h = new StringBuffer("yogesh");
		
		System.out.println(j.reverse());//gives reverse word "aniket"-"tekina"
		System.out.println(j.append("rudrawar"));//same as concat in string
		System.out.println(j.charAt(5));
		System.out.println(j.capacity());//16+given letters length
		System.out.println(j.equals(h));
		
		
		
	}

}
