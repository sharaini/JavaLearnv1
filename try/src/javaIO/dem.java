package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class dem {
	public void example(){
		File[] files={
			new File("C:\\Users\\Sharath\\Downloads\\1.dat"),
			new File("C:\\Users\\Sharath\\Downloads\\2.dat"),
			new File("C:\\Users\\Sharath\\Downloads\\3.dat")
		};
		zipIt(files);
		//unzipIt();	
		user us=new user();
		us.setId(1);
		us.setName("sharath");
		us.setPass("pass");
		try{
			FileOutputStream fout=new FileOutputStream("hser.ser");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(us);
			out.close();
			fout.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		us=null;
		try{
			FileInputStream fin = new FileInputStream("hser.ser");
			ObjectInputStream oin=new ObjectInputStream(fin);
			us=(user)oin.readObject();
			System.out.println(us.getName()+us.getPass());
			oin.close();
			fin.close();
		}
		catch(IOException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	private void unzipIt() {
		// TODO Auto-generated method stub
		try{
			String zipFile="C:\\Users\\Sharath\\Downloads\\zipsh.zip";
			byte[] buf=new byte[1024];
			FileInputStream fin=new FileInputStream(new File("C:\\Users\\Sharath\\Downloads\\1.dat"));
			ZipInputStream zin=new ZipInputStream(fin);
			int c;
			while((c=fin.read())!=-1){
				System.out.print((char)c);
			}
		}
		catch(IOException e){
			
		}
	}
	public static void zipIt(File[] files){
		try{
			String zipFile="C:\\Users\\Sharath\\Downloads\\zipsh.zip";
			byte[] buf=new byte[1024];
			FileOutputStream fout=new FileOutputStream(zipFile);
			ZipOutputStream zout=new ZipOutputStream(fout);
			for(File file:files){
				System.out.println("Adding"+file);
				FileInputStream fin= new FileInputStream(file);
				zout.putNextEntry(new ZipEntry(file.getName()));
				int length;
				while((length=fin.read(buf))>0){
					zout.write(buf,0,length);
				}
				zout.closeEntry();
				fin.close();
			}
			zout.close();
			System.out.println("zip file has been created");
		}
		catch(IOException e){
			System.out.println("IOException"+e);
		}
	}
}
