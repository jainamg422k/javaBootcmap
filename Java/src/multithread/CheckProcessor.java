package multithread;

public class CheckProcessor{

	public static void main(String[] args) {
     MyThread t =  new MyThread();
     
      t.start();
      
      for (int i = 1 ; i<=10 ; i++) {
		   System.out.println("Main Thread");
		   Thread.yield();
	  }
	}
	

}
