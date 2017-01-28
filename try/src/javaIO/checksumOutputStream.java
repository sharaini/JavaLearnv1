package javaIO;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Checksum;

public class checksumOutputStream extends FilterOutputStream{
	private Checksum cksum;
	public checksumOutputStream(OutputStream out,Checksum sum){
		super(out);
		this.cksum=cksum;
	}
	public void write(int b) throws IOException{
		out.write(b);
		cksum.update(b);
	}
	public void write(byte[] b)throws IOException{
		out.write(b,0,b.length);
		cksum.update(b,0,b.length);
	}
	public void write(byte[] b,int off,int len) throws IOException{
		out.write(b,off,len);
		cksum.update(b,off,len);
	}
	public Checksum getChecksum(){
		return cksum;
	}
}
