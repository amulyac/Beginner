import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
int marksgained,passingmarks;
char grade;

 Scanner input = new Scanner(System.in);
 System.out.println("input marks scored by you");
 marksgained = input.nextInt(); 
// in this case we need to give marksgained at run time
//marksgained=98;
passingmarks=40;
//System.out.println("please enter the marks");
if(marksgained>=passingmarks){
	if(marksgained>90)
		grade ='A';
	else if(marksgained>75)
		grade = 'B';
	else if (marksgained>60)
		grade = 'C';
	else
		grade = 'D';
	System.out.println("you passed in the exam and your grade is"+ grade);
	
}
else{
	grade = 'F';
	System.out.println("you failed and your grade is" + grade);
}
	}

}
