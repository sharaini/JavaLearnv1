package preferences;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//property file is persistant hash table that normally store key value pairs of strings
public class propertiees {
 public void example(){
	 Properties propOut=new Properties();
	 try{
		 propOut.setProperty("database", "localhost");
		 propOut.setProperty("dbuser", "root");
		 propOut.setProperty("dbpassword", "sharath");
		 
		 propOut.store(new FileOutputStream("C:\\Users\\Sharath\\Downloads\\config.properties"),null);
		 propOut = null;
		 
		 Properties propIn = new Properties();
		 propIn.load(new FileInputStream("C:\\Users\\Sharath\\Downloads\\config.properties"));
		 
		 System.out.println("database prop"+propIn.getProperty("database"));
		 System.out.println("dbuser prop"+propIn.getProperty("dbuser"));
		 System.out.println("dbpassword prop"+propIn.getProperty("dbpassword"));
		 
	 }
	 catch(IOException ex){
		 ex.printStackTrace();
	 }
 }
}
