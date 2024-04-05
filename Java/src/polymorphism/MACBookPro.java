package polymorphism;

public class MACBookPro extends MACBook {
	@Override
  void start() {
	  System.out.println("Inside MacBook Pros start methods");
  }
  
  void shutdown() {
	 
   System.out.println("Inside MacBooksPros shut method");
  }
}
