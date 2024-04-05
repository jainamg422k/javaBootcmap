package multithread;

public class Multithreaded extends Thread {

	public static void main(String[] args) {
		Multithreaded mt  = new  Multithreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();
	     Multithreaded mt1  = new  Multithreaded();
	     mt1.setPriority(MIN_PRIORITY);
	     mt1.setName("mt1");
	     mt1.start();
	    /*
		for(int j =1 ; j<= 200 ; j++) {
    		System.out.print("j"+ " "+ j + "\t");
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child Thread Existing ");				
			}
    	}
*/
	}
	   public void run() {
		   System.out.println("Thread Name:" + Thread.currentThread().getName());
		
		/*  
	    	for(int i =1 ; i<= 200 ; i++) {
	    		System.out.print("i"+" "+ i + "\t");
	    	}
	        try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
               System.out.println("Child Thread Existing ");				
			}	
			*/
	    }
	    

}
