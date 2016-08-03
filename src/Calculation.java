
public class Calculation {
	int z;
	public void addtion(int x,int y){
		z=x+y;
		System.out.println("the sum of the given number:"+z);
	}
public void substraction(int x,int y){
	z=x-y;
	System.out.println("the difference b/w the  given number:"+z);
}
}
//super class reference can hold the members of subclass but it can access only super class members
//to access both class members we have to create referance variable to sub class

//ex;

//Calculation cal= new My_Calculation
//demo.add(a,b);
//demo.sutraction(a,b);

// here we can not call multiplication method

//sub class automatically acquires the default constructor of the super class
// if we want to call parametrized of the super class we need to use the key word super

//ex: super(value)
