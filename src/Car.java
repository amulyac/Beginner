// If we use abstract key word before the class name then that class is called 
//abstract class
//abstract class contains abstract methods as well as concrete methods 
//If abstract class contains abstract methods  we should write the body for that
//methods using a class called subclass
// if we are not writing body for any one method that sub class also 
//will become abstract class.
//again we should write the body for in its subclass
//we can not create an object for abstract class
//we can create reference to abstract class
//an abstract class contains any no.of subclasses
//a class can not be both abstract and final



 public abstract class Car {
	 int regnum;
	 Car(int regnum){
		 this.regnum = regnum;
	 }
void fillTank(){
	System.out.println("filltank");
}
abstract void steering(int direction);
abstract void breaking(int force);
}
