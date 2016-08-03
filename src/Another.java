//If you wish to call static method of another class then you have to write 
//class name while calling static method as shown in example below.

import java.lang.Math;
public class Another {

	public static void main(String[] args) {
int result;
result = Math.min(10,20); //calling static method min  by writing class name

System.out.println(result);
System.out.println(Math.max(100,200));
	}

}
