package synchronizedmethods;

public class SynchronizatonDemo {

	public static void main(String[] args) {
        DisplayMessage  dm = new DisplayMessage();
        MyThread t2 = new MyThread(dm, "rock");
        MyThread t1 = new  MyThread(dm , "steve");
     
        t2.start();
        t1.start();
       
	}

}
