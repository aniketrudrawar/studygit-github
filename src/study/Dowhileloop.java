package study;

public class Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =0;//initialize variable
		
		do {
//if (a==5) {
				
				//continue;
			//}
			
			
			System.out.println(a);//printing statement under the body
			a++;//updatation under the body
		}while(a>=10);//for wrong condition also loop run at once and while with given after th do body{}

	}

}
//if we used continue in do while then do while not printed all other executions after the continue variable values

//if we give continue statement just below the syso and above the a++ then output is shown only continue variable @ infinite times