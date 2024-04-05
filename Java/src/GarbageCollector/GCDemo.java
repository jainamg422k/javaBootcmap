package GarbageCollector;

public class GCDemo {
	
	int objId;
  GCDemo( int objId){
	  System.out.println(this + "Created");
  }
	public static void main(String[] args) {
	for(int i =1 ; i<=50000; i++) {
		new GCDemo(i);
	}
     
  	}
protected void finalize() {
	System.out.println(this + "Finalized");
}
}
                             