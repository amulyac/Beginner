import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SwitchDemo {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("C:\\Users\\amulya\\workspace\\Module 11\\src\\Config.properties");
// loading the file
		prop.load(input);
		prop.getProperty("url");
	   int Driver = 0; 
       String DriverString= prop.getProperty("Browser");
       String DriverString1= prop.getProperty("username");
       String DriverString2= prop.getProperty("password");
      /* switch(Driver){
       case 1: DriverString = "IE";
               break;
       case 2: DriverString = "Firefox";
               break;
       case 3: DriverString = "Chrome";
               break;
       case 4: DriverString = "Safari";
               break;
       default: DriverString = "no driver detected";
                break;
       }*/
       System.out.println(DriverString);
       System.out.println(DriverString1);
       System.out.println(DriverString2);
	}

}
