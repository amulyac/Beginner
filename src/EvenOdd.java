import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
    int x;
    System.out.println("enter integer to check even or odd");
    Scanner in = new Scanner(System.in);
    x = in.nextInt();

//if the number is divisible by 2 then number is even
//there is another logic [if((c/2)*2==c)]
    if(x%2==0){
	System.out.println("even ");
    }else{
     System.out.println("odd");
     }
	 }

     }
