//Instance method requires an object of its class to be created before it can be 
//called while static method doesn't require object creation.


public class Difference {

	public static void main(String[] args) {
display(); // calling without object
Difference t = new Difference();
t.show();// calling using object
	}
static void display(){
	System.out.println("programming is amazing");
}
void show(){
	System.out.println("java is awsome");
}
}
