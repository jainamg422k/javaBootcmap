package interrupt;

public class MyThread  extends Thread{
  public void run() {
	
	  try {
		  for(int i = 1 ; i<= 10 ; i ++) {
		  System.out.println("I am lazy thread");
		 MyThread.sleep(1000);
		  }
	} catch (InterruptedException e) {
		 System.out.println("Got interruppted");
	}
  }
  
}
