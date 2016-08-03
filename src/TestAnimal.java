
public class TestAnimal {

	public static void main(String[] args) {
//Animal  a = new Animal();
		
		// we can not create like this
		Animal a = new Camel();
		
		// we can write parent class reference equal to new child class
		
		a.eat();
		a.travel();
	}

}
