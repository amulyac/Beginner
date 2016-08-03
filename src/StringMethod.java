
public class StringMethod {

	public static void main(String[] args) {
int n;
String s = "java programming",t="",u="";
System.out.println(s);
// find length of string

n= s.length();
System.out.println("number of charecters=" +n);


// replace charecters in string
t=s.replace("java", "c++");
System.out.println(s);
System.out.println(t);
//concatinating string with another string
u= s.concat("is fun");
System.out.println(s);
System.out.println(u);
	}

}
