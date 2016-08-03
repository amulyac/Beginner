import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdJa {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("please enter a char");
		 char ch=(char)br.read();
             if(Character.isDigit(ch)){
	               System.out.println("it is a Digit");

                      }else if(Character.isUpperCase(ch)){
	                       System.out.println("it is capital");
                           }else if(Character.isLowerCase(ch)){
	                         System.out.println("it is lower");
                              }else if(Character.isSpaceChar(ch)){
	                            System.out.println("it is  coming from spacebar");
                               }else if (Character.isWhitespace(ch)){
	                             System.out.println("it is comming from enter tab");
                               }else{
	                              System.out.println("sorry ,i don't know that character");
                               }
	
	                         }

}
//TYPE CASTING:

// converting one data type into another data type;
// 2 types of casting

//  1* Primitive Casting: Methods are not available to act on primitive data types

// ex: byte, short,int, long,float,double,char,string,boolen
//   two types of primitive data types

// WIDENING :  converting lower data type into  higher data type
// ex:

//    char ch = 'B' // i have declared character
//     int n= (int)ch;
//     int n=12;
//     float x=(float)n;
	
// NARROWING: converting higher data type into lower data type
// ex:

//     int n= 65;
//     char ch= (char)n;
//     double d=12.1234;
//      int i=(int)d;


//  2* Advanced Casting: methods are available to on advanced data types
// ex: Integer,String, Float,Double

// Wrapper Classes:
//Wrapper class is a class that contains primitive type data type all.


