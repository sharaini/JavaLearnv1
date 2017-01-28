package javaIO;
import java.io.*;
/**
 * stream to write to read from device,files and networks
 * Binrystream to handle binary data and CharacterStream to handle character data
 * inputstream and outputstream higher interface to handle binary streams
 * reader and writer to handle charstream
 * buffered reader and writer to imporove
 * @author Sharath
 *
 */
public class bfrdinop {
	
	public void example(){
		long startTime=System.currentTimeMillis();
		System.out.println("Time taken for reading and writing ");
		
	}
	public static void readWrite(String fileFrom,String fileTo)throws IOException{
		InputStream in=null;
		OutputStream out=null;
		try{
			in=new FileInputStream(fileFrom);
			out=new FileOutputStream(fileTo);
			while(true){
				int bytedata=in.read();
				if(bytedata==-1)break;
				out.write(bytedata);
			}
		}finally{
			if(in!=null)in.close();
			if(out!=null)out.close();
		}
	}
	public static void readWriteBuffer(String fileFrom,String fileTo)throws IOException{
		InputStream inBuffer=null;
		OutputStream outBuffer=null;
		try{
			InputStream in=new FileInputStream(fileFrom);
			inBuffer = new BufferedInputStream(in);
			OutputStream out=new FileOutputStream(fileTo);
			outBuffer = new BufferedOutputStream(out);
			while(true){
				int bytedata=inBuffer.read();
				if(bytedata==-1)break;
				outBuffer.write(bytedata);
			}
		}finally{
			if(inBuffer!=null)inBuffer.close();
			if(outBuffer!=null)outBuffer.close();
		}
	}
	
}
