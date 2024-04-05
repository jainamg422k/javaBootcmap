package OtStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
         FileReader fr = null;
         BufferedReader br = null;
         int count =0;
          try {
			fr = new FileReader("D:/myfile.txt");
			 br = new BufferedReader(fr);
			 
			 String line ;
			 while ((line=br.readLine())!= null) {
				 StringTokenizer st = new StringTokenizer(line);
				 
				 while(st.hasMoreTokens()) {
				 System.out.println(st.nextToken());
				 count++;
				 }
				
			 }
			 System.out.println("count"+ count);
			
		} catch (FileNotFoundException e) {
    		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
	}

}
