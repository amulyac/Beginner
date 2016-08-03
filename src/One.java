// Overriding

//same method with same no.of parameters in both superclass and subclass 
// then it is called method overriding
//if the super class method is public the overriding method in the sub class
// can not be either private or protected
//instance methods can be overridden  only if they inherited by the sub class
//final method can not be overridden
//a method declared as static it can not be overridden but it can be re-declared
public class One {
	void Calculate(double x){
		System.out.println("square=" +(x*x));
		
		
	}

}
