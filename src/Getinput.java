import java.util.Scanner;

public class Getinput {

	public static void main(String[] args) {
int a;
float b;
String s;
Scanner in = new Scanner(System.in);
System.out.println("enter the string ");
s= in.nextLine();
System.out.println("you entered string"+s);

System.out.println("enter the integer");
a= in.nextInt();
System.out.println("you entered integer"+a);

System.out.println("enter the float");
b= in.nextFloat();
System.out.println("you entered float" +b);

	}

}
