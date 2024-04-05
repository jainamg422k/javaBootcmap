package OtStream;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadeandWriterDemo {

	public static void main(String[] args)  throws Exception{
       FileReader fr = null;
       FileWriter fw = null;
       fr = new FileReader("D:/myfile.txt");
       fw = new FileWriter("D:/newMyfile.txt");
       
       int ch;
       while((ch=fr.read())!=-1) {
        fw.write(ch);   	   
       }
       fr.close();
       fw.close();
	}

}
