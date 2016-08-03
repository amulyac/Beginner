
public class UseCar {

	public static void main(String[] args) {
// create objects to maruti,santro
		Maruti m = new Maruti(1234);
		Santro s = new Santro(5678);
		// create reference to car class
		Car c;
		// drive maruti
		c = m;
		// use all features of maruti
		 c.fillTank();
		 c.steering(2);
		 c.breaking(200);
		 
		 // drive Santro
		 c = s;
		 // use all features of santro
		 
		 s.fillTank();
		 s.steering(3);
		 s.breaking(300);
	}

}
