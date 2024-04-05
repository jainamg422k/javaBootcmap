/**
 * 
 */
package exceotion;

/**
 * @author rusha
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws CheckedException 
	 */
	public static void main(String[] args) throws CheckedException {
		// TODO Auto-generated method stub
      //  throw new UncheckedCustomException("Bussines Exception Occured");
         throw new CheckedException("Bussines Exception Occured");
	}

}
