import java.util.Scanner;

public class Nmultiplicationtable {

	public static void main(String[] args) {
int a,b,c,d;
System.out.println("enter range of number to print teir multication table ");
Scanner in = new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
for (c=a;c<=b;c++){
	System.out.println("multiplication table of "+c);
	for (d=1;d<=10;d++){
		System.out.println(c+"*"+d+"="+(c*d));
	}
}

	}

}
