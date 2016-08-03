
public class Exception {

	public static void main(String[] args) {
		System.out.println("open the files");
		try
		{
			int n = args.length;
			System.out.println("no.of args are ="+n);
			int a= 45/n;
			System.out.println("the value of a is ="+a);
		}
		catch(ArithmeticException  ae){
			System.out.println(ae);
		}
		finally
		{
			System.out.println("close the files");
		}
	}

}
