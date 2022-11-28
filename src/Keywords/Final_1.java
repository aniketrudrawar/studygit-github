package Keywords;

public   class Final_1 {
final  int a =20;


 //final Final_1(){
	
//}
  public    void m1() {
	  int a=30;
		 System.out.println(this.a);

	  
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Final_1 j = new Final_1();

j.m1();
	}

}
//if we give class as a final then we can't inherite that class in child class
//we can't give final variable to constructor 
//if we create one local variable same as static or non static variable which is FINAL then it not affected that local variable
// we can't do final and static to abstract methods
//if both local and non static variables are final and we use this keyword then we got non static variable as a output there is no impact of final variable here
// we can't do final keyword to abstract class 
//if we create method as a private then we can't overridden method
//we can write final variable for static and non static variable and if we give final keyword to them then they can't be initialize again'