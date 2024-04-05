package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {


	public static void main(String[] args) throws IOException {
		FileInputStream  fis = null;
		try {
        
        fis = new FileInputStream(new File("D:/myFile.txt"));
        System.out.println("File is opened");
        int i ;
		 while((i=fis.read())!= -1) {
			System.out.print((char)i); 
		 }
		 
		
		}catch(FileNotFoundException e) {
			 e.fillInStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fis.close();
			System.out.println("Fileclose");
		}
	}

}
