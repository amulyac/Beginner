import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
    float temperature;
    Scanner in = new Scanner(System.in);
    System.out.println("enter temperature in fahrenheit");
    temperature = in.nextInt();
    //for celsius to fahrenheit T=9*T/5+32
    temperature = ((temperature-32)*5)/9;
    System.out.println("temperature in celsius=" +temperature);
	}

}
 