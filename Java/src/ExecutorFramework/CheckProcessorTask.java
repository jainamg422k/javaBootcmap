package ExecutorFramework;

import java.security.Provider.Service;

public class CheckProcessorTask implements Runnable {
    String name ;
    public CheckProcessorTask( String name) {
    	this.name = name ;
    }
	@Override
	public void run() {
		 
    System.out.println(name + "Check processor has been began processing the check" + Thread.currentThread().getName());
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		System.out.println("ALl good");
	}
    System.out.println(name + "Check processor has been began processing the check" + Thread.currentThread().getName());
	}

	
}

