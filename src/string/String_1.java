package string;

public class String_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a =new String("Aniket");//String literal stored in SCP
	
	//String a = new String("Yogesh");//String new keyword method stored in HEAP
	
	//due to string is immutable we can't give different values to same variables-but this is not exact definition
 
 //a.concat("rudrawar");// due to string immutabillity we can't concat the string
 
 //if we given as per below then jvm stored old value in garbage colllector and take new variable value and stored that
	
// a= a.concat("rudrawar");//then print output Aniketrudrwar //this is immutabillity in string and in stringBuffer and StringBuilder by 'append' method we can directly do due to mutabillity

	
	 String b =new String("aniket");
	 String c =new String("Yogesh");
	System.out.println(a.length());//give lenghth of string with including space and take by regular no.
	System.out.println(a.indexOf('n'));//give index number of specific character
	System.out.println(a.equals(b));//give equallity of two strings but nees all lowercase and uppercase letters same
	System.out.println(a.equalsIgnoreCase(b));//also show equality but it has no impact of uppercase and lowercase letters
	System.out.println(a.concat(c));//it will add a to c gives output ac
	System.out.println(a.toLowerCase());//convert all letters in small letters
	System.out.println(a.toUpperCase());//convert all letters in upprrcase or capital letters
	System.out.println(a.charAt(3));//gives character of specific index no.
	System.out.println(a.replace('k', 'm'));//replace specific character in string to other external character
	System.out.println(a.isEmpty());//show string is empty or not by boolean
	
	
	}

	
}
