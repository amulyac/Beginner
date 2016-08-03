//Writing variables and methods as single unit inside the class is called encapsulation
//declare variables of class as private
public class EncapTest {
	
	private String name;
	private String Idnum;
	private int age;
	
	public String getname(){
		return name;
	}
public String getIdnum(){
	return Idnum;
}
public int getage(){
	return age;
}
public void setname(String newname){
	name = newname;
}
public void setIdnum(String newIdnum){
	Idnum = newIdnum;
}
public void setage(int newage){
	age = newage;
}
}


// getters and setters are the methods which we use for 
//getters is a method it gets a private field or variable
// setters is also a method to set a new field
