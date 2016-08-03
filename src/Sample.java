// overloading
// same method with different parameters in the same class
//then it is called  method overloading
public class Sample {
	void add(int a , int b){
		System.out.println("sum of two=" +(a+b));
		
	}
void add(int a, int b, int c){
	int d=a+b+c;
	System.out.println("sum of three=" +d);
}
}
