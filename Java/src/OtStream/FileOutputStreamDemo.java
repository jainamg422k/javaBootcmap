package OtStream;
import java.io.*;

import IOStream.FileInputStreamDemo;
public class FileOutputStreamDemo {
   public static void main (String []args) throws IOException {
	   FileInputStream fis =null ;
	   FileOutputStream fos = null;
	   try {
	   fis = new FileInputStream("D:/myFile.txt");
	   fos = new FileOutputStream("D:/newFile.txt");
	    int data ;
	    while((data=fis.read())!= -1) {
	    	fos.write(data);
	    }
	   }catch(FileNotFoundException e){
		   e.printStackTrace();
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		fis.close();
		fos.close();
	}
	   
   }
}
