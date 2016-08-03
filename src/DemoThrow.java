


public class DemoThrow {
	static void demo(){
		try
		{
			throw new
			NullPointerException("my data");
		}
		catch (NullPointerException ne )
		{
			System.out.println(ne);
		}
	}
public static void main(String args[])
{
	demo();
}
}
