package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;

public class ownIO {
	public void example(){
		Adler32 outChecker = new Adler32();
		CheckedOutputStream out =null;
		String content = "hey";
		try{
			out=new CheckedOutputStream(new FileOutputStream("C:\\Users\\Sharath\\Downloads\\aCheckSumFile.dat"),outChecker);
		    byte[] contentInBytes = content.getBytes();
		    out.write(contentInBytes);
		    System.out.println("Done");
		    System.out.println("Output stream check sum"+outChecker.getValue());
		    out.flush();
		    out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
