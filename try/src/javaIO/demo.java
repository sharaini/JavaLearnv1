package javaIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

/**
 * nio for high performance 
 * 
 * channels
 * java nio channels input stream prod 1b of data and output stream prod 1b of data
 * io stream-block orien inp out consu block of data
 * ch-read and write async read and write from buffer
 * use bytebuffer to read and write from channel
 * @author Sharath
 *
 */
public class demo {
	public void example(){
		//path is prog rep of path in file system
		Path path=Paths.get("C:\\Users\\Sharath\\Downloads","sharath.txt");
		//get an instance of seekable byte channel using newByteChannel
		try(SeekableByteChannel sekbchnl=Files.newByteChannel(path, EnumSet.of(StandardOpenOption.READ))){
			//new bytechanneel need a path and how to open in using std enumset.of
			ByteBuffer buf = ByteBuffer.allocate(12);
			//buffer of 12 bytes
			String encoding=System.getProperty("file.encoding");
			//get the system file encoding
			buf.clear();
			//get ready for new sequence
			while(sekbchnl.read(buf)>0){
				//read from channel to the buffer
				buf.flip();
				//get ready for new seq chan read or get op
				System.out.print(Charset.forName(encoding).decode(buf));
				//decodes buf to uni char
				buf.clear();
			}
			
		}
		catch(IOException e){
			System.err.println(e);
		}
		//truncate
		//write uses write option
		try(SeekableByteChannel seekableByteChannel = Files.newByteChannel(path, EnumSet.of(StandardOpenOption.WRITE,StandardOpenOption.TRUNCATE_EXISTING))){
			ByteBuffer bug=ByteBuffer.wrap("sharath hello".getBytes());
			int write=seekableByteChannel.write(bug);
			System.out.println("Number of written bytes:"+write);
			bug.clear();
		}
		catch(IOException e){
			
		}
	}
}
